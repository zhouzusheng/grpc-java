package io.grpc.channelz.v1;

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
 * <pre>
 * Channelz is a service exposed by gRPC servers that provides detailed debug
 * information.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: grpc/channelz/v1/channelz.proto")
public final class ChannelzGrpc {

  private ChannelzGrpc() {}

  public static final String SERVICE_NAME = "grpc.channelz.v1.Channelz";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GetTopChannelsRequest,
      GetTopChannelsResponse> getGetTopChannelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTopChannels",
      requestType = GetTopChannelsRequest.class,
      responseType = GetTopChannelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetTopChannelsRequest,
      GetTopChannelsResponse> getGetTopChannelsMethod() {
    io.grpc.MethodDescriptor<GetTopChannelsRequest, GetTopChannelsResponse> getGetTopChannelsMethod;
    if ((getGetTopChannelsMethod = ChannelzGrpc.getGetTopChannelsMethod) == null) {
      synchronized (ChannelzGrpc.class) {
        if ((getGetTopChannelsMethod = ChannelzGrpc.getGetTopChannelsMethod) == null) {
          ChannelzGrpc.getGetTopChannelsMethod = getGetTopChannelsMethod = 
              io.grpc.MethodDescriptor.<GetTopChannelsRequest, GetTopChannelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.channelz.v1.Channelz", "GetTopChannels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetTopChannelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetTopChannelsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChannelzMethodDescriptorSupplier("GetTopChannels"))
                  .build();
          }
        }
     }
     return getGetTopChannelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetServersRequest,
      GetServersResponse> getGetServersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServers",
      requestType = GetServersRequest.class,
      responseType = GetServersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetServersRequest,
      GetServersResponse> getGetServersMethod() {
    io.grpc.MethodDescriptor<GetServersRequest, GetServersResponse> getGetServersMethod;
    if ((getGetServersMethod = ChannelzGrpc.getGetServersMethod) == null) {
      synchronized (ChannelzGrpc.class) {
        if ((getGetServersMethod = ChannelzGrpc.getGetServersMethod) == null) {
          ChannelzGrpc.getGetServersMethod = getGetServersMethod = 
              io.grpc.MethodDescriptor.<GetServersRequest, GetServersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.channelz.v1.Channelz", "GetServers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetServersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetServersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChannelzMethodDescriptorSupplier("GetServers"))
                  .build();
          }
        }
     }
     return getGetServersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetServerRequest,
      GetServerResponse> getGetServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServer",
      requestType = GetServerRequest.class,
      responseType = GetServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetServerRequest,
      GetServerResponse> getGetServerMethod() {
    io.grpc.MethodDescriptor<GetServerRequest, GetServerResponse> getGetServerMethod;
    if ((getGetServerMethod = ChannelzGrpc.getGetServerMethod) == null) {
      synchronized (ChannelzGrpc.class) {
        if ((getGetServerMethod = ChannelzGrpc.getGetServerMethod) == null) {
          ChannelzGrpc.getGetServerMethod = getGetServerMethod = 
              io.grpc.MethodDescriptor.<GetServerRequest, GetServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.channelz.v1.Channelz", "GetServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetServerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChannelzMethodDescriptorSupplier("GetServer"))
                  .build();
          }
        }
     }
     return getGetServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetServerSocketsRequest,
      GetServerSocketsResponse> getGetServerSocketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServerSockets",
      requestType = GetServerSocketsRequest.class,
      responseType = GetServerSocketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetServerSocketsRequest,
      GetServerSocketsResponse> getGetServerSocketsMethod() {
    io.grpc.MethodDescriptor<GetServerSocketsRequest, GetServerSocketsResponse> getGetServerSocketsMethod;
    if ((getGetServerSocketsMethod = ChannelzGrpc.getGetServerSocketsMethod) == null) {
      synchronized (ChannelzGrpc.class) {
        if ((getGetServerSocketsMethod = ChannelzGrpc.getGetServerSocketsMethod) == null) {
          ChannelzGrpc.getGetServerSocketsMethod = getGetServerSocketsMethod = 
              io.grpc.MethodDescriptor.<GetServerSocketsRequest, GetServerSocketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.channelz.v1.Channelz", "GetServerSockets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetServerSocketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetServerSocketsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChannelzMethodDescriptorSupplier("GetServerSockets"))
                  .build();
          }
        }
     }
     return getGetServerSocketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetChannelRequest,
      GetChannelResponse> getGetChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChannel",
      requestType = GetChannelRequest.class,
      responseType = GetChannelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetChannelRequest,
      GetChannelResponse> getGetChannelMethod() {
    io.grpc.MethodDescriptor<GetChannelRequest, GetChannelResponse> getGetChannelMethod;
    if ((getGetChannelMethod = ChannelzGrpc.getGetChannelMethod) == null) {
      synchronized (ChannelzGrpc.class) {
        if ((getGetChannelMethod = ChannelzGrpc.getGetChannelMethod) == null) {
          ChannelzGrpc.getGetChannelMethod = getGetChannelMethod = 
              io.grpc.MethodDescriptor.<GetChannelRequest, GetChannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.channelz.v1.Channelz", "GetChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetChannelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChannelzMethodDescriptorSupplier("GetChannel"))
                  .build();
          }
        }
     }
     return getGetChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetSubchannelRequest,
      GetSubchannelResponse> getGetSubchannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSubchannel",
      requestType = GetSubchannelRequest.class,
      responseType = GetSubchannelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetSubchannelRequest,
      GetSubchannelResponse> getGetSubchannelMethod() {
    io.grpc.MethodDescriptor<GetSubchannelRequest, GetSubchannelResponse> getGetSubchannelMethod;
    if ((getGetSubchannelMethod = ChannelzGrpc.getGetSubchannelMethod) == null) {
      synchronized (ChannelzGrpc.class) {
        if ((getGetSubchannelMethod = ChannelzGrpc.getGetSubchannelMethod) == null) {
          ChannelzGrpc.getGetSubchannelMethod = getGetSubchannelMethod = 
              io.grpc.MethodDescriptor.<GetSubchannelRequest, GetSubchannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.channelz.v1.Channelz", "GetSubchannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetSubchannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetSubchannelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChannelzMethodDescriptorSupplier("GetSubchannel"))
                  .build();
          }
        }
     }
     return getGetSubchannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetSocketRequest,
      GetSocketResponse> getGetSocketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSocket",
      requestType = GetSocketRequest.class,
      responseType = GetSocketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetSocketRequest,
      GetSocketResponse> getGetSocketMethod() {
    io.grpc.MethodDescriptor<GetSocketRequest, GetSocketResponse> getGetSocketMethod;
    if ((getGetSocketMethod = ChannelzGrpc.getGetSocketMethod) == null) {
      synchronized (ChannelzGrpc.class) {
        if ((getGetSocketMethod = ChannelzGrpc.getGetSocketMethod) == null) {
          ChannelzGrpc.getGetSocketMethod = getGetSocketMethod = 
              io.grpc.MethodDescriptor.<GetSocketRequest, GetSocketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.channelz.v1.Channelz", "GetSocket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetSocketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetSocketResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChannelzMethodDescriptorSupplier("GetSocket"))
                  .build();
          }
        }
     }
     return getGetSocketMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChannelzStub newStub(io.grpc.Channel channel) {
    return new ChannelzStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChannelzBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChannelzBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChannelzFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChannelzFutureStub(channel);
  }

