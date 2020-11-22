open module grpc.netty.httpclient {
    requires io.netty.common;
    requires io.netty.buffer;
    requires io.netty.handler;
    requires io.netty.codec;
    requires io.netty.transport;
    requires io.netty.codec.http;
    requires io.netty.transport.epoll;
    requires io.netty.transport.kqueue;
    requires io.netty.resolver;
    requires io.netty.handler.proxy;
    requires org.reactivestreams;
    requires com.typesafe.netty.core;
    requires java.activation;
    requires java.security.jgss;
    requires java.xml;
    requires org.slf4j;

    exports org.asynchttpclient;
    exports org.asynchttpclient.channel;
    exports org.asynchttpclient.config;
    exports org.asynchttpclient.cookie;
    exports org.asynchttpclient.exception;
    exports org.asynchttpclient.filter;
    exports org.asynchttpclient.handler;
    exports org.asynchttpclient.handler.resumable;
    exports org.asynchttpclient.netty;
    exports org.asynchttpclient.netty.channel;
    exports org.asynchttpclient.netty.future;
    exports org.asynchttpclient.netty.handler;
    exports org.asynchttpclient.netty.handler.intercept;
    exports org.asynchttpclient.netty.request;
    exports org.asynchttpclient.netty.request.body;
    exports org.asynchttpclient.netty.ssl;
    exports org.asynchttpclient.netty.timeout;
    exports org.asynchttpclient.netty.util;
    exports org.asynchttpclient.netty.ws;
    exports org.asynchttpclient.ntlm;
    exports org.asynchttpclient.oauth;
    exports org.asynchttpclient.proxy;
    exports org.asynchttpclient.request.body;
    exports org.asynchttpclient.request.body.generator;
    exports org.asynchttpclient.request.body.multipart;
    exports org.asynchttpclient.request.body.multipart.part;
    exports org.asynchttpclient.resolver;
    exports org.asynchttpclient.spnego;
    exports org.asynchttpclient.uri;
    exports org.asynchttpclient.util;
    exports org.asynchttpclient.webdav;
    exports org.asynchttpclient.ws;


}