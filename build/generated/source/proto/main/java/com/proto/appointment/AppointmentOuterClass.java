// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: clinic/appointment.proto

package com.proto.appointment;

public final class AppointmentOuterClass {
  private AppointmentOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appointment_Appointment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appointment_Appointment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appointment_NewAppointmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appointment_NewAppointmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appointment_NewAppointmentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appointment_NewAppointmentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appointment_ViewAppointmentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appointment_ViewAppointmentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appointment_ViewAppointmentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appointment_ViewAppointmentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appointment_UpdateAppointmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appointment_UpdateAppointmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appointment_UpdateAppointmentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appointment_UpdateAppointmentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appointment_DeleteAppointmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appointment_DeleteAppointmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appointment_DeleteAppointmentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appointment_DeleteAppointmentResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030clinic/appointment.proto\022\013appointment\"" +
      "t\n\013Appointment\022\n\n\002id\030\001 \001(\005\022\022\n\nfirst_name" +
      "\030\002 \001(\t\022\021\n\tlast_name\030\003 \001(\t\022\030\n\020appointment" +
      "_date\030\004 \001(\t\022\030\n\020appointment_time\030\005 \001(\t\"F\n" +
      "\025NewAppointmentRequest\022-\n\013appointment\030\001 " +
      "\001(\0132\030.appointment.Appointment\"(\n\026NewAppo" +
      "intmentResponse\022\016\n\006result\030\001 \001(\t\"*\n\027ViewA" +
      "ppointmentsRequest\022\017\n\007request\030\001 \001(\t\"*\n\030V" +
      "iewAppointmentsResponse\022\016\n\006result\030\001 \001(\t\"" +
      "I\n\030UpdateAppointmentRequest\022-\n\013appointme" +
      "nt\030\001 \001(\0132\030.appointment.Appointment\"+\n\031Up" +
      "dateAppointmentResponse\022\016\n\006result\030\001 \001(\t\"" +
      "&\n\030DeleteAppointmentRequest\022\n\n\002id\030\001 \001(\005\"" +
      "+\n\031DeleteAppointmentResponse\022\016\n\006result\030\001" +
      " \001(\t2\234\003\n\022AppointmentService\022[\n\016newAppoin" +
      "tment\022\".appointment.NewAppointmentReques" +
      "t\032#.appointment.NewAppointmentResponse\"\000" +
      "\022a\n\020viewAppointments\022$.appointment.ViewA" +
      "ppointmentsRequest\032%.appointment.ViewApp" +
      "ointmentsResponse0\001\022b\n\021updateAppointment" +
      "\022%.appointment.UpdateAppointmentRequest\032" +
      "&.appointment.UpdateAppointmentResponse\022" +
      "b\n\021deleteAppointment\022%.appointment.Delet" +
      "eAppointmentRequest\032&.appointment.Delete" +
      "AppointmentResponseB\031\n\025com.proto.appoint" +
      "mentP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_appointment_Appointment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_appointment_Appointment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appointment_Appointment_descriptor,
        new java.lang.String[] { "Id", "FirstName", "LastName", "AppointmentDate", "AppointmentTime", });
    internal_static_appointment_NewAppointmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_appointment_NewAppointmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appointment_NewAppointmentRequest_descriptor,
        new java.lang.String[] { "Appointment", });
    internal_static_appointment_NewAppointmentResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_appointment_NewAppointmentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appointment_NewAppointmentResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_appointment_ViewAppointmentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_appointment_ViewAppointmentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appointment_ViewAppointmentsRequest_descriptor,
        new java.lang.String[] { "Request", });
    internal_static_appointment_ViewAppointmentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_appointment_ViewAppointmentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appointment_ViewAppointmentsResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_appointment_UpdateAppointmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_appointment_UpdateAppointmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appointment_UpdateAppointmentRequest_descriptor,
        new java.lang.String[] { "Appointment", });
    internal_static_appointment_UpdateAppointmentResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_appointment_UpdateAppointmentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appointment_UpdateAppointmentResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_appointment_DeleteAppointmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_appointment_DeleteAppointmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appointment_DeleteAppointmentRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_appointment_DeleteAppointmentResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_appointment_DeleteAppointmentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appointment_DeleteAppointmentResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