  /**
   * <pre>
   * Channelz is a service exposed by gRPC servers that provides detailed debug
   * information.
   * </pre>
   */
  public static abstract class ChannelzImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Gets all root channels (i.e. channels the application has directly
     * created). This does not include subchannels nor non-top level channels.
     * </pre>
     */
    public void getTopChannels(GetTopChannelsRequest request,
                               io.grpc.stub.StreamObserver<GetTopChannelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTopChannelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets all servers that exist in the process.
     * </pre>
     */
    public void getServers(GetServersRequest request,
                           io.grpc.stub.StreamObserver<GetServersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a single Server, or else a NOT_FOUND code.
     * </pre>
     */
    public void getServer(GetServerRequest request,
                          io.grpc.stub.StreamObserver<GetServerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets all server sockets that exist in the process.
     * </pre>
     */
    public void getServerSockets(GetServerSocketsRequest request,
                                 io.grpc.stub.StreamObserver<GetServerSocketsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServerSocketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a single Channel, or else a NOT_FOUND code.
     * </pre>
     */
    public void getChannel(GetChannelRequest request,
                           io.grpc.stub.StreamObserver<GetChannelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChannelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a single Subchannel, or else a NOT_FOUND code.
     * </pre>
     */
    public void getSubchannel(GetSubchannelRequest request,
                              io.grpc.stub.StreamObserver<GetSubchannelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSubchannelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a single Socket or else a NOT_FOUND code.
     * </pre>
     */
    public void getSocket(GetSocketRequest request,
                          io.grpc.stub.StreamObserver<GetSocketResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSocketMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTopChannelsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GetTopChannelsRequest,
                GetTopChannelsResponse>(
                  this, METHODID_GET_TOP_CHANNELS)))
          .addMethod(
            getGetServersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GetServersRequest,
                GetServersResponse>(
                  this, METHODID_GET_SERVERS)))
          .addMethod(
            getGetServerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GetServerRequest,
                GetServerResponse>(
                  this, METHODID_GET_SERVER)))
          .addMethod(
            getGetServerSocketsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GetServerSocketsRequest,
                GetServerSocketsResponse>(
                  this, METHODID_GET_SERVER_SOCKETS)))
          .addMethod(
            getGetChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GetChannelRequest,
                GetChannelResponse>(
                  this, METHODID_GET_CHANNEL)))
          .addMethod(
            getGetSubchannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GetSubchannelRequest,
                GetSubchannelResponse>(
                  this, METHODID_GET_SUBCHANNEL)))
          .addMethod(
            getGetSocketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GetSocketRequest,
                GetSocketResponse>(
                  this, METHODID_GET_SOCKET)))
          .build();
    }
  }

  /**
   * <pre>
   * Channelz is a service exposed by gRPC servers that provides detailed debug
   * information.
   * </pre>
   */
  public static final class ChannelzStub extends io.grpc.stub.AbstractStub<ChannelzStub> {
    private ChannelzStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChannelzStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ChannelzStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChannelzStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets all root channels (i.e. channels the application has directly
     * created). This does not include subchannels nor non-top level channels.
     * </pre>
     */
    public void getTopChannels(GetTopChannelsRequest request,
                               io.grpc.stub.StreamObserver<GetTopChannelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTopChannelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets all servers that exist in the process.
     * </pre>
     */
    public void getServers(GetServersRequest request,
                           io.grpc.stub.StreamObserver<GetServersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a single Server, or else a NOT_FOUND code.
     * </pre>
     */
    public void getServer(GetServerRequest request,
                          io.grpc.stub.StreamObserver<GetServerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets all server sockets that exist in the process.
     * </pre>
     */
    public void getServerSockets(GetServerSocketsRequest request,
                                 io.grpc.stub.StreamObserver<GetServerSocketsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServerSocketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a single Channel, or else a NOT_FOUND code.
     * </pre>
     */
    public void getChannel(GetChannelRequest request,
                           io.grpc.stub.StreamObserver<GetChannelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a single Subchannel, or else a NOT_FOUND code.
     * </pre>
     */
    public void getSubchannel(GetSubchannelRequest request,
                              io.grpc.stub.StreamObserver<GetSubchannelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSubchannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a single Socket or else a NOT_FOUND code.
     * </pre>
     */
    public void getSocket(GetSocketRequest request,
                          io.grpc.stub.StreamObserver<GetSocketResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSocketMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Channelz is a service exposed by gRPC servers that provides detailed debug
   * information.
   * </pre>
   */
  public static final class ChannelzBlockingStub extends io.grpc.stub.AbstractStub<ChannelzBlockingStub> {
    private ChannelzBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChannelzBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ChannelzBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChannelzBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets all root channels (i.e. channels the application has directly
     * created). This does not include subchannels nor non-top level channels.
     * </pre>
     */
    public GetTopChannelsResponse getTopChannels(GetTopChannelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTopChannelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets all servers that exist in the process.
     * </pre>
     */
    public GetServersResponse getServers(GetServersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a single Server, or else a NOT_FOUND code.
     * </pre>
     */
    public GetServerResponse getServer(GetServerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets all server sockets that exist in the process.
     * </pre>
     */
    public GetServerSocketsResponse getServerSockets(GetServerSocketsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServerSocketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a single Channel, or else a NOT_FOUND code.
     * </pre>
     */
    public GetChannelResponse getChannel(GetChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetChannelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a single Subchannel, or else a NOT_FOUND code.
     * </pre>
     */
    public GetSubchannelResponse getSubchannel(GetSubchannelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSubchannelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a single Socket or else a NOT_FOUND code.
     * </pre>
     */
    public GetSocketResponse getSocket(GetSocketRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSocketMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Channelz is a service exposed by gRPC servers that provides detailed debug
   * information.
   * </pre>
   */
  public static final class ChannelzFutureStub extends io.grpc.stub.AbstractStub<ChannelzFutureStub> {
    private ChannelzFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChannelzFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ChannelzFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChannelzFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets all root channels (i.e. channels the application has directly
     * created). This does not include subchannels nor non-top level channels.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetTopChannelsResponse> getTopChannels(
        GetTopChannelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTopChannelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets all servers that exist in the process.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetServersResponse> getServers(
        GetServersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a single Server, or else a NOT_FOUND code.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetServerResponse> getServer(
        GetServerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets all server sockets that exist in the process.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetServerSocketsResponse> getServerSockets(
        GetServerSocketsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServerSocketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a single Channel, or else a NOT_FOUND code.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetChannelResponse> getChannel(
        GetChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetChannelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a single Subchannel, or else a NOT_FOUND code.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetSubchannelResponse> getSubchannel(
        GetSubchannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSubchannelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a single Socket or else a NOT_FOUND code.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetSocketResponse> getSocket(
        GetSocketRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSocketMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOP_CHANNELS = 0;
  private static final int METHODID_GET_SERVERS = 1;
  private static final int METHODID_GET_SERVER = 2;
  private static final int METHODID_GET_SERVER_SOCKETS = 3;
  private static final int METHODID_GET_CHANNEL = 4;
  private static final int METHODID_GET_SUBCHANNEL = 5;
  private static final int METHODID_GET_SOCKET = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChannelzImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChannelzImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOP_CHANNELS:
          serviceImpl.getTopChannels((GetTopChannelsRequest) request,
              (io.grpc.stub.StreamObserver<GetTopChannelsResponse>) responseObserver);
          break;
        case METHODID_GET_SERVERS:
          serviceImpl.getServers((GetServersRequest) request,
              (io.grpc.stub.StreamObserver<GetServersResponse>) responseObserver);
          break;
        case METHODID_GET_SERVER:
          serviceImpl.getServer((GetServerRequest) request,
              (io.grpc.stub.StreamObserver<GetServerResponse>) responseObserver);
          break;
        case METHODID_GET_SERVER_SOCKETS:
          serviceImpl.getServerSockets((GetServerSocketsRequest) request,
              (io.grpc.stub.StreamObserver<GetServerSocketsResponse>) responseObserver);
          break;
        case METHODID_GET_CHANNEL:
          serviceImpl.getChannel((GetChannelRequest) request,
              (io.grpc.stub.StreamObserver<GetChannelResponse>) responseObserver);
          break;
        case METHODID_GET_SUBCHANNEL:
          serviceImpl.getSubchannel((GetSubchannelRequest) request,
              (io.grpc.stub.StreamObserver<GetSubchannelResponse>) responseObserver);
          break;
        case METHODID_GET_SOCKET:
          serviceImpl.getSocket((GetSocketRequest) request,
              (io.grpc.stub.StreamObserver<GetSocketResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChannelzBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChannelzBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ChannelzProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Channelz");
    }
  }

  private static final class ChannelzFileDescriptorSupplier
      extends ChannelzBaseDescriptorSupplier {
    ChannelzFileDescriptorSupplier() {}
  }

  private static final class ChannelzMethodDescriptorSupplier
      extends ChannelzBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChannelzMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChannelzGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChannelzFileDescriptorSupplier())
              .addMethod(getGetTopChannelsMethod())
              .addMethod(getGetServersMethod())
              .addMethod(getGetServerMethod())
              .addMethod(getGetServerSocketsMethod())
              .addMethod(getGetChannelMethod())
              .addMethod(getGetSubchannelMethod())
              .addMethod(getGetSocketMethod())
              .build();
        }
      }
    }
    return result;
  }
}
