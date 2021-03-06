// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/lookup/v1/rls.proto

package io.grpc.lookup.v1;

public final class RlsProto {
  private RlsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_lookup_v1_RouteLookupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_lookup_v1_RouteLookupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_lookup_v1_RouteLookupRequest_KeyMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_lookup_v1_RouteLookupRequest_KeyMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_lookup_v1_RouteLookupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_lookup_v1_RouteLookupResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\030grpc/lookup/v1/rls.proto\022\016grpc.lookup." +
      "v1\"\267\001\n\022RouteLookupRequest\022\016\n\006server\030\001 \001(" +
      "\t\022\014\n\004path\030\002 \001(\t\022\023\n\013target_type\030\003 \001(\t\022?\n\007" +
      "key_map\030\004 \003(\0132..grpc.lookup.v1.RouteLook" +
      "upRequest.KeyMapEntry\032-\n\013KeyMapEntry\022\013\n\003" +
      "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"O\n\023RouteLoo" +
      "kupResponse\022\022\n\006target\030\001 \001(\tB\002\030\001\022\017\n\007targe" +
      "ts\030\003 \003(\t\022\023\n\013header_data\030\002 \001(\t2n\n\022RouteLo" +
      "okupService\022X\n\013RouteLookup\022\".grpc.lookup" +
      ".v1.RouteLookupRequest\032#.grpc.lookup.v1." +
      "RouteLookupResponse\"\000BM\n\021io.grpc.lookup." +
      "v1B\010RlsProtoP\001Z,google.golang.org/grpc/l" +
      "ookup/grpc_lookup_v1b\006proto3"
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
        }, assigner);
    internal_static_grpc_lookup_v1_RouteLookupRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_lookup_v1_RouteLookupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_lookup_v1_RouteLookupRequest_descriptor,
        new String[] { "Server", "Path", "TargetType", "KeyMap", });
    internal_static_grpc_lookup_v1_RouteLookupRequest_KeyMapEntry_descriptor =
      internal_static_grpc_lookup_v1_RouteLookupRequest_descriptor.getNestedTypes().get(0);
    internal_static_grpc_lookup_v1_RouteLookupRequest_KeyMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_lookup_v1_RouteLookupRequest_KeyMapEntry_descriptor,
        new String[] { "Key", "Value", });
    internal_static_grpc_lookup_v1_RouteLookupResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_lookup_v1_RouteLookupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_lookup_v1_RouteLookupResponse_descriptor,
        new String[] { "Target", "Targets", "HeaderData", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
