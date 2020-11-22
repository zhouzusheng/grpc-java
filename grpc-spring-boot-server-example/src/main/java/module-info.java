module grpc.spring.boot.server.example {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires grpc.stub;
    requires grpc.spring.boot.server.starter;
    requires grpc.spring.boot.example.facade;
    requires grpc.netty.httpclient;
    exports io.grpc.example.server;

    opens io.grpc.example.server to spring.core;
}