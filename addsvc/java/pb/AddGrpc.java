package pb;

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
 * The Add service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: addsvc.proto")
public final class AddGrpc {

  private AddGrpc() {}

  public static final String SERVICE_NAME = "pb.Add";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<pb.Addsvc.SumRequest,
      pb.Addsvc.SumReply> METHOD_SUM =
      io.grpc.MethodDescriptor.<pb.Addsvc.SumRequest, pb.Addsvc.SumReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "pb.Add", "Sum"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              pb.Addsvc.SumRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              pb.Addsvc.SumReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<pb.Addsvc.ConcatRequest,
      pb.Addsvc.ConcatReply> METHOD_CONCAT =
      io.grpc.MethodDescriptor.<pb.Addsvc.ConcatRequest, pb.Addsvc.ConcatReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "pb.Add", "Concat"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              pb.Addsvc.ConcatRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              pb.Addsvc.ConcatReply.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AddStub newStub(io.grpc.Channel channel) {
    return new AddStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AddBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AddBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AddFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AddFutureStub(channel);
  }

  /**
   * <pre>
   * The Add service definition.
   * </pre>
   */
  public static abstract class AddImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sums two integers.
     * </pre>
     */
    public void sum(pb.Addsvc.SumRequest request,
        io.grpc.stub.StreamObserver<pb.Addsvc.SumReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SUM, responseObserver);
    }

    /**
     * <pre>
     * Concatenates two strings
     * </pre>
     */
    public void concat(pb.Addsvc.ConcatRequest request,
        io.grpc.stub.StreamObserver<pb.Addsvc.ConcatReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CONCAT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SUM,
            asyncUnaryCall(
              new MethodHandlers<
                pb.Addsvc.SumRequest,
                pb.Addsvc.SumReply>(
                  this, METHODID_SUM)))
          .addMethod(
            METHOD_CONCAT,
            asyncUnaryCall(
              new MethodHandlers<
                pb.Addsvc.ConcatRequest,
                pb.Addsvc.ConcatReply>(
                  this, METHODID_CONCAT)))
          .build();
    }
  }

  /**
   * <pre>
   * The Add service definition.
   * </pre>
   */
  public static final class AddStub extends io.grpc.stub.AbstractStub<AddStub> {
    private AddStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sums two integers.
     * </pre>
     */
    public void sum(pb.Addsvc.SumRequest request,
        io.grpc.stub.StreamObserver<pb.Addsvc.SumReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SUM, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Concatenates two strings
     * </pre>
     */
    public void concat(pb.Addsvc.ConcatRequest request,
        io.grpc.stub.StreamObserver<pb.Addsvc.ConcatReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CONCAT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Add service definition.
   * </pre>
   */
  public static final class AddBlockingStub extends io.grpc.stub.AbstractStub<AddBlockingStub> {
    private AddBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sums two integers.
     * </pre>
     */
    public pb.Addsvc.SumReply sum(pb.Addsvc.SumRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SUM, getCallOptions(), request);
    }

    /**
     * <pre>
     * Concatenates two strings
     * </pre>
     */
    public pb.Addsvc.ConcatReply concat(pb.Addsvc.ConcatRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CONCAT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Add service definition.
   * </pre>
   */
  public static final class AddFutureStub extends io.grpc.stub.AbstractStub<AddFutureStub> {
    private AddFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sums two integers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pb.Addsvc.SumReply> sum(
        pb.Addsvc.SumRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SUM, getCallOptions()), request);
    }

    /**
     * <pre>
     * Concatenates two strings
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pb.Addsvc.ConcatReply> concat(
        pb.Addsvc.ConcatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CONCAT, getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;
  private static final int METHODID_CONCAT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AddImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AddImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((pb.Addsvc.SumRequest) request,
              (io.grpc.stub.StreamObserver<pb.Addsvc.SumReply>) responseObserver);
          break;
        case METHODID_CONCAT:
          serviceImpl.concat((pb.Addsvc.ConcatRequest) request,
              (io.grpc.stub.StreamObserver<pb.Addsvc.ConcatReply>) responseObserver);
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

  private static final class AddDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pb.Addsvc.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AddGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AddDescriptorSupplier())
              .addMethod(METHOD_SUM)
              .addMethod(METHOD_CONCAT)
              .build();
        }
      }
    }
    return result;
  }
}
