package io.grpc.spring.server.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("grpc.server")
public class GrpcServerProperties {
    /**
     * gRPC server port
     */
    private int port = 9090;

    private String consulHost;

    private String localIp;

    public String getLocalIp() {
        return localIp;
    }

    public void setLocalIp(String localIp) {
        this.localIp = localIp;
    }

    public String getConsulHost() {
        return consulHost;
    }

    public void setConsulHost(String consulHost) {
        this.consulHost = consulHost;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
