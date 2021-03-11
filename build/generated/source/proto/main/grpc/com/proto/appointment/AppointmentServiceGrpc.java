package com.proto.appointment;

import java.util.Iterator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: clinic/appointment.proto")
public final class AppointmentServiceGrpc {

  private AppointmentServiceGrpc() {}

  public static final String SERVICE_NAME = "appointment.AppointmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.appointment.AppointmentRequest,
      com.proto.appointment.AppointmentResponse> getNewAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "newAppointment",
      requestType = com.proto.appointment.AppointmentRequest.class,
      responseType = com.proto.appointment.AppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.appointment.AppointmentRequest,
      com.proto.appointment.AppointmentResponse> getNewAppointmentMethod() {
    io.grpc.MethodDescriptor<com.proto.appointment.AppointmentRequest, com.proto.appointment.AppointmentResponse> getNewAppointmentMethod;
    if ((getNewAppointmentMethod = AppointmentServiceGrpc.getNewAppointmentMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getNewAppointmentMethod = AppointmentServiceGrpc.getNewAppointmentMethod) == null) {
          AppointmentServiceGrpc.getNewAppointmentMethod = getNewAppointmentMethod =
              io.grpc.MethodDescriptor.<com.proto.appointment.AppointmentRequest, com.proto.appointment.AppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "newAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.appointment.AppointmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.appointment.AppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("newAppointment"))
              .build();
        }
      }
    }
    return getNewAppointmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.appointment.ViewAppointmentsRequest,
      com.proto.appointment.ViewAppointmentsResponse> getViewAppointmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "viewAppointments",
      requestType = com.proto.appointment.ViewAppointmentsRequest.class,
      responseType = com.proto.appointment.ViewAppointmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.appointment.ViewAppointmentsRequest,
      com.proto.appointment.ViewAppointmentsResponse> getViewAppointmentsMethod() {
    io.grpc.MethodDescriptor<com.proto.appointment.ViewAppointmentsRequest, com.proto.appointment.ViewAppointmentsResponse> getViewAppointmentsMethod;
    if ((getViewAppointmentsMethod = AppointmentServiceGrpc.getViewAppointmentsMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getViewAppointmentsMethod = AppointmentServiceGrpc.getViewAppointmentsMethod) == null) {
          AppointmentServiceGrpc.getViewAppointmentsMethod = getViewAppointmentsMethod =
              io.grpc.MethodDescriptor.<com.proto.appointment.ViewAppointmentsRequest, com.proto.appointment.ViewAppointmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "viewAppointments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.appointment.ViewAppointmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.appointment.ViewAppointmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("viewAppointments"))
              .build();
        }
      }
    }
    return getViewAppointmentsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppointmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceStub>() {
        @java.lang.Override
        public AppointmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentServiceStub(channel, callOptions);
        }
      };
    return AppointmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppointmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceBlockingStub>() {
        @java.lang.Override
        public AppointmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentServiceBlockingStub(channel, callOptions);
        }
      };
    return AppointmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppointmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceFutureStub>() {
        @java.lang.Override
        public AppointmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentServiceFutureStub(channel, callOptions);
        }
      };
    return AppointmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AppointmentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void newAppointment(com.proto.appointment.AppointmentRequest request,
        io.grpc.stub.StreamObserver<com.proto.appointment.AppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewAppointmentMethod(), responseObserver);
    }

    /**
     */
    public void viewAppointments(com.proto.appointment.ViewAppointmentsRequest request,
        io.grpc.stub.StreamObserver<com.proto.appointment.ViewAppointmentsResponse> responseObserver) throws InterruptedException {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAppointmentsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNewAppointmentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.appointment.AppointmentRequest,
                com.proto.appointment.AppointmentResponse>(
                  this, METHODID_NEW_APPOINTMENT)))
          .addMethod(
            getViewAppointmentsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.appointment.ViewAppointmentsRequest,
                com.proto.appointment.ViewAppointmentsResponse>(
                  this, METHODID_VIEW_APPOINTMENTS)))
          .build();
    }
  }

  /**
   */
  public static final class AppointmentServiceStub extends io.grpc.stub.AbstractAsyncStub<AppointmentServiceStub> {
    private AppointmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppointmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentServiceStub(channel, callOptions);
    }

    /**
     */
    public void newAppointment(com.proto.appointment.AppointmentRequest request,
        io.grpc.stub.StreamObserver<com.proto.appointment.AppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewAppointmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewAppointments(com.proto.appointment.ViewAppointmentsRequest request,
        io.grpc.stub.StreamObserver<com.proto.appointment.ViewAppointmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getViewAppointmentsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AppointmentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AppointmentServiceBlockingStub> {
    private AppointmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppointmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.appointment.AppointmentResponse newAppointment(com.proto.appointment.AppointmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewAppointmentMethod(), getCallOptions(), request);
    }

    /**
     * @return
     */
    public Iterator<ViewAppointmentsResponse> viewAppointments(
        ViewAppointmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getViewAppointmentsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AppointmentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AppointmentServiceFutureStub> {
    private AppointmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppointmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.appointment.AppointmentResponse> newAppointment(
        com.proto.appointment.AppointmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewAppointmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NEW_APPOINTMENT = 0;
  private static final int METHODID_VIEW_APPOINTMENTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AppointmentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AppointmentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NEW_APPOINTMENT:
          serviceImpl.newAppointment((com.proto.appointment.AppointmentRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.appointment.AppointmentResponse>) responseObserver);
          break;
        case METHODID_VIEW_APPOINTMENTS:
          try {
            serviceImpl.viewAppointments((ViewAppointmentsRequest) request,
                (io.grpc.stub.StreamObserver<ViewAppointmentsResponse>) responseObserver);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AppointmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppointmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.appointment.AppointmentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppointmentService");
    }
  }

  private static final class AppointmentServiceFileDescriptorSupplier
      extends AppointmentServiceBaseDescriptorSupplier {
    AppointmentServiceFileDescriptorSupplier() {}
  }

  private static final class AppointmentServiceMethodDescriptorSupplier
      extends AppointmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AppointmentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AppointmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppointmentServiceFileDescriptorSupplier())
              .addMethod(getNewAppointmentMethod())
              .addMethod(getViewAppointmentsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
