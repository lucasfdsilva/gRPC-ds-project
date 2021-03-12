package com.proto.email;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: clinic/email.proto")
public final class UserRegistrationEmailGrpc {

  private UserRegistrationEmailGrpc() {}

  public static final String SERVICE_NAME = "UserRegistrationEmail";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.email.SendEmailRequest,
      com.proto.email.SendEmailResponse> getNewEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "newEmail",
      requestType = com.proto.email.SendEmailRequest.class,
      responseType = com.proto.email.SendEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.email.SendEmailRequest,
      com.proto.email.SendEmailResponse> getNewEmailMethod() {
    io.grpc.MethodDescriptor<com.proto.email.SendEmailRequest, com.proto.email.SendEmailResponse> getNewEmailMethod;
    if ((getNewEmailMethod = UserRegistrationEmailGrpc.getNewEmailMethod) == null) {
      synchronized (UserRegistrationEmailGrpc.class) {
        if ((getNewEmailMethod = UserRegistrationEmailGrpc.getNewEmailMethod) == null) {
          UserRegistrationEmailGrpc.getNewEmailMethod = getNewEmailMethod =
              io.grpc.MethodDescriptor.<com.proto.email.SendEmailRequest, com.proto.email.SendEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "newEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.email.SendEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.email.SendEmailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserRegistrationEmailMethodDescriptorSupplier("newEmail"))
              .build();
        }
      }
    }
    return getNewEmailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserRegistrationEmailStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserRegistrationEmailStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserRegistrationEmailStub>() {
        @java.lang.Override
        public UserRegistrationEmailStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserRegistrationEmailStub(channel, callOptions);
        }
      };
    return UserRegistrationEmailStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserRegistrationEmailBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserRegistrationEmailBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserRegistrationEmailBlockingStub>() {
        @java.lang.Override
        public UserRegistrationEmailBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserRegistrationEmailBlockingStub(channel, callOptions);
        }
      };
    return UserRegistrationEmailBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserRegistrationEmailFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserRegistrationEmailFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserRegistrationEmailFutureStub>() {
        @java.lang.Override
        public UserRegistrationEmailFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserRegistrationEmailFutureStub(channel, callOptions);
        }
      };
    return UserRegistrationEmailFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserRegistrationEmailImplBase implements io.grpc.BindableService {

    /**
     */
    public void newEmail(com.proto.email.SendEmailRequest request,
        io.grpc.stub.StreamObserver<com.proto.email.SendEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewEmailMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNewEmailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.email.SendEmailRequest,
                com.proto.email.SendEmailResponse>(
                  this, METHODID_NEW_EMAIL)))
          .build();
    }
  }

  /**
   */
  public static final class UserRegistrationEmailStub extends io.grpc.stub.AbstractAsyncStub<UserRegistrationEmailStub> {
    private UserRegistrationEmailStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserRegistrationEmailStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserRegistrationEmailStub(channel, callOptions);
    }

    /**
     */
    public void newEmail(com.proto.email.SendEmailRequest request,
        io.grpc.stub.StreamObserver<com.proto.email.SendEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewEmailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserRegistrationEmailBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserRegistrationEmailBlockingStub> {
    private UserRegistrationEmailBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserRegistrationEmailBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserRegistrationEmailBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.email.SendEmailResponse newEmail(com.proto.email.SendEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewEmailMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserRegistrationEmailFutureStub extends io.grpc.stub.AbstractFutureStub<UserRegistrationEmailFutureStub> {
    private UserRegistrationEmailFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserRegistrationEmailFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserRegistrationEmailFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.email.SendEmailResponse> newEmail(
        com.proto.email.SendEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewEmailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NEW_EMAIL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserRegistrationEmailImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserRegistrationEmailImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NEW_EMAIL:
          serviceImpl.newEmail((com.proto.email.SendEmailRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.email.SendEmailResponse>) responseObserver);
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

  private static abstract class UserRegistrationEmailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserRegistrationEmailBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.email.Email.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserRegistrationEmail");
    }
  }

  private static final class UserRegistrationEmailFileDescriptorSupplier
      extends UserRegistrationEmailBaseDescriptorSupplier {
    UserRegistrationEmailFileDescriptorSupplier() {}
  }

  private static final class UserRegistrationEmailMethodDescriptorSupplier
      extends UserRegistrationEmailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserRegistrationEmailMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserRegistrationEmailGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserRegistrationEmailFileDescriptorSupplier())
              .addMethod(getNewEmailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
