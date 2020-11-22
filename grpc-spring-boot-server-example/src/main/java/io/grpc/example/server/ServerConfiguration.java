package io.grpc.example.server;

import io.grpc.spring.server.configure.ConsulInit;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.AsyncHttpClientConfig;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClientConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfiguration {
    @Bean
    AsyncHttpClientConfig asyncHttpClientConfig() {
        DefaultAsyncHttpClientConfig.Builder builder = new DefaultAsyncHttpClientConfig.Builder();
        builder.setConnectTimeout(1000*4);
        return builder.build();
    }
    @Bean
    AsyncHttpClient asyncHttpClient(AsyncHttpClientConfig config) {
        AsyncHttpClient client = new DefaultAsyncHttpClient(config);
        ConsulInit.initHttpClient(client);
        return client;
    }
}
