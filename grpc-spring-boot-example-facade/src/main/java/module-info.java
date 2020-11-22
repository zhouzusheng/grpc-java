module grpc.spring.boot.example.facade {
    requires com.google.common;
    requires com.google.protobuf;
    requires java.annotation;
    requires grpc.api;
    requires grpc.stub;
    requires grpc.protobuf;
    exports io.grpc.poi.rpc.query;
    opens io.grpc.poi.rpc.query;
}