module grpc.consul.transport {
    requires grpc.consul.api;
    requires grpc.netty.httpclient;
    exports com.ecwid.consul.transport.async;
}