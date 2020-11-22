package io.grpc.spring.server.service;

public class ServiceInfo {
    private String type;
    private String name;
    private int port;
    private String version;

    public ServiceInfo(String type, String name, int port, String version) {
        this.type = type;
        this.name = name;
        this.port = port;
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getVersion() {
        if (version.contains(".")) {
            version = version.replace(".", "_");
        }
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ServiceInfo{" +
                " type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", port=" + port +
                ", version='" + version + '\'' +
                '}';
    }
}
