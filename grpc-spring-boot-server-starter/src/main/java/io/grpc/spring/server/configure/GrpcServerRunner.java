package io.grpc.spring.server.configure;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;
import io.grpc.services.HealthStatusManager;
import io.grpc.spring.server.service.GrpcService;
import io.grpc.spring.server.service.RpcRegister;
import io.grpc.spring.server.service.ServiceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static io.grpc.health.v1.HealthCheckResponse.ServingStatus.SERVING;

public class GrpcServerRunner extends ApplicationObjectSupport implements CommandLineRunner, DisposableBean {
    private static final Logger logger = LoggerFactory.getLogger(GrpcServerRunner.class);
    private GrpcServerProperties  properties;
    private RpcRegister rpcRegister;
    private Server server;
    private final HealthStatusManager manager = new HealthStatusManager();

    final private static String bindServiceMethodName = "bindService";

    public GrpcServerRunner(GrpcServerProperties properties, RpcRegister rpcRegister) {
        this.properties = properties;
        this.rpcRegister = rpcRegister;
    }

    @Override
    public void run(String... args) throws Exception {
        final ServerBuilder<?> serverBuilder = ServerBuilder.forPort(properties.getPort());
        for (Object grpcService : getApplicationContext().getBeansWithAnnotation(GrpcService.class).values()) {
            GrpcService serviceAnn = AnnotationUtils.findAnnotation(grpcService.getClass(), GrpcService.class);
            Class grpcServiceOuterClass = serviceAnn.grpcServiceOuterClass();
            if(grpcServiceOuterClass == null || grpcServiceOuterClass == Void.class) {
                grpcServiceOuterClass = grpcService.getClass().getSuperclass();
            }
            String serviceName = serviceAnn.serviceName();

            String version = serviceAnn.version();

            List<Method> methods = Arrays.asList(ReflectionUtils.getAllDeclaredMethods(grpcServiceOuterClass));

            final Optional<Method> bindServiceMethod =
                    methods.stream().filter(method ->
                            bindServiceMethodName.equals(method.getName()) && 0 == method.getParameterCount()).findFirst();
            if (bindServiceMethod.isPresent()) {
                ServerServiceDefinition serviceDefinition =
                        (ServerServiceDefinition) bindServiceMethod.get().invoke(grpcService);
                serverBuilder.addService(serviceDefinition);

                final String serviceType = serviceDefinition.getServiceDescriptor().getName();
                manager.setStatus(serviceType, SERVING);

                ServiceInfo serviceInfo = new ServiceInfo(serviceType, serviceName, properties.getPort(),version);
                rpcRegister.registerRpc(serviceInfo);
                logger.info("'{}' service has been registered with {}.", serviceType, grpcService.getClass().getName());
            } else {
                throw new IllegalArgumentException(String.format("Failed to find '%s' method on class %s.\r\n" +
                        "Please make sure you've provided correct 'grpcServiceOuterClass' attribute for '%s' annotation.\r\n"
                        +
                        "It should be the protoc-generated outer class of your service.", bindServiceMethodName, grpcServiceOuterClass.getName(), GrpcService.class.getName()));
            }
        }
        addInternalService(serverBuilder);
        server = serverBuilder.build().start();
        startDaemonAwaitThread();

        logger.info("gRPC Server started, listening on port {}.", properties.getPort());
    }

    private void addInternalService(ServerBuilder<?> serverBuilder) {
        serverBuilder.addService(manager.getHealthService());
    }

    private void startDaemonAwaitThread() {
        Thread awaitThread = new Thread() {
            @Override
            public void run() {
                try {
                    GrpcServerRunner.this.server.awaitTermination();
                } catch (InterruptedException e) {
                    logger.error("gRPC server stopped.", e);
                }
            }

        };
        awaitThread.setDaemon(false);
        awaitThread.start();
    }

    @Override
    public void destroy() throws Exception {
        logger.info("Shutting down gRPC server ...");
        Optional.ofNullable(server).ifPresent(Server::shutdown);
        logger.info("gRPC server stopped.");
    }
}
