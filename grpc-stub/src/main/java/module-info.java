open module grpc.stub {
    requires grpc.api;
    requires java.logging;
    requires com.google.common;
    requires grpc.annotation.helper;
    exports io.grpc.stub;
    exports io.grpc.stub.annotations;
}