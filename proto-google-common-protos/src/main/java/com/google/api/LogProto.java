// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/log.proto

package com.google.api;

public final class LogProto {
  private LogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_LogDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_LogDescriptor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\024google/api/log.proto\022\ngoogle.api\032\026goog" +
      "le/api/label.proto\"u\n\rLogDescriptor\022\014\n\004n" +
      "ame\030\001 \001(\t\022+\n\006labels\030\002 \003(\0132\033.google.api.L" +
      "abelDescriptor\022\023\n\013description\030\003 \001(\t\022\024\n\014d" +
      "isplay_name\030\004 \001(\tBj\n\016com.google.apiB\010Log" +
      "ProtoP\001ZEgoogle.golang.org/genproto/goog" +
      "leapis/api/serviceconfig;serviceconfig\242\002" +
      "\004GAPIb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          LabelProto.getDescriptor(),
        }, assigner);
    internal_static_google_api_LogDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_LogDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_LogDescriptor_descriptor,
        new String[] { "Name", "Labels", "Description", "DisplayName", });
    LabelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
