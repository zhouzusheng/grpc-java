module grpc.rls {
    requires grpc.api;
    requires grpc.stub;
    requires grpc.core;
    requires grpc.protobuf;
    requires grpc.annotation.helper;
    requires java.annotation;
    requires com.google.protobuf;
    requires com.google.common;
    exports io.grpc.rls;
    exports io.grpc.lookup.v1;
    provides io.grpc.LoadBalancerProvider with io.grpc.rls.RlsLoadBalancerProvider;
}