module grpc.spring.boot.server.starter {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires org.slf4j;
    requires grpc.api;
    requires grpc.netty;
    requires grpc.netty.httpclient;
    requires grpc.consul.api;
    requires grpc.consul.transport;
    requires grpc.services;
    exports io.grpc.spring.server.configure;
    exports io.grpc.spring.server.service;
    opens io.grpc.spring.server.configure to spring.core;
}