// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/binlog/v1/binarylog.proto

package io.grpc.binarylog.v1;

public interface MetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.binarylog.v1.Metadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .grpc.binarylog.v1.MetadataEntry entry = 1;</code>
   */
  java.util.List<MetadataEntry>
      getEntryList();
  /**
   * <code>repeated .grpc.binarylog.v1.MetadataEntry entry = 1;</code>
   */
  MetadataEntry getEntry(int index);
  /**
   * <code>repeated .grpc.binarylog.v1.MetadataEntry entry = 1;</code>
   */
  int getEntryCount();
  /**
   * <code>repeated .grpc.binarylog.v1.MetadataEntry entry = 1;</code>
   */
  java.util.List<? extends MetadataEntryOrBuilder>
      getEntryOrBuilderList();
  /**
   * <code>repeated .grpc.binarylog.v1.MetadataEntry entry = 1;</code>
   */
  MetadataEntryOrBuilder getEntryOrBuilder(
      int index);
}
