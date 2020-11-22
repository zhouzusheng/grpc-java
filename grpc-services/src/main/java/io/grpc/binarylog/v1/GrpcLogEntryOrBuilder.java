// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/binlog/v1/binarylog.proto

package io.grpc.binarylog.v1;

public interface GrpcLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.binarylog.v1.GrpcLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The timestamp of the binary log message
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * The timestamp of the binary log message
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <pre>
   * The timestamp of the binary log message
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * Uniquely identifies a call. The value must not be 0 in order to disambiguate
   * from an unset value.
   * Each call may have several log entries, they will all have the same call_id.
   * Nothing is guaranteed about their value other than they are unique across
   * different RPCs in the same gRPC process.
   * </pre>
   *
   * <code>uint64 call_id = 2;</code>
   */
  long getCallId();

  /**
   * <pre>
   * The entry sequence id for this call. The first GrpcLogEntry has a
   * value of 1, to disambiguate from an unset value. The purpose of
   * this field is to detect missing entries in environments where
   * durability or ordering is not guaranteed.
   * </pre>
   *
   * <code>uint64 sequence_id_within_call = 3;</code>
   */
  long getSequenceIdWithinCall();

  /**
   * <code>.grpc.binarylog.v1.GrpcLogEntry.EventType type = 4;</code>
   */
  int getTypeValue();
  /**
   * <code>.grpc.binarylog.v1.GrpcLogEntry.EventType type = 4;</code>
   */
  GrpcLogEntry.EventType getType();

  /**
   * <pre>
   * One of the above Logger enum
   * </pre>
   *
   * <code>.grpc.binarylog.v1.GrpcLogEntry.Logger logger = 5;</code>
   */
  int getLoggerValue();
  /**
   * <pre>
   * One of the above Logger enum
   * </pre>
   *
   * <code>.grpc.binarylog.v1.GrpcLogEntry.Logger logger = 5;</code>
   */
  GrpcLogEntry.Logger getLogger();

  /**
   * <code>.grpc.binarylog.v1.ClientHeader client_header = 6;</code>
   */
  boolean hasClientHeader();
  /**
   * <code>.grpc.binarylog.v1.ClientHeader client_header = 6;</code>
   */
  ClientHeader getClientHeader();
  /**
   * <code>.grpc.binarylog.v1.ClientHeader client_header = 6;</code>
   */
  ClientHeaderOrBuilder getClientHeaderOrBuilder();

  /**
   * <code>.grpc.binarylog.v1.ServerHeader server_header = 7;</code>
   */
  boolean hasServerHeader();
  /**
   * <code>.grpc.binarylog.v1.ServerHeader server_header = 7;</code>
   */
  ServerHeader getServerHeader();
  /**
   * <code>.grpc.binarylog.v1.ServerHeader server_header = 7;</code>
   */
  ServerHeaderOrBuilder getServerHeaderOrBuilder();

  /**
   * <pre>
   * Used by EVENT_TYPE_CLIENT_MESSAGE, EVENT_TYPE_SERVER_MESSAGE
   * </pre>
   *
   * <code>.grpc.binarylog.v1.Message message = 8;</code>
   */
  boolean hasMessage();
  /**
   * <pre>
   * Used by EVENT_TYPE_CLIENT_MESSAGE, EVENT_TYPE_SERVER_MESSAGE
   * </pre>
   *
   * <code>.grpc.binarylog.v1.Message message = 8;</code>
   */
  Message getMessage();
  /**
   * <pre>
   * Used by EVENT_TYPE_CLIENT_MESSAGE, EVENT_TYPE_SERVER_MESSAGE
   * </pre>
   *
   * <code>.grpc.binarylog.v1.Message message = 8;</code>
   */
  MessageOrBuilder getMessageOrBuilder();

  /**
   * <code>.grpc.binarylog.v1.Trailer trailer = 9;</code>
   */
  boolean hasTrailer();
  /**
   * <code>.grpc.binarylog.v1.Trailer trailer = 9;</code>
   */
  Trailer getTrailer();
  /**
   * <code>.grpc.binarylog.v1.Trailer trailer = 9;</code>
   */
  TrailerOrBuilder getTrailerOrBuilder();

  /**
   * <pre>
   * true if payload does not represent the full message or metadata.
   * </pre>
   *
   * <code>bool payload_truncated = 10;</code>
   */
  boolean getPayloadTruncated();

  /**
   * <pre>
   * Peer address information, will only be recorded on the first
   * incoming event. On client side, peer is logged on
   * EVENT_TYPE_SERVER_HEADER normally or EVENT_TYPE_SERVER_TRAILER in
   * the case of trailers-only. On server side, peer is always
   * logged on EVENT_TYPE_CLIENT_HEADER.
   * </pre>
   *
   * <code>.grpc.binarylog.v1.Address peer = 11;</code>
   */
  boolean hasPeer();
  /**
   * <pre>
   * Peer address information, will only be recorded on the first
   * incoming event. On client side, peer is logged on
   * EVENT_TYPE_SERVER_HEADER normally or EVENT_TYPE_SERVER_TRAILER in
   * the case of trailers-only. On server side, peer is always
   * logged on EVENT_TYPE_CLIENT_HEADER.
   * </pre>
   *
   * <code>.grpc.binarylog.v1.Address peer = 11;</code>
   */
  Address getPeer();
  /**
   * <pre>
   * Peer address information, will only be recorded on the first
   * incoming event. On client side, peer is logged on
   * EVENT_TYPE_SERVER_HEADER normally or EVENT_TYPE_SERVER_TRAILER in
   * the case of trailers-only. On server side, peer is always
   * logged on EVENT_TYPE_CLIENT_HEADER.
   * </pre>
   *
   * <code>.grpc.binarylog.v1.Address peer = 11;</code>
   */
  AddressOrBuilder getPeerOrBuilder();

  public GrpcLogEntry.PayloadCase getPayloadCase();
}
