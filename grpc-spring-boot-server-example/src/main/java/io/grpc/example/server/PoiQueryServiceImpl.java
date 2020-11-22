package io.grpc.example.server;


import io.grpc.poi.rpc.query.PoiQuery;
import io.grpc.poi.rpc.query.PoiQuery.PoiResult;
import io.grpc.poi.rpc.query.PoiQuery.QueryExpress;
import io.grpc.poi.rpc.query.PoiQueryServiceGrpc;
import io.grpc.spring.server.service.GrpcService;
import io.grpc.stub.StreamObserver;

@GrpcService(grpcServiceOuterClass = PoiQueryServiceGrpc.PoiQueryServiceImplBase.class, serviceName = "DemoServer", version = "1.0.0")
public class PoiQueryServiceImpl extends PoiQueryServiceGrpc.PoiQueryServiceImplBase {

    @Override
    public void query(QueryExpress request, StreamObserver<PoiResult> responseObserver) {
        PoiQuery.PoiItem item = PoiQuery.PoiItem.newBuilder().setName("test server").build();
        PoiResult r = PoiResult.newBuilder().addItems(item).build();

        responseObserver.onNext(r);
        responseObserver.onCompleted();
    }
}
