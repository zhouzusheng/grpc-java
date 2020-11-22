package io.grpc.spring.server.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
@Bean
public @interface GrpcService {
    /**
     *
     * @return protoc-generated class that creates {@link io.grpc.ServerServiceDefinition} via static <code>bindService</code> function.
     */
    Class<?> grpcServiceOuterClass();

    String serviceName();

    String version();
}
