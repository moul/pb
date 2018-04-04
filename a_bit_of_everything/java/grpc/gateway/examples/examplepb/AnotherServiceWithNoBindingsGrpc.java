package grpc.gateway.examples.examplepb;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: a_bit_of_everything.proto")
public final class AnotherServiceWithNoBindingsGrpc {

  private AnotherServiceWithNoBindingsGrpc() {}

  public static final String SERVICE_NAME = "grpc.gateway.examples.examplepb.AnotherServiceWithNoBindings";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> METHOD_NO_BINDINGS =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.gateway.examples.examplepb.AnotherServiceWithNoBindings", "NoBindings"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnotherServiceWithNoBindingsStub newStub(io.grpc.Channel channel) {
    return new AnotherServiceWithNoBindingsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnotherServiceWithNoBindingsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AnotherServiceWithNoBindingsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnotherServiceWithNoBindingsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AnotherServiceWithNoBindingsFutureStub(channel);
  }

  /**
   */
  public static abstract class AnotherServiceWithNoBindingsImplBase implements io.grpc.BindableService {

    /**
     */
    public void noBindings(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_NO_BINDINGS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_NO_BINDINGS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_NO_BINDINGS)))
          .build();
    }
  }

  /**
   */
  public static final class AnotherServiceWithNoBindingsStub extends io.grpc.stub.AbstractStub<AnotherServiceWithNoBindingsStub> {
    private AnotherServiceWithNoBindingsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnotherServiceWithNoBindingsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnotherServiceWithNoBindingsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnotherServiceWithNoBindingsStub(channel, callOptions);
    }

    /**
     */
    public void noBindings(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NO_BINDINGS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnotherServiceWithNoBindingsBlockingStub extends io.grpc.stub.AbstractStub<AnotherServiceWithNoBindingsBlockingStub> {
    private AnotherServiceWithNoBindingsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnotherServiceWithNoBindingsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnotherServiceWithNoBindingsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnotherServiceWithNoBindingsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty noBindings(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_NO_BINDINGS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnotherServiceWithNoBindingsFutureStub extends io.grpc.stub.AbstractStub<AnotherServiceWithNoBindingsFutureStub> {
    private AnotherServiceWithNoBindingsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnotherServiceWithNoBindingsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnotherServiceWithNoBindingsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnotherServiceWithNoBindingsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> noBindings(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NO_BINDINGS, getCallOptions()), request);
    }
  }

  private static final int METHODID_NO_BINDINGS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnotherServiceWithNoBindingsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnotherServiceWithNoBindingsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NO_BINDINGS:
          serviceImpl.noBindings((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static final class AnotherServiceWithNoBindingsDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AnotherServiceWithNoBindingsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnotherServiceWithNoBindingsDescriptorSupplier())
              .addMethod(METHOD_NO_BINDINGS)
              .build();
        }
      }
    }
    return result;
  }
}
