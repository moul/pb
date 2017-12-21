package grpcbin;

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
    comments = "Source: grpcbin.proto")
public final class GRPCBinGrpc {

  private GRPCBinGrpc() {}

  public static final String SERVICE_NAME = "grpcbin.GRPCBin";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpcbin.Grpcbin.EmptyMessage,
      grpcbin.Grpcbin.IndexReply> METHOD_INDEX =
      io.grpc.MethodDescriptor.<grpcbin.Grpcbin.EmptyMessage, grpcbin.Grpcbin.IndexReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcbin.GRPCBin", "Index"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.EmptyMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.IndexReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpcbin.Grpcbin.EmptyMessage,
      grpcbin.Grpcbin.EmptyMessage> METHOD_EMPTY =
      io.grpc.MethodDescriptor.<grpcbin.Grpcbin.EmptyMessage, grpcbin.Grpcbin.EmptyMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcbin.GRPCBin", "Empty"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.EmptyMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.EmptyMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpcbin.Grpcbin.DummyMessage,
      grpcbin.Grpcbin.DummyMessage> METHOD_DUMMY_UNARY =
      io.grpc.MethodDescriptor.<grpcbin.Grpcbin.DummyMessage, grpcbin.Grpcbin.DummyMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcbin.GRPCBin", "DummyUnary"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.DummyMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.DummyMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpcbin.Grpcbin.DummyMessage,
      grpcbin.Grpcbin.DummyMessage> METHOD_DUMMY_SERVER_STREAM =
      io.grpc.MethodDescriptor.<grpcbin.Grpcbin.DummyMessage, grpcbin.Grpcbin.DummyMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "grpcbin.GRPCBin", "DummyServerStream"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.DummyMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.DummyMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpcbin.Grpcbin.DummyMessage,
      grpcbin.Grpcbin.DummyMessage> METHOD_DUMMY_CLIENT_STREAM =
      io.grpc.MethodDescriptor.<grpcbin.Grpcbin.DummyMessage, grpcbin.Grpcbin.DummyMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "grpcbin.GRPCBin", "DummyClientStream"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.DummyMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.DummyMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpcbin.Grpcbin.DummyMessage,
      grpcbin.Grpcbin.DummyMessage> METHOD_DUMMY_BIDIRECTIONAL_STREAM_STREAM =
      io.grpc.MethodDescriptor.<grpcbin.Grpcbin.DummyMessage, grpcbin.Grpcbin.DummyMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "grpcbin.GRPCBin", "DummyBidirectionalStreamStream"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.DummyMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.DummyMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpcbin.Grpcbin.SpecificErrorRequest,
      grpcbin.Grpcbin.EmptyMessage> METHOD_SPECIFIC_ERROR =
      io.grpc.MethodDescriptor.<grpcbin.Grpcbin.SpecificErrorRequest, grpcbin.Grpcbin.EmptyMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcbin.GRPCBin", "SpecificError"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.SpecificErrorRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.EmptyMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpcbin.Grpcbin.EmptyMessage,
      grpcbin.Grpcbin.EmptyMessage> METHOD_RANDOM_ERROR =
      io.grpc.MethodDescriptor.<grpcbin.Grpcbin.EmptyMessage, grpcbin.Grpcbin.EmptyMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcbin.GRPCBin", "RandomError"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.EmptyMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.EmptyMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpcbin.Grpcbin.EmptyMessage,
      grpcbin.Grpcbin.HeadersMessage> METHOD_HEADERS_UNARY =
      io.grpc.MethodDescriptor.<grpcbin.Grpcbin.EmptyMessage, grpcbin.Grpcbin.HeadersMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcbin.GRPCBin", "HeadersUnary"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.EmptyMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.HeadersMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpcbin.Grpcbin.EmptyMessage,
      grpcbin.Grpcbin.EmptyMessage> METHOD_NO_RESPONSE_UNARY =
      io.grpc.MethodDescriptor.<grpcbin.Grpcbin.EmptyMessage, grpcbin.Grpcbin.EmptyMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcbin.GRPCBin", "NoResponseUnary"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.EmptyMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpcbin.Grpcbin.EmptyMessage.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GRPCBinStub newStub(io.grpc.Channel channel) {
    return new GRPCBinStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GRPCBinBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GRPCBinBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GRPCBinFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GRPCBinFutureStub(channel);
  }

  /**
   */
  public static abstract class GRPCBinImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * This endpoint
     * </pre>
     */
    public void index(grpcbin.Grpcbin.EmptyMessage request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.IndexReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INDEX, responseObserver);
    }

    /**
     * <pre>
     * Unary endpoint that takes no argument and replies an empty message.
     * </pre>
     */
    public void empty(grpcbin.Grpcbin.EmptyMessage request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.EmptyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EMPTY, responseObserver);
    }

    /**
     * <pre>
     * Unary endpoint that replies a received DummyMessage
     * </pre>
     */
    public void dummyUnary(grpcbin.Grpcbin.DummyMessage request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DUMMY_UNARY, responseObserver);
    }

    /**
     * <pre>
     * Stream endpoint that sends back 10 times the received DummyMessage
     * </pre>
     */
    public void dummyServerStream(grpcbin.Grpcbin.DummyMessage request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DUMMY_SERVER_STREAM, responseObserver);
    }

    /**
     * <pre>
     * Stream endpoint that receives 10 DummyMessages and replies with the last received one
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage> dummyClientStream(
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_DUMMY_CLIENT_STREAM, responseObserver);
    }

    /**
     * <pre>
     * Stream endpoint that sends back a received DummyMessage indefinitely (chat mode)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage> dummyBidirectionalStreamStream(
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_DUMMY_BIDIRECTIONAL_STREAM_STREAM, responseObserver);
    }

    /**
     * <pre>
     * Unary endpoint that raises a specified (by code) gRPC error
     * </pre>
     */
    public void specificError(grpcbin.Grpcbin.SpecificErrorRequest request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.EmptyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SPECIFIC_ERROR, responseObserver);
    }

    /**
     * <pre>
     * Unary endpoint that raises a random gRPC error
     * </pre>
     */
    public void randomError(grpcbin.Grpcbin.EmptyMessage request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.EmptyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RANDOM_ERROR, responseObserver);
    }

    /**
     * <pre>
     * Unary endpoint that returns headers
     * </pre>
     */
    public void headersUnary(grpcbin.Grpcbin.EmptyMessage request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.HeadersMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HEADERS_UNARY, responseObserver);
    }

    /**
     * <pre>
     * Unary endpoint that returns no respnose
     * </pre>
     */
    public void noResponseUnary(grpcbin.Grpcbin.EmptyMessage request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.EmptyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_NO_RESPONSE_UNARY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_INDEX,
            asyncUnaryCall(
              new MethodHandlers<
                grpcbin.Grpcbin.EmptyMessage,
                grpcbin.Grpcbin.IndexReply>(
                  this, METHODID_INDEX)))
          .addMethod(
            METHOD_EMPTY,
            asyncUnaryCall(
              new MethodHandlers<
                grpcbin.Grpcbin.EmptyMessage,
                grpcbin.Grpcbin.EmptyMessage>(
                  this, METHODID_EMPTY)))
          .addMethod(
            METHOD_DUMMY_UNARY,
            asyncUnaryCall(
              new MethodHandlers<
                grpcbin.Grpcbin.DummyMessage,
                grpcbin.Grpcbin.DummyMessage>(
                  this, METHODID_DUMMY_UNARY)))
          .addMethod(
            METHOD_DUMMY_SERVER_STREAM,
            asyncServerStreamingCall(
              new MethodHandlers<
                grpcbin.Grpcbin.DummyMessage,
                grpcbin.Grpcbin.DummyMessage>(
                  this, METHODID_DUMMY_SERVER_STREAM)))
          .addMethod(
            METHOD_DUMMY_CLIENT_STREAM,
            asyncClientStreamingCall(
              new MethodHandlers<
                grpcbin.Grpcbin.DummyMessage,
                grpcbin.Grpcbin.DummyMessage>(
                  this, METHODID_DUMMY_CLIENT_STREAM)))
          .addMethod(
            METHOD_DUMMY_BIDIRECTIONAL_STREAM_STREAM,
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpcbin.Grpcbin.DummyMessage,
                grpcbin.Grpcbin.DummyMessage>(
                  this, METHODID_DUMMY_BIDIRECTIONAL_STREAM_STREAM)))
          .addMethod(
            METHOD_SPECIFIC_ERROR,
            asyncUnaryCall(
              new MethodHandlers<
                grpcbin.Grpcbin.SpecificErrorRequest,
                grpcbin.Grpcbin.EmptyMessage>(
                  this, METHODID_SPECIFIC_ERROR)))
          .addMethod(
            METHOD_RANDOM_ERROR,
            asyncUnaryCall(
              new MethodHandlers<
                grpcbin.Grpcbin.EmptyMessage,
                grpcbin.Grpcbin.EmptyMessage>(
                  this, METHODID_RANDOM_ERROR)))
          .addMethod(
            METHOD_HEADERS_UNARY,
            asyncUnaryCall(
              new MethodHandlers<
                grpcbin.Grpcbin.EmptyMessage,
                grpcbin.Grpcbin.HeadersMessage>(
                  this, METHODID_HEADERS_UNARY)))
          .addMethod(
            METHOD_NO_RESPONSE_UNARY,
            asyncUnaryCall(
              new MethodHandlers<
                grpcbin.Grpcbin.EmptyMessage,
                grpcbin.Grpcbin.EmptyMessage>(
                  this, METHODID_NO_RESPONSE_UNARY)))
          .build();
    }
  }

  /**
   */
  public static final class GRPCBinStub extends io.grpc.stub.AbstractStub<GRPCBinStub> {
    private GRPCBinStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GRPCBinStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GRPCBinStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GRPCBinStub(channel, callOptions);
    }

    /**
     * <pre>
     * This endpoint
     * </pre>
     */
    public void index(grpcbin.Grpcbin.EmptyMessage request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.IndexReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INDEX, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary endpoint that takes no argument and replies an empty message.
     * </pre>
     */
    public void empty(grpcbin.Grpcbin.EmptyMessage request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.EmptyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EMPTY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary endpoint that replies a received DummyMessage
     * </pre>
     */
    public void dummyUnary(grpcbin.Grpcbin.DummyMessage request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DUMMY_UNARY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream endpoint that sends back 10 times the received DummyMessage
     * </pre>
     */
    public void dummyServerStream(grpcbin.Grpcbin.DummyMessage request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_DUMMY_SERVER_STREAM, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream endpoint that receives 10 DummyMessages and replies with the last received one
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage> dummyClientStream(
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_DUMMY_CLIENT_STREAM, getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Stream endpoint that sends back a received DummyMessage indefinitely (chat mode)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage> dummyBidirectionalStreamStream(
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_DUMMY_BIDIRECTIONAL_STREAM_STREAM, getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Unary endpoint that raises a specified (by code) gRPC error
     * </pre>
     */
    public void specificError(grpcbin.Grpcbin.SpecificErrorRequest request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.EmptyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SPECIFIC_ERROR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary endpoint that raises a random gRPC error
     * </pre>
     */
    public void randomError(grpcbin.Grpcbin.EmptyMessage request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.EmptyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RANDOM_ERROR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary endpoint that returns headers
     * </pre>
     */
    public void headersUnary(grpcbin.Grpcbin.EmptyMessage request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.HeadersMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HEADERS_UNARY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary endpoint that returns no respnose
     * </pre>
     */
    public void noResponseUnary(grpcbin.Grpcbin.EmptyMessage request,
        io.grpc.stub.StreamObserver<grpcbin.Grpcbin.EmptyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NO_RESPONSE_UNARY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GRPCBinBlockingStub extends io.grpc.stub.AbstractStub<GRPCBinBlockingStub> {
    private GRPCBinBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GRPCBinBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GRPCBinBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GRPCBinBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * This endpoint
     * </pre>
     */
    public grpcbin.Grpcbin.IndexReply index(grpcbin.Grpcbin.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INDEX, getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary endpoint that takes no argument and replies an empty message.
     * </pre>
     */
    public grpcbin.Grpcbin.EmptyMessage empty(grpcbin.Grpcbin.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EMPTY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary endpoint that replies a received DummyMessage
     * </pre>
     */
    public grpcbin.Grpcbin.DummyMessage dummyUnary(grpcbin.Grpcbin.DummyMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DUMMY_UNARY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Stream endpoint that sends back 10 times the received DummyMessage
     * </pre>
     */
    public java.util.Iterator<grpcbin.Grpcbin.DummyMessage> dummyServerStream(
        grpcbin.Grpcbin.DummyMessage request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_DUMMY_SERVER_STREAM, getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary endpoint that raises a specified (by code) gRPC error
     * </pre>
     */
    public grpcbin.Grpcbin.EmptyMessage specificError(grpcbin.Grpcbin.SpecificErrorRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SPECIFIC_ERROR, getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary endpoint that raises a random gRPC error
     * </pre>
     */
    public grpcbin.Grpcbin.EmptyMessage randomError(grpcbin.Grpcbin.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RANDOM_ERROR, getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary endpoint that returns headers
     * </pre>
     */
    public grpcbin.Grpcbin.HeadersMessage headersUnary(grpcbin.Grpcbin.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HEADERS_UNARY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary endpoint that returns no respnose
     * </pre>
     */
    public grpcbin.Grpcbin.EmptyMessage noResponseUnary(grpcbin.Grpcbin.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_NO_RESPONSE_UNARY, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GRPCBinFutureStub extends io.grpc.stub.AbstractStub<GRPCBinFutureStub> {
    private GRPCBinFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GRPCBinFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GRPCBinFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GRPCBinFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * This endpoint
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcbin.Grpcbin.IndexReply> index(
        grpcbin.Grpcbin.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INDEX, getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary endpoint that takes no argument and replies an empty message.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcbin.Grpcbin.EmptyMessage> empty(
        grpcbin.Grpcbin.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EMPTY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary endpoint that replies a received DummyMessage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcbin.Grpcbin.DummyMessage> dummyUnary(
        grpcbin.Grpcbin.DummyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DUMMY_UNARY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary endpoint that raises a specified (by code) gRPC error
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcbin.Grpcbin.EmptyMessage> specificError(
        grpcbin.Grpcbin.SpecificErrorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SPECIFIC_ERROR, getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary endpoint that raises a random gRPC error
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcbin.Grpcbin.EmptyMessage> randomError(
        grpcbin.Grpcbin.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RANDOM_ERROR, getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary endpoint that returns headers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcbin.Grpcbin.HeadersMessage> headersUnary(
        grpcbin.Grpcbin.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HEADERS_UNARY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary endpoint that returns no respnose
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcbin.Grpcbin.EmptyMessage> noResponseUnary(
        grpcbin.Grpcbin.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NO_RESPONSE_UNARY, getCallOptions()), request);
    }
  }

  private static final int METHODID_INDEX = 0;
  private static final int METHODID_EMPTY = 1;
  private static final int METHODID_DUMMY_UNARY = 2;
  private static final int METHODID_DUMMY_SERVER_STREAM = 3;
  private static final int METHODID_SPECIFIC_ERROR = 4;
  private static final int METHODID_RANDOM_ERROR = 5;
  private static final int METHODID_HEADERS_UNARY = 6;
  private static final int METHODID_NO_RESPONSE_UNARY = 7;
  private static final int METHODID_DUMMY_CLIENT_STREAM = 8;
  private static final int METHODID_DUMMY_BIDIRECTIONAL_STREAM_STREAM = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GRPCBinImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GRPCBinImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INDEX:
          serviceImpl.index((grpcbin.Grpcbin.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<grpcbin.Grpcbin.IndexReply>) responseObserver);
          break;
        case METHODID_EMPTY:
          serviceImpl.empty((grpcbin.Grpcbin.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<grpcbin.Grpcbin.EmptyMessage>) responseObserver);
          break;
        case METHODID_DUMMY_UNARY:
          serviceImpl.dummyUnary((grpcbin.Grpcbin.DummyMessage) request,
              (io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage>) responseObserver);
          break;
        case METHODID_DUMMY_SERVER_STREAM:
          serviceImpl.dummyServerStream((grpcbin.Grpcbin.DummyMessage) request,
              (io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage>) responseObserver);
          break;
        case METHODID_SPECIFIC_ERROR:
          serviceImpl.specificError((grpcbin.Grpcbin.SpecificErrorRequest) request,
              (io.grpc.stub.StreamObserver<grpcbin.Grpcbin.EmptyMessage>) responseObserver);
          break;
        case METHODID_RANDOM_ERROR:
          serviceImpl.randomError((grpcbin.Grpcbin.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<grpcbin.Grpcbin.EmptyMessage>) responseObserver);
          break;
        case METHODID_HEADERS_UNARY:
          serviceImpl.headersUnary((grpcbin.Grpcbin.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<grpcbin.Grpcbin.HeadersMessage>) responseObserver);
          break;
        case METHODID_NO_RESPONSE_UNARY:
          serviceImpl.noResponseUnary((grpcbin.Grpcbin.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<grpcbin.Grpcbin.EmptyMessage>) responseObserver);
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
        case METHODID_DUMMY_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.dummyClientStream(
              (io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage>) responseObserver);
        case METHODID_DUMMY_BIDIRECTIONAL_STREAM_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.dummyBidirectionalStreamStream(
              (io.grpc.stub.StreamObserver<grpcbin.Grpcbin.DummyMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class GRPCBinDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpcbin.Grpcbin.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GRPCBinGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GRPCBinDescriptorSupplier())
              .addMethod(METHOD_INDEX)
              .addMethod(METHOD_EMPTY)
              .addMethod(METHOD_DUMMY_UNARY)
              .addMethod(METHOD_DUMMY_SERVER_STREAM)
              .addMethod(METHOD_DUMMY_CLIENT_STREAM)
              .addMethod(METHOD_DUMMY_BIDIRECTIONAL_STREAM_STREAM)
              .addMethod(METHOD_SPECIFIC_ERROR)
              .addMethod(METHOD_RANDOM_ERROR)
              .addMethod(METHOD_HEADERS_UNARY)
              .addMethod(METHOD_NO_RESPONSE_UNARY)
              .build();
        }
      }
    }
    return result;
  }
}
