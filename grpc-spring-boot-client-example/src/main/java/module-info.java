module grpc.spring.boot.client.example {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires grpc.stub;
    requires grpc.api;
    requires grpc.core;
    requires grpc.spring.boot.example.facade;
    requires grpc.spring.boot.client.starter;
    requires grpc.netty.httpclient;
    requires com.google.common;
    exports io.grpc.example.client;

    opens io.grpc.example.client to spring.core;
}