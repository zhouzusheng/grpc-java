// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/reflection/v1alpha/reflection.proto

package io.grpc.reflection.v1alpha;

public interface ServiceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.reflection.v1alpha.ServiceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Full name of a registered service, including its package name. The format
   * is &lt;package&gt;.&lt;service&gt;
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  String getName();
  /**
   * <pre>
   * Full name of a registered service, including its package name. The format
   * is &lt;package&gt;.&lt;service&gt;
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
