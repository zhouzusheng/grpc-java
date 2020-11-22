package io.grpc.spring.client.configure;

import com.google.common.net.HostAndPort;
import io.grpc.NameResolverRegistry;
import io.grpc.spring.client.service.ConsulNameResolverProvider;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GrpcClientProperties.class)
public class GrpcClientAutoConfiguration {
    @Bean
    ConsulNameResolverProvider consulNameResolverProvider(GrpcClientProperties properties) {
        ConsulNameResolverProvider provider = new ConsulNameResolverProvider(HostAndPort.fromParts(properties.getHost(), properties.getPort()));
        NameResolverRegistry.getDefaultRegistry().register(provider);
        return provider;
    }
}
