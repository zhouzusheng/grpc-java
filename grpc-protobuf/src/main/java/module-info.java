module grpc.protobuf {
    requires com.google.protobuf;
    requires grpc.api;
    requires grpc.annotation.helper;
    requires grpc.protobuf.lite;
    requires com.google.common;
    requires proto.google.common.protos;
    exports io.grpc.protobuf;
}