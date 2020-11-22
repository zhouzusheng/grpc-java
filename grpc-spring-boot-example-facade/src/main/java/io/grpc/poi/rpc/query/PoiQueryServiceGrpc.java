package io.grpc.poi.rpc.query;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: PoiQuery.proto")
public final class PoiQueryServiceGrpc {

  private PoiQueryServiceGrpc() {}

  public static final String SERVICE_NAME = "io.grpc.poi.rpc.query.PoiQueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.poi.rpc.query.PoiQuery.QueryExpress,
      io.grpc.poi.rpc.query.PoiQuery.PoiResult> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "query",
      requestType = io.grpc.poi.rpc.query.PoiQuery.QueryExpress.class,
      responseType = io.grpc.poi.rpc.query.PoiQuery.PoiResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.poi.rpc.query.PoiQuery.QueryExpress,
      io.grpc.poi.rpc.query.PoiQuery.PoiResult> getQueryMethod() {
    io.grpc.MethodDescriptor<io.grpc.poi.rpc.query.PoiQuery.QueryExpress, io.grpc.poi.rpc.query.PoiQuery.PoiResult> getQueryMethod;
    if ((getQueryMethod = PoiQueryServiceGrpc.getQueryMethod) == null) {
      synchronized (PoiQueryServiceGrpc.class) {
        if ((getQueryMethod = PoiQueryServiceGrpc.getQueryMethod) == null) {
          PoiQueryServiceGrpc.getQueryMethod = getQueryMethod = 
              io.grpc.MethodDescriptor.<io.grpc.poi.rpc.query.PoiQuery.QueryExpress, io.grpc.poi.rpc.query.PoiQuery.PoiResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "io.grpc.poi.rpc.query.PoiQueryService", "query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.poi.rpc.query.PoiQuery.QueryExpress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.poi.rpc.query.PoiQuery.PoiResult.getDefaultInstance()))
                  .setSchemaDescriptor(new PoiQueryServiceMethodDescriptorSupplier("query"))
                  .build();
          }
        }
     }
     return getQueryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PoiQueryServiceStub newStub(io.grpc.Channel channel) {
    return new PoiQueryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PoiQueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PoiQueryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PoiQueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PoiQueryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PoiQueryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void query(io.grpc.poi.rpc.query.PoiQuery.QueryExpress request,
        io.grpc.stub.StreamObserver<io.grpc.poi.rpc.query.PoiQuery.PoiResult> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.poi.rpc.query.PoiQuery.QueryExpress,
                io.grpc.poi.rpc.query.PoiQuery.PoiResult>(
                  this, METHODID_QUERY)))
          .build();
    }
  }

  /**
   */
  public static final class PoiQueryServiceStub extends io.grpc.stub.AbstractStub<PoiQueryServiceStub> {
    private PoiQueryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PoiQueryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PoiQueryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PoiQueryServiceStub(channel, callOptions);
    }

    /**
     */
    public void query(io.grpc.poi.rpc.query.PoiQuery.QueryExpress request,
        io.grpc.stub.StreamObserver<io.grpc.poi.rpc.query.PoiQuery.PoiResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PoiQueryServiceBlockingStub extends io.grpc.stub.AbstractStub<PoiQueryServiceBlockingStub> {
    private PoiQueryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PoiQueryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PoiQueryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PoiQueryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.poi.rpc.query.PoiQuery.PoiResult query(io.grpc.poi.rpc.query.PoiQuery.QueryExpress request) {
      return blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PoiQueryServiceFutureStub extends io.grpc.stub.AbstractStub<PoiQueryServiceFutureStub> {
    private PoiQueryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PoiQueryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PoiQueryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PoiQueryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.poi.rpc.query.PoiQuery.PoiResult> query(
        io.grpc.poi.rpc.query.PoiQuery.QueryExpress request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PoiQueryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PoiQueryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY:
          serviceImpl.query((io.grpc.poi.rpc.query.PoiQuery.QueryExpress) request,
              (io.grpc.stub.StreamObserver<io.grpc.poi.rpc.query.PoiQuery.PoiResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PoiQueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PoiQueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.poi.rpc.query.PoiQuery.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PoiQueryService");
    }
  }

  private static final class PoiQueryServiceFileDescriptorSupplier
      extends PoiQueryServiceBaseDescriptorSupplier {
    PoiQueryServiceFileDescriptorSupplier() {}
  }

  private static final class PoiQueryServiceMethodDescriptorSupplier
      extends PoiQueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PoiQueryServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PoiQueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PoiQueryServiceFileDescriptorSupplier())
              .addMethod(getQueryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
