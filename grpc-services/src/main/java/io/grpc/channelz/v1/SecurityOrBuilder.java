// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

public interface SecurityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.channelz.v1.Security)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.grpc.channelz.v1.Security.Tls tls = 1;</code>
   */
  boolean hasTls();
  /**
   * <code>.grpc.channelz.v1.Security.Tls tls = 1;</code>
   */
  Security.Tls getTls();
  /**
   * <code>.grpc.channelz.v1.Security.Tls tls = 1;</code>
   */
  Security.TlsOrBuilder getTlsOrBuilder();

  /**
   * <code>.grpc.channelz.v1.Security.OtherSecurity other = 2;</code>
   */
  boolean hasOther();
  /**
   * <code>.grpc.channelz.v1.Security.OtherSecurity other = 2;</code>
   */
  Security.OtherSecurity getOther();
  /**
   * <code>.grpc.channelz.v1.Security.OtherSecurity other = 2;</code>
   */
  Security.OtherSecurityOrBuilder getOtherOrBuilder();

  public Security.ModelCase getModelCase();
}
