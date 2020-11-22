// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

public interface ChannelTraceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.channelz.v1.ChannelTrace)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Number of events ever logged in this tracing object. This can differ from
   * events.size() because events can be overwritten or garbage collected by
   * implementations.
   * </pre>
   *
   * <code>int64 num_events_logged = 1;</code>
   */
  long getNumEventsLogged();

  /**
   * <pre>
   * Time that this channel was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_timestamp = 2;</code>
   */
  boolean hasCreationTimestamp();
  /**
   * <pre>
   * Time that this channel was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_timestamp = 2;</code>
   */
  com.google.protobuf.Timestamp getCreationTimestamp();
  /**
   * <pre>
   * Time that this channel was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_timestamp = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreationTimestampOrBuilder();

  /**
   * <pre>
   * List of events that have occurred on this channel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
   */
  java.util.List<ChannelTraceEvent>
      getEventsList();
  /**
   * <pre>
   * List of events that have occurred on this channel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
   */
  ChannelTraceEvent getEvents(int index);
  /**
   * <pre>
   * List of events that have occurred on this channel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
   */
  int getEventsCount();
  /**
   * <pre>
   * List of events that have occurred on this channel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
   */
  java.util.List<? extends ChannelTraceEventOrBuilder>
      getEventsOrBuilderList();
  /**
   * <pre>
   * List of events that have occurred on this channel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
   */
  ChannelTraceEventOrBuilder getEventsOrBuilder(
      int index);
}
