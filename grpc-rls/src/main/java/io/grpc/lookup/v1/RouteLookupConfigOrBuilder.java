// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/lookup/v1/rls_config.proto

package io.grpc.lookup.v1;

public interface RouteLookupConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.lookup.v1.RouteLookupConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Ordered specifications for constructing keys for HTTP requests.  Last
   * match wins.  If no HttpKeyBuilder matches, an empty key_map will be sent to
   * the lookup service; it should likely reply with a global default route
   * and raise an alert.
   * </pre>
   *
   * <code>repeated .grpc.lookup.v1.HttpKeyBuilder http_keybuilders = 1;</code>
   */
  java.util.List<HttpKeyBuilder>
      getHttpKeybuildersList();
  /**
   * <pre>
   * Ordered specifications for constructing keys for HTTP requests.  Last
   * match wins.  If no HttpKeyBuilder matches, an empty key_map will be sent to
   * the lookup service; it should likely reply with a global default route
   * and raise an alert.
   * </pre>
   *
   * <code>repeated .grpc.lookup.v1.HttpKeyBuilder http_keybuilders = 1;</code>
   */
  HttpKeyBuilder getHttpKeybuilders(int index);
  /**
   * <pre>
   * Ordered specifications for constructing keys for HTTP requests.  Last
   * match wins.  If no HttpKeyBuilder matches, an empty key_map will be sent to
   * the lookup service; it should likely reply with a global default route
   * and raise an alert.
   * </pre>
   *
   * <code>repeated .grpc.lookup.v1.HttpKeyBuilder http_keybuilders = 1;</code>
   */
  int getHttpKeybuildersCount();
  /**
   * <pre>
   * Ordered specifications for constructing keys for HTTP requests.  Last
   * match wins.  If no HttpKeyBuilder matches, an empty key_map will be sent to
   * the lookup service; it should likely reply with a global default route
   * and raise an alert.
   * </pre>
   *
   * <code>repeated .grpc.lookup.v1.HttpKeyBuilder http_keybuilders = 1;</code>
   */
  java.util.List<? extends HttpKeyBuilderOrBuilder>
      getHttpKeybuildersOrBuilderList();
  /**
   * <pre>
   * Ordered specifications for constructing keys for HTTP requests.  Last
   * match wins.  If no HttpKeyBuilder matches, an empty key_map will be sent to
   * the lookup service; it should likely reply with a global default route
   * and raise an alert.
   * </pre>
   *
   * <code>repeated .grpc.lookup.v1.HttpKeyBuilder http_keybuilders = 1;</code>
   */
  HttpKeyBuilderOrBuilder getHttpKeybuildersOrBuilder(
      int index);

  /**
   * <pre>
   * Unordered specifications for constructing keys for gRPC requests.  All
   * GrpcKeyBuilders on this list must have unique "name" fields so that the
   * client is free to prebuild a hash map keyed by name.  If no GrpcKeyBuilder
   * matches, an empty key_map will be sent to the lookup service; it should
   * likely reply with a global default route and raise an alert.
   * </pre>
   *
   * <code>repeated .grpc.lookup.v1.GrpcKeyBuilder grpc_keybuilders = 2;</code>
   */
  java.util.List<GrpcKeyBuilder>
      getGrpcKeybuildersList();
  /**
   * <pre>
   * Unordered specifications for constructing keys for gRPC requests.  All
   * GrpcKeyBuilders on this list must have unique "name" fields so that the
   * client is free to prebuild a hash map keyed by name.  If no GrpcKeyBuilder
   * matches, an empty key_map will be sent to the lookup service; it should
   * likely reply with a global default route and raise an alert.
   * </pre>
   *
   * <code>repeated .grpc.lookup.v1.GrpcKeyBuilder grpc_keybuilders = 2;</code>
   */
  GrpcKeyBuilder getGrpcKeybuilders(int index);
  /**
   * <pre>
   * Unordered specifications for constructing keys for gRPC requests.  All
   * GrpcKeyBuilders on this list must have unique "name" fields so that the
   * client is free to prebuild a hash map keyed by name.  If no GrpcKeyBuilder
   * matches, an empty key_map will be sent to the lookup service; it should
   * likely reply with a global default route and raise an alert.
   * </pre>
   *
   * <code>repeated .grpc.lookup.v1.GrpcKeyBuilder grpc_keybuilders = 2;</code>
   */
  int getGrpcKeybuildersCount();
  /**
   * <pre>
   * Unordered specifications for constructing keys for gRPC requests.  All
   * GrpcKeyBuilders on this list must have unique "name" fields so that the
   * client is free to prebuild a hash map keyed by name.  If no GrpcKeyBuilder
   * matches, an empty key_map will be sent to the lookup service; it should
   * likely reply with a global default route and raise an alert.
   * </pre>
   *
   * <code>repeated .grpc.lookup.v1.GrpcKeyBuilder grpc_keybuilders = 2;</code>
   */
  java.util.List<? extends GrpcKeyBuilderOrBuilder>
      getGrpcKeybuildersOrBuilderList();
  /**
   * <pre>
   * Unordered specifications for constructing keys for gRPC requests.  All
   * GrpcKeyBuilders on this list must have unique "name" fields so that the
   * client is free to prebuild a hash map keyed by name.  If no GrpcKeyBuilder
   * matches, an empty key_map will be sent to the lookup service; it should
   * likely reply with a global default route and raise an alert.
   * </pre>
   *
   * <code>repeated .grpc.lookup.v1.GrpcKeyBuilder grpc_keybuilders = 2;</code>
   */
  GrpcKeyBuilderOrBuilder getGrpcKeybuildersOrBuilder(
      int index);

  /**
   * <pre>
   * The name of the lookup service as a gRPC URI.  Typically, this will be
   * a subdomain of the target, such as "lookup.datastore.googleapis.com".
   * </pre>
   *
   * <code>string lookup_service = 3;</code>
   */
  String getLookupService();
  /**
   * <pre>
   * The name of the lookup service as a gRPC URI.  Typically, this will be
   * a subdomain of the target, such as "lookup.datastore.googleapis.com".
   * </pre>
   *
   * <code>string lookup_service = 3;</code>
   */
  com.google.protobuf.ByteString
      getLookupServiceBytes();

  /**
   * <pre>
   * Configure a timeout value for lookup service requests.
   * Defaults to 10 seconds if not specified.
   * </pre>
   *
   * <code>.google.protobuf.Duration lookup_service_timeout = 4;</code>
   */
  boolean hasLookupServiceTimeout();
  /**
   * <pre>
   * Configure a timeout value for lookup service requests.
   * Defaults to 10 seconds if not specified.
   * </pre>
   *
   * <code>.google.protobuf.Duration lookup_service_timeout = 4;</code>
   */
  com.google.protobuf.Duration getLookupServiceTimeout();
  /**
   * <pre>
   * Configure a timeout value for lookup service requests.
   * Defaults to 10 seconds if not specified.
   * </pre>
   *
   * <code>.google.protobuf.Duration lookup_service_timeout = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getLookupServiceTimeoutOrBuilder();

  /**
   * <pre>
   * How long are responses valid for (like HTTP Cache-Control).
   * If omitted or zero, the longest valid cache time is used.
   * This value is clamped to 5 minutes to avoid unflushable bad responses.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age = 5;</code>
   */
  boolean hasMaxAge();
  /**
   * <pre>
   * How long are responses valid for (like HTTP Cache-Control).
   * If omitted or zero, the longest valid cache time is used.
   * This value is clamped to 5 minutes to avoid unflushable bad responses.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age = 5;</code>
   */
  com.google.protobuf.Duration getMaxAge();
  /**
   * <pre>
   * How long are responses valid for (like HTTP Cache-Control).
   * If omitted or zero, the longest valid cache time is used.
   * This value is clamped to 5 minutes to avoid unflushable bad responses.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxAgeOrBuilder();

  /**
   * <pre>
   * After a response has been in the client cache for this amount of time
   * and is re-requested, start an asynchronous RPC to re-validate it.
   * This value should be less than max_age by at least the length of a
   * typical RTT to the Route Lookup Service to fully mask the RTT latency.
   * If omitted, keys are only re-requested after they have expired.
   * </pre>
   *
   * <code>.google.protobuf.Duration stale_age = 6;</code>
   */
  boolean hasStaleAge();
  /**
   * <pre>
   * After a response has been in the client cache for this amount of time
   * and is re-requested, start an asynchronous RPC to re-validate it.
   * This value should be less than max_age by at least the length of a
   * typical RTT to the Route Lookup Service to fully mask the RTT latency.
   * If omitted, keys are only re-requested after they have expired.
   * </pre>
   *
   * <code>.google.protobuf.Duration stale_age = 6;</code>
   */
  com.google.protobuf.Duration getStaleAge();
  /**
   * <pre>
   * After a response has been in the client cache for this amount of time
   * and is re-requested, start an asynchronous RPC to re-validate it.
   * This value should be less than max_age by at least the length of a
   * typical RTT to the Route Lookup Service to fully mask the RTT latency.
   * If omitted, keys are only re-requested after they have expired.
   * </pre>
   *
   * <code>.google.protobuf.Duration stale_age = 6;</code>
   */
  com.google.protobuf.DurationOrBuilder getStaleAgeOrBuilder();

  /**
   * <pre>
   * Rough indicator of amount of memory to use for the client cache.  Some of
   * the data structure overhead is not accounted for, so actual memory consumed
   * will be somewhat greater than this value.  If this field is omitted or set
   * to zero, a client default will be used.  The value may be capped to a lower
   * amount based on client configuration.
   * </pre>
   *
   * <code>int64 cache_size_bytes = 7;</code>
   */
  long getCacheSizeBytes();

  /**
   * <pre>
   * This is a list of all the possible targets that can be returned by the
   * lookup service.  If a target not on this list is returned, it will be
   * treated the same as an RPC error from the RLS.
   * </pre>
   *
   * <code>repeated string valid_targets = 8;</code>
   */
  java.util.List<String>
      getValidTargetsList();
  /**
   * <pre>
   * This is a list of all the possible targets that can be returned by the
   * lookup service.  If a target not on this list is returned, it will be
   * treated the same as an RPC error from the RLS.
   * </pre>
   *
   * <code>repeated string valid_targets = 8;</code>
   */
  int getValidTargetsCount();
  /**
   * <pre>
   * This is a list of all the possible targets that can be returned by the
   * lookup service.  If a target not on this list is returned, it will be
   * treated the same as an RPC error from the RLS.
   * </pre>
   *
   * <code>repeated string valid_targets = 8;</code>
   */
  String getValidTargets(int index);
  /**
   * <pre>
   * This is a list of all the possible targets that can be returned by the
   * lookup service.  If a target not on this list is returned, it will be
   * treated the same as an RPC error from the RLS.
   * </pre>
   *
   * <code>repeated string valid_targets = 8;</code>
   */
  com.google.protobuf.ByteString
      getValidTargetsBytes(int index);

  /**
   * <pre>
   * This value provides a default target to use if needed.  It will be used for
   * request processing strategy SYNC_LOOKUP_DEFAULT_TARGET_ON_ERROR if RLS
   * returns an error, or strategy ASYNC_LOOKUP_DEFAULT_TARGET_ON_MISS if RLS
   * returns an error or there is a cache miss in the client.  It will also be
   * used if there are no healthy backends for an RLS target.  Note that
   * requests can be routed only to a subdomain of the original target,
   * e.g. "us_east_1.cloudbigtable.googleapis.com".
   * </pre>
   *
   * <code>string default_target = 9;</code>
   */
  String getDefaultTarget();
  /**
   * <pre>
   * This value provides a default target to use if needed.  It will be used for
   * request processing strategy SYNC_LOOKUP_DEFAULT_TARGET_ON_ERROR if RLS
   * returns an error, or strategy ASYNC_LOOKUP_DEFAULT_TARGET_ON_MISS if RLS
   * returns an error or there is a cache miss in the client.  It will also be
   * used if there are no healthy backends for an RLS target.  Note that
   * requests can be routed only to a subdomain of the original target,
   * e.g. "us_east_1.cloudbigtable.googleapis.com".
   * </pre>
   *
   * <code>string default_target = 9;</code>
   */
  com.google.protobuf.ByteString
      getDefaultTargetBytes();

  /**
   * <code>.grpc.lookup.v1.RouteLookupConfig.RequestProcessingStrategy request_processing_strategy = 10;</code>
   */
  int getRequestProcessingStrategyValue();
  /**
   * <code>.grpc.lookup.v1.RouteLookupConfig.RequestProcessingStrategy request_processing_strategy = 10;</code>
   */
  RouteLookupConfig.RequestProcessingStrategy getRequestProcessingStrategy();
}
