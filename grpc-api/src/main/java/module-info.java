open module grpc.api {
    requires com.google.common;
    requires java.logging;
    requires grpc.annotation.helper;
    exports io.grpc;
    uses io.grpc.ServerProvider;
    uses io.grpc.ManagedChannelProvider;
    uses io.grpc.NameResolverProvider;
    uses io.grpc.LoadBalancerProvider;
}