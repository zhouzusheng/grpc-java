module grpc.netty {
    requires grpc.api;
    requires grpc.core;
    requires grpc.annotation.helper;
    requires perfmark.api;
    requires com.google.common;
    requires java.logging;
    requires io.netty.common;
    requires io.netty.buffer;
    requires io.netty.transport;
    requires io.netty.codec;
    requires io.netty.handler;
    requires io.netty.codec.http;
    requires io.netty.handler.proxy;
    requires io.netty.codec.http2;


    provides io.grpc.ServerProvider with io.grpc.netty.NettyServerProvider;
    provides io.grpc.ManagedChannelProvider with io.grpc.netty.NettyChannelProvider;
}