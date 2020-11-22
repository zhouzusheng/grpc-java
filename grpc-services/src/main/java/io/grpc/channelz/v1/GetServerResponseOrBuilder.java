// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

public interface GetServerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.channelz.v1.GetServerResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Server that corresponds to the requested server_id.  This field
   * should be set.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Server server = 1;</code>
   */
  boolean hasServer();
  /**
   * <pre>
   * The Server that corresponds to the requested server_id.  This field
   * should be set.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Server server = 1;</code>
   */
  Server getServer();
  /**
   * <pre>
   * The Server that corresponds to the requested server_id.  This field
   * should be set.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Server server = 1;</code>
   */
  ServerOrBuilder getServerOrBuilder();
}