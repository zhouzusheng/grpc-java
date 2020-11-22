package io.grpc.example.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.poi.rpc.query.PoiQuery;
import io.grpc.poi.rpc.query.PoiQueryServiceGrpc;
import org.springframework.boot.CommandLineRunner;

public class ClientRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("consul://io.grpc.poi.rpc.query.PoiQueryService")
                .usePlaintext()
                .defaultLoadBalancingPolicy("round_robin").build();
        PoiQueryServiceGrpc.PoiQueryServiceBlockingStub sub = PoiQueryServiceGrpc.newBlockingStub(channel);
        PoiQuery.QueryExpress.Builder builder =  PoiQuery.QueryExpress.newBuilder();
        builder.setText("test client");
        PoiQuery.PoiResult result = sub.query(builder.build());
        System.out.println(result);
        System.exit(0);
    }
}
