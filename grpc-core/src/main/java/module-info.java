open module grpc.core {
    requires grpc.api;
    requires grpc.annotation.helper;
    requires java.logging;
    requires perfmark.api;
    requires java.naming;
    requires java.compiler;
    requires com.google.common;
    requires com.google.gson;
    exports io.grpc.inprocess;
    exports io.grpc.internal;
    exports io.grpc.util;

    provides io.grpc.LoadBalancerProvider with io.grpc.internal.PickFirstLoadBalancerProvider,io.grpc.util.SecretRoundRobinLoadBalancerProvider.Provider;
    provides io.grpc.NameResolverProvider with io.grpc.internal.DnsNameResolverProvider;

}