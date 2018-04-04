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
 * <pre>
 * camelCase and lowercase service names are valid but not recommended (use TitleCase instead)
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: a_bit_of_everything.proto")
public final class camelCaseServiceNameGrpc {

  private camelCaseServiceNameGrpc() {}

  public static final String SERVICE_NAME = "grpc.gateway.examples.examplepb.camelCaseServiceName";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> METHOD_EMPTY =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.gateway.examples.examplepb.camelCaseServiceName", "Empty"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static camelCaseServiceNameStub newStub(io.grpc.Channel channel) {
    return new camelCaseServiceNameStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static camelCaseServiceNameBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new camelCaseServiceNameBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static camelCaseServiceNameFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new camelCaseServiceNameFutureStub(channel);
  }

  /**
   * <pre>
   * camelCase and lowercase service names are valid but not recommended (use TitleCase instead)
   * </pre>
   */
  public static abstract class camelCaseServiceNameImplBase implements io.grpc.BindableService {

    /**
     */
    public void empty(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EMPTY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_EMPTY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_EMPTY)))
          .build();
    }
  }

  /**
   * <pre>
   * camelCase and lowercase service names are valid but not recommended (use TitleCase instead)
   * </pre>
   */
  public static final class camelCaseServiceNameStub extends io.grpc.stub.AbstractStub<camelCaseServiceNameStub> {
    private camelCaseServiceNameStub(io.grpc.Channel channel) {
      super(channel);
    }

    private camelCaseServiceNameStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected camelCaseServiceNameStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new camelCaseServiceNameStub(channel, callOptions);
    }

    /**
     */
    public void empty(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EMPTY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * camelCase and lowercase service names are valid but not recommended (use TitleCase instead)
   * </pre>
   */
  public static final class camelCaseServiceNameBlockingStub extends io.grpc.stub.AbstractStub<camelCaseServiceNameBlockingStub> {
    private camelCaseServiceNameBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private camelCaseServiceNameBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected camelCaseServiceNameBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new camelCaseServiceNameBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty empty(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EMPTY, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * camelCase and lowercase service names are valid but not recommended (use TitleCase instead)
   * </pre>
   */
  public static final class camelCaseServiceNameFutureStub extends io.grpc.stub.AbstractStub<camelCaseServiceNameFutureStub> {
    private camelCaseServiceNameFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private camelCaseServiceNameFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected camelCaseServiceNameFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new camelCaseServiceNameFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> empty(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EMPTY, getCallOptions()), request);
    }
  }

  private static final int METHODID_EMPTY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final camelCaseServiceNameImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(camelCaseServiceNameImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EMPTY:
          serviceImpl.empty((com.google.protobuf.Empty) request,
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

  private static final class camelCaseServiceNameDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (camelCaseServiceNameGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new camelCaseServiceNameDescriptorSupplier())
              .addMethod(METHOD_EMPTY)
              .build();
        }
      }
    }
    return result;
  }
}
