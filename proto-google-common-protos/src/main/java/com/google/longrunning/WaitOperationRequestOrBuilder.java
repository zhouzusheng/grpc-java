// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/longrunning/operations.proto

package com.google.longrunning;

public interface WaitOperationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.longrunning.WaitOperationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the operation resource to wait on.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  String getName();
  /**
   * <pre>
   * The name of the operation resource to wait on.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The maximum duration to wait before timing out. If left blank, the wait
   * will be at most the time permitted by the underlying HTTP/RPC protocol.
   * If RPC context deadline is also specified, the shorter one will be used.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 2;</code>
   */
  boolean hasTimeout();
  /**
   * <pre>
   * The maximum duration to wait before timing out. If left blank, the wait
   * will be at most the time permitted by the underlying HTTP/RPC protocol.
   * If RPC context deadline is also specified, the shorter one will be used.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 2;</code>
   */
  com.google.protobuf.Duration getTimeout();
  /**
   * <pre>
   * The maximum duration to wait before timing out. If left blank, the wait
   * will be at most the time permitted by the underlying HTTP/RPC protocol.
   * If RPC context deadline is also specified, the shorter one will be used.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();
}
