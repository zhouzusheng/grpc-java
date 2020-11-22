package io.grpc.spring.client.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("grpc.client.consul")
public class GrpcClientProperties {
    /**
     * gRPC server port
     */
    private int port = 8500;

    private String host = "127.0.0.1";

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
