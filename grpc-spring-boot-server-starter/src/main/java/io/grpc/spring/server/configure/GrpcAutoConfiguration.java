package io.grpc.spring.server.configure;

import io.grpc.spring.server.service.RpcRegister;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GrpcServerProperties.class)
public class GrpcAutoConfiguration {
    @Bean
    public GrpcServerRunner grpcServerRunner(GrpcServerProperties properties, RpcRegister register){
        return new GrpcServerRunner(properties, register);
    }
    @Bean
    RpcRegister grpcRegister(GrpcServerProperties properties) {
        return new RpcRegisterImpl(properties);
    }
}
