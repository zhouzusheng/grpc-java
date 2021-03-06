// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/lookup/v1/rls_config.proto

package io.grpc.lookup.v1;

public interface GrpcKeyBuilderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.lookup.v1.GrpcKeyBuilder)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .grpc.lookup.v1.GrpcKeyBuilder.Name names = 1;</code>
   */
  java.util.List<GrpcKeyBuilder.Name>
      getNamesList();
  /**
   * <code>repeated .grpc.lookup.v1.GrpcKeyBuilder.Name names = 1;</code>
   */
  GrpcKeyBuilder.Name getNames(int index);
  /**
   * <code>repeated .grpc.lookup.v1.GrpcKeyBuilder.Name names = 1;</code>
   */
  int getNamesCount();
  /**
   * <code>repeated .grpc.lookup.v1.GrpcKeyBuilder.Name names = 1;</code>
   */
  java.util.List<? extends GrpcKeyBuilder.NameOrBuilder>
      getNamesOrBuilderList();
  /**
   * <code>repeated .grpc.lookup.v1.GrpcKeyBuilder.Name names = 1;</code>
   */
  GrpcKeyBuilder.NameOrBuilder getNamesOrBuilder(
      int index);

  /**
   * <pre>
   * Extract keys from all listed headers.
   * For gRPC, it is an error to specify "required_match" on the NameMatcher
   * protos.
   * </pre>
   *
   * <code>repeated .grpc.lookup.v1.NameMatcher headers = 2;</code>
   */
  java.util.List<NameMatcher>
      getHeadersList();
  /**
   * <pre>
   * Extract keys from all listed headers.
   * For gRPC, it is an error to specify "required_match" on the NameMatcher
   * protos.
   * </pre>
   *
   * <code>repeated .grpc.lookup.v1.NameMatcher headers = 2;</code>
   */
  NameMatcher getHeaders(int index);
  /**
   * <pre>
   * Extract keys from all listed headers.
   * For gRPC, it is an error to specify "required_match" on the NameMatcher
   * protos.
   * </pre>
   *
   * <code>repeated .grpc.lookup.v1.NameMatcher headers = 2;</code>
   */
  int getHeadersCount();
  /**
   * <pre>
   * Extract keys from all listed headers.
   * For gRPC, it is an error to specify "required_match" on the NameMatcher
   * protos.
   * </pre>
   *
   * <code>repeated .grpc.lookup.v1.NameMatcher headers = 2;</code>
   */
  java.util.List<? extends NameMatcherOrBuilder>
      getHeadersOrBuilderList();
  /**
   * <pre>
   * Extract keys from all listed headers.
   * For gRPC, it is an error to specify "required_match" on the NameMatcher
   * protos.
   * </pre>
   *
   * <code>repeated .grpc.lookup.v1.NameMatcher headers = 2;</code>
   */
  NameMatcherOrBuilder getHeadersOrBuilder(
      int index);
}
