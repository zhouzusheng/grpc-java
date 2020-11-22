open module grpc.services {
    requires grpc.api;
    requires grpc.stub;
    requires grpc.core;
    requires grpc.annotation.helper;
    requires com.google.common;
    requires java.annotation;
    requires grpc.protobuf;
    requires grpc.protobuf.lite;
    requires com.google.protobuf;
    requires com.google.protobuf.util;
    requires java.logging;
    exports io.grpc.services;
    exports io.grpc.services.internal;
    exports io.grpc.binarylog.v1;
    exports io.grpc.channelz.v1;
    exports io.grpc.health.v1;
    exports io.grpc.protobuf.services;
    exports io.grpc.reflection.v1alpha;

}