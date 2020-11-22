module grpc.protobuf.lite {
    requires grpc.api;
    requires com.google.common;
    requires com.google.protobuf;
    requires grpc.annotation.helper;
    exports io.grpc.protobuf.lite;
}