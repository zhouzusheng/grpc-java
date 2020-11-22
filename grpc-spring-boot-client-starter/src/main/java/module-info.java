module grpc.spring.boot.client.starter {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires grpc.api;
    requires grpc.core;
    requires com.google.common;
    requires org.slf4j;
    requires grpc.netty.httpclient;
    requires grpc.consul.api;
    requires grpc.consul.transport;
    exports io.grpc.spring.client.service;

    exports io.grpc.spring.client.configure;
    opens io.grpc.spring.client.configure to spring.core;

}