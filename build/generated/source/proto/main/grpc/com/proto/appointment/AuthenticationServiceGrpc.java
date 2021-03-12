package com.proto.appointment;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: clinic/authentication.proto")
public final class AuthenticationServiceGrpc {

  private AuthenticationServiceGrpc() {}

  public static final String SERVICE_NAME = "authentication.AuthenticationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.appointment.AuthenticationRequest,
      com.proto.appointment.AuthenticationResponse> getAuthenticationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "authentication",
      requestType = com.proto.appointment.AuthenticationRequest.class,
      responseType = com.proto.appointment.AuthenticationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.appointment.AuthenticationRequest,
      com.proto.appointment.AuthenticationResponse> getAuthenticationMethod() {
    io.grpc.MethodDescriptor<com.proto.appointment.AuthenticationRequest, com.proto.appointment.AuthenticationResponse> getAuthenticationMethod;
    if ((getAuthenticationMethod = AuthenticationServiceGrpc.getAuthenticationMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getAuthenticationMethod = AuthenticationServiceGrpc.getAuthenticationMethod) == null) {
          AuthenticationServiceGrpc.getAuthenticationMethod = getAuthenticationMethod =
              io.grpc.MethodDescriptor.<com.proto.appointment.AuthenticationRequest, com.proto.appointment.AuthenticationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "authentication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.appointment.AuthenticationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.appointment.AuthenticationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("authentication"))
              .build();
        }
      }
    }
    return getAuthenticationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.appointment.NewUserRequest,
      com.proto.appointment.NewUserResponse> getNewUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "newUser",
      requestType = com.proto.appointment.NewUserRequest.class,
      responseType = com.proto.appointment.NewUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.appointment.NewUserRequest,
      com.proto.appointment.NewUserResponse> getNewUserMethod() {
    io.grpc.MethodDescriptor<com.proto.appointment.NewUserRequest, com.proto.appointment.NewUserResponse> getNewUserMethod;
    if ((getNewUserMethod = AuthenticationServiceGrpc.getNewUserMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getNewUserMethod = AuthenticationServiceGrpc.getNewUserMethod) == null) {
          AuthenticationServiceGrpc.getNewUserMethod = getNewUserMethod =
              io.grpc.MethodDescriptor.<com.proto.appointment.NewUserRequest, com.proto.appointment.NewUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "newUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.appointment.NewUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.appointment.NewUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("newUser"))
              .build();
        }
      }
    }
    return getNewUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.appointment.ViewUsersRequest,
      com.proto.appointment.ViewUsersResponse> getViewUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "viewUsers",
      requestType = com.proto.appointment.ViewUsersRequest.class,
      responseType = com.proto.appointment.ViewUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.appointment.ViewUsersRequest,
      com.proto.appointment.ViewUsersResponse> getViewUsersMethod() {
    io.grpc.MethodDescriptor<com.proto.appointment.ViewUsersRequest, com.proto.appointment.ViewUsersResponse> getViewUsersMethod;
    if ((getViewUsersMethod = AuthenticationServiceGrpc.getViewUsersMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getViewUsersMethod = AuthenticationServiceGrpc.getViewUsersMethod) == null) {
          AuthenticationServiceGrpc.getViewUsersMethod = getViewUsersMethod =
              io.grpc.MethodDescriptor.<com.proto.appointment.ViewUsersRequest, com.proto.appointment.ViewUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "viewUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.appointment.ViewUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.appointment.ViewUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("viewUsers"))
              .build();
        }
      }
    }
    return getViewUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.appointment.UpdateUserRequest,
      com.proto.appointment.UpdateUserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUser",
      requestType = com.proto.appointment.UpdateUserRequest.class,
      responseType = com.proto.appointment.UpdateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.appointment.UpdateUserRequest,
      com.proto.appointment.UpdateUserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.proto.appointment.UpdateUserRequest, com.proto.appointment.UpdateUserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = AuthenticationServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getUpdateUserMethod = AuthenticationServiceGrpc.getUpdateUserMethod) == null) {
          AuthenticationServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.proto.appointment.UpdateUserRequest, com.proto.appointment.UpdateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.appointment.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.appointment.UpdateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("updateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.appointment.DeleteUserRequest,
      com.proto.appointment.DeleteUserResponse> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUser",
      requestType = com.proto.appointment.DeleteUserRequest.class,
      responseType = com.proto.appointment.DeleteUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.appointment.DeleteUserRequest,
      com.proto.appointment.DeleteUserResponse> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.proto.appointment.DeleteUserRequest, com.proto.appointment.DeleteUserResponse> getDeleteUserMethod;
    if ((getDeleteUserMethod = AuthenticationServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getDeleteUserMethod = AuthenticationServiceGrpc.getDeleteUserMethod) == null) {
          AuthenticationServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<com.proto.appointment.DeleteUserRequest, com.proto.appointment.DeleteUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.appointment.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.appointment.DeleteUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("deleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthenticationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceStub>() {
        @java.lang.Override
        public AuthenticationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthenticationServiceStub(channel, callOptions);
        }
      };
    return AuthenticationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthenticationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceBlockingStub>() {
        @java.lang.Override
        public AuthenticationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthenticationServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthenticationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthenticationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceFutureStub>() {
        @java.lang.Override
        public AuthenticationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthenticationServiceFutureStub(channel, callOptions);
        }
      };
    return AuthenticationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AuthenticationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void authentication(com.proto.appointment.AuthenticationRequest request,
        io.grpc.stub.StreamObserver<com.proto.appointment.AuthenticationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticationMethod(), responseObserver);
    }

    /**
     */
    public void newUser(com.proto.appointment.NewUserRequest request,
        io.grpc.stub.StreamObserver<com.proto.appointment.NewUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewUserMethod(), responseObserver);
    }

    /**
     */
    public void viewUsers(com.proto.appointment.ViewUsersRequest request,
        io.grpc.stub.StreamObserver<com.proto.appointment.ViewUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUsersMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(com.proto.appointment.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.proto.appointment.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(com.proto.appointment.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.proto.appointment.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthenticationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.appointment.AuthenticationRequest,
                com.proto.appointment.AuthenticationResponse>(
                  this, METHODID_AUTHENTICATION)))
          .addMethod(
            getNewUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.appointment.NewUserRequest,
                com.proto.appointment.NewUserResponse>(
                  this, METHODID_NEW_USER)))
          .addMethod(
            getViewUsersMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.appointment.ViewUsersRequest,
                com.proto.appointment.ViewUsersResponse>(
                  this, METHODID_VIEW_USERS)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.appointment.UpdateUserRequest,
                com.proto.appointment.UpdateUserResponse>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.appointment.DeleteUserRequest,
                com.proto.appointment.DeleteUserResponse>(
                  this, METHODID_DELETE_USER)))
          .build();
    }
  }

  /**
   */
  public static final class AuthenticationServiceStub extends io.grpc.stub.AbstractAsyncStub<AuthenticationServiceStub> {
    private AuthenticationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthenticationServiceStub(channel, callOptions);
    }

    /**
     */
    public void authentication(com.proto.appointment.AuthenticationRequest request,
        io.grpc.stub.StreamObserver<com.proto.appointment.AuthenticationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void newUser(com.proto.appointment.NewUserRequest request,
        io.grpc.stub.StreamObserver<com.proto.appointment.NewUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewUsers(com.proto.appointment.ViewUsersRequest request,
        io.grpc.stub.StreamObserver<com.proto.appointment.ViewUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getViewUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.proto.appointment.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.proto.appointment.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.proto.appointment.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.proto.appointment.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthenticationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthenticationServiceBlockingStub> {
    private AuthenticationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthenticationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.appointment.AuthenticationResponse authentication(com.proto.appointment.AuthenticationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.appointment.NewUserResponse newUser(com.proto.appointment.NewUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.appointment.ViewUsersResponse> viewUsers(
        com.proto.appointment.ViewUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getViewUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.appointment.UpdateUserResponse updateUser(com.proto.appointment.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.appointment.DeleteUserResponse deleteUser(com.proto.appointment.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthenticationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AuthenticationServiceFutureStub> {
    private AuthenticationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthenticationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.appointment.AuthenticationResponse> authentication(
        com.proto.appointment.AuthenticationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.appointment.NewUserResponse> newUser(
        com.proto.appointment.NewUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.appointment.UpdateUserResponse> updateUser(
        com.proto.appointment.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.appointment.DeleteUserResponse> deleteUser(
        com.proto.appointment.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHENTICATION = 0;
  private static final int METHODID_NEW_USER = 1;
  private static final int METHODID_VIEW_USERS = 2;
  private static final int METHODID_UPDATE_USER = 3;
  private static final int METHODID_DELETE_USER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthenticationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthenticationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHENTICATION:
          serviceImpl.authentication((com.proto.appointment.AuthenticationRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.appointment.AuthenticationResponse>) responseObserver);
          break;
        case METHODID_NEW_USER:
          serviceImpl.newUser((com.proto.appointment.NewUserRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.appointment.NewUserResponse>) responseObserver);
          break;
        case METHODID_VIEW_USERS:
          serviceImpl.viewUsers((com.proto.appointment.ViewUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.appointment.ViewUsersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.proto.appointment.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.appointment.UpdateUserResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.proto.appointment.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.appointment.DeleteUserResponse>) responseObserver);
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

  private static abstract class AuthenticationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthenticationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.appointment.Authentication.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthenticationService");
    }
  }

  private static final class AuthenticationServiceFileDescriptorSupplier
      extends AuthenticationServiceBaseDescriptorSupplier {
    AuthenticationServiceFileDescriptorSupplier() {}
  }

  private static final class AuthenticationServiceMethodDescriptorSupplier
      extends AuthenticationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthenticationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthenticationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthenticationServiceFileDescriptorSupplier())
              .addMethod(getAuthenticationMethod())
              .addMethod(getNewUserMethod())
              .addMethod(getViewUsersMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
