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
 * ABitOfEverything service is used to validate that APIs with complicated
 * proto messages and URL templates are still processed correctly.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: a_bit_of_everything.proto")
public final class ABitOfEverythingServiceGrpc {

  private ABitOfEverythingServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.gateway.examples.examplepb.ABitOfEverythingService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything,
      grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> METHOD_CREATE =
      io.grpc.MethodDescriptor.<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything, grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.gateway.examples.examplepb.ABitOfEverythingService", "Create"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything,
      grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> METHOD_CREATE_BODY =
      io.grpc.MethodDescriptor.<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything, grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.gateway.examples.examplepb.ABitOfEverythingService", "CreateBody"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sub2.Message.IdMessage,
      grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> METHOD_LOOKUP =
      io.grpc.MethodDescriptor.<sub2.Message.IdMessage, grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.gateway.examples.examplepb.ABitOfEverythingService", "Lookup"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sub2.Message.IdMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything,
      com.google.protobuf.Empty> METHOD_UPDATE =
      io.grpc.MethodDescriptor.<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.gateway.examples.examplepb.ABitOfEverythingService", "Update"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sub2.Message.IdMessage,
      com.google.protobuf.Empty> METHOD_DELETE =
      io.grpc.MethodDescriptor.<sub2.Message.IdMessage, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.gateway.examples.examplepb.ABitOfEverythingService", "Delete"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sub2.Message.IdMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything,
      com.google.protobuf.Empty> METHOD_GET_QUERY =
      io.grpc.MethodDescriptor.<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.gateway.examples.examplepb.ABitOfEverythingService", "GetQuery"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpc.gateway.examples.sub.Message.StringMessage,
      grpc.gateway.examples.sub.Message.StringMessage> METHOD_ECHO =
      io.grpc.MethodDescriptor.<grpc.gateway.examples.sub.Message.StringMessage, grpc.gateway.examples.sub.Message.StringMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.gateway.examples.examplepb.ABitOfEverythingService", "Echo"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.gateway.examples.sub.Message.StringMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.gateway.examples.sub.Message.StringMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything,
      grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> METHOD_DEEP_PATH_ECHO =
      io.grpc.MethodDescriptor.<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything, grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.gateway.examples.examplepb.ABitOfEverythingService", "DeepPathEcho"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Duration,
      com.google.protobuf.Empty> METHOD_NO_BINDINGS =
      io.grpc.MethodDescriptor.<com.google.protobuf.Duration, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.gateway.examples.examplepb.ABitOfEverythingService", "NoBindings"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Duration.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> METHOD_TIMEOUT =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.gateway.examples.examplepb.ABitOfEverythingService", "Timeout"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> METHOD_ERROR_WITH_DETAILS =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.gateway.examples.examplepb.ABitOfEverythingService", "ErrorWithDetails"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.MessageWithBody,
      com.google.protobuf.Empty> METHOD_GET_MESSAGE_WITH_BODY =
      io.grpc.MethodDescriptor.<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.MessageWithBody, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.gateway.examples.examplepb.ABitOfEverythingService", "GetMessageWithBody"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.MessageWithBody.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.Body,
      com.google.protobuf.Empty> METHOD_POST_WITH_EMPTY_BODY =
      io.grpc.MethodDescriptor.<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.Body, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.gateway.examples.examplepb.ABitOfEverythingService", "PostWithEmptyBody"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.Body.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ABitOfEverythingServiceStub newStub(io.grpc.Channel channel) {
    return new ABitOfEverythingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ABitOfEverythingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ABitOfEverythingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ABitOfEverythingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ABitOfEverythingServiceFutureStub(channel);
  }

  /**
   * <pre>
   * ABitOfEverything service is used to validate that APIs with complicated
   * proto messages and URL templates are still processed correctly.
   * </pre>
   */
  public static abstract class ABitOfEverythingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request,
        io.grpc.stub.StreamObserver<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void createBody(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request,
        io.grpc.stub.StreamObserver<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_BODY, responseObserver);
    }

    /**
     */
    public void lookup(sub2.Message.IdMessage request,
        io.grpc.stub.StreamObserver<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOOKUP, responseObserver);
    }

    /**
     */
    public void update(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     */
    public void delete(sub2.Message.IdMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     */
    public void getQuery(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_QUERY, responseObserver);
    }

    /**
     * <pre>
     * Echo allows posting a StringMessage value.
     * It also exposes multiple bindings.
     * This makes it useful when validating that the OpenAPI v2 API
     * description exposes documentation correctly on all paths
     * defined as additional_bindings in the proto.
     * </pre>
     */
    public void echo(grpc.gateway.examples.sub.Message.StringMessage request,
        io.grpc.stub.StreamObserver<grpc.gateway.examples.sub.Message.StringMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ECHO, responseObserver);
    }

    /**
     */
    public void deepPathEcho(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request,
        io.grpc.stub.StreamObserver<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEEP_PATH_ECHO, responseObserver);
    }

    /**
     */
    public void noBindings(com.google.protobuf.Duration request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_NO_BINDINGS, responseObserver);
    }

    /**
     */
    public void timeout(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TIMEOUT, responseObserver);
    }

    /**
     */
    public void errorWithDetails(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ERROR_WITH_DETAILS, responseObserver);
    }

    /**
     */
    public void getMessageWithBody(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.MessageWithBody request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MESSAGE_WITH_BODY, responseObserver);
    }

    /**
     */
    public void postWithEmptyBody(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.Body request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_POST_WITH_EMPTY_BODY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything,
                grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_CREATE_BODY,
            asyncUnaryCall(
              new MethodHandlers<
                grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything,
                grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything>(
                  this, METHODID_CREATE_BODY)))
          .addMethod(
            METHOD_LOOKUP,
            asyncUnaryCall(
              new MethodHandlers<
                sub2.Message.IdMessage,
                grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything>(
                  this, METHODID_LOOKUP)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                sub2.Message.IdMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_GET_QUERY,
            asyncUnaryCall(
              new MethodHandlers<
                grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything,
                com.google.protobuf.Empty>(
                  this, METHODID_GET_QUERY)))
          .addMethod(
            METHOD_ECHO,
            asyncUnaryCall(
              new MethodHandlers<
                grpc.gateway.examples.sub.Message.StringMessage,
                grpc.gateway.examples.sub.Message.StringMessage>(
                  this, METHODID_ECHO)))
          .addMethod(
            METHOD_DEEP_PATH_ECHO,
            asyncUnaryCall(
              new MethodHandlers<
                grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything,
                grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything>(
                  this, METHODID_DEEP_PATH_ECHO)))
          .addMethod(
            METHOD_NO_BINDINGS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Duration,
                com.google.protobuf.Empty>(
                  this, METHODID_NO_BINDINGS)))
          .addMethod(
            METHOD_TIMEOUT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_TIMEOUT)))
          .addMethod(
            METHOD_ERROR_WITH_DETAILS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_ERROR_WITH_DETAILS)))
          .addMethod(
            METHOD_GET_MESSAGE_WITH_BODY,
            asyncUnaryCall(
              new MethodHandlers<
                grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.MessageWithBody,
                com.google.protobuf.Empty>(
                  this, METHODID_GET_MESSAGE_WITH_BODY)))
          .addMethod(
            METHOD_POST_WITH_EMPTY_BODY,
            asyncUnaryCall(
              new MethodHandlers<
                grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.Body,
                com.google.protobuf.Empty>(
                  this, METHODID_POST_WITH_EMPTY_BODY)))
          .build();
    }
  }

  /**
   * <pre>
   * ABitOfEverything service is used to validate that APIs with complicated
   * proto messages and URL templates are still processed correctly.
   * </pre>
   */
  public static final class ABitOfEverythingServiceStub extends io.grpc.stub.AbstractStub<ABitOfEverythingServiceStub> {
    private ABitOfEverythingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ABitOfEverythingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABitOfEverythingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ABitOfEverythingServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request,
        io.grpc.stub.StreamObserver<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createBody(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request,
        io.grpc.stub.StreamObserver<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_BODY, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lookup(sub2.Message.IdMessage request,
        io.grpc.stub.StreamObserver<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOOKUP, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(sub2.Message.IdMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuery(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_QUERY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Echo allows posting a StringMessage value.
     * It also exposes multiple bindings.
     * This makes it useful when validating that the OpenAPI v2 API
     * description exposes documentation correctly on all paths
     * defined as additional_bindings in the proto.
     * </pre>
     */
    public void echo(grpc.gateway.examples.sub.Message.StringMessage request,
        io.grpc.stub.StreamObserver<grpc.gateway.examples.sub.Message.StringMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ECHO, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deepPathEcho(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request,
        io.grpc.stub.StreamObserver<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEEP_PATH_ECHO, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void noBindings(com.google.protobuf.Duration request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NO_BINDINGS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void timeout(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TIMEOUT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void errorWithDetails(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ERROR_WITH_DETAILS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMessageWithBody(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.MessageWithBody request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MESSAGE_WITH_BODY, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postWithEmptyBody(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.Body request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_POST_WITH_EMPTY_BODY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ABitOfEverything service is used to validate that APIs with complicated
   * proto messages and URL templates are still processed correctly.
   * </pre>
   */
  public static final class ABitOfEverythingServiceBlockingStub extends io.grpc.stub.AbstractStub<ABitOfEverythingServiceBlockingStub> {
    private ABitOfEverythingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ABitOfEverythingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABitOfEverythingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ABitOfEverythingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything create(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything createBody(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_BODY, getCallOptions(), request);
    }

    /**
     */
    public grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything lookup(sub2.Message.IdMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOOKUP, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty update(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty delete(sub2.Message.IdMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty getQuery(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_QUERY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Echo allows posting a StringMessage value.
     * It also exposes multiple bindings.
     * This makes it useful when validating that the OpenAPI v2 API
     * description exposes documentation correctly on all paths
     * defined as additional_bindings in the proto.
     * </pre>
     */
    public grpc.gateway.examples.sub.Message.StringMessage echo(grpc.gateway.examples.sub.Message.StringMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ECHO, getCallOptions(), request);
    }

    /**
     */
    public grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything deepPathEcho(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEEP_PATH_ECHO, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty noBindings(com.google.protobuf.Duration request) {
      return blockingUnaryCall(
          getChannel(), METHOD_NO_BINDINGS, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty timeout(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TIMEOUT, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty errorWithDetails(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ERROR_WITH_DETAILS, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty getMessageWithBody(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.MessageWithBody request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MESSAGE_WITH_BODY, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty postWithEmptyBody(grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.Body request) {
      return blockingUnaryCall(
          getChannel(), METHOD_POST_WITH_EMPTY_BODY, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ABitOfEverything service is used to validate that APIs with complicated
   * proto messages and URL templates are still processed correctly.
   * </pre>
   */
  public static final class ABitOfEverythingServiceFutureStub extends io.grpc.stub.AbstractStub<ABitOfEverythingServiceFutureStub> {
    private ABitOfEverythingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ABitOfEverythingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABitOfEverythingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ABitOfEverythingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> create(
        grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> createBody(
        grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_BODY, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> lookup(
        sub2.Message.IdMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOOKUP, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> update(
        grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> delete(
        sub2.Message.IdMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> getQuery(
        grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_QUERY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Echo allows posting a StringMessage value.
     * It also exposes multiple bindings.
     * This makes it useful when validating that the OpenAPI v2 API
     * description exposes documentation correctly on all paths
     * defined as additional_bindings in the proto.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.gateway.examples.sub.Message.StringMessage> echo(
        grpc.gateway.examples.sub.Message.StringMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ECHO, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything> deepPathEcho(
        grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEEP_PATH_ECHO, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> noBindings(
        com.google.protobuf.Duration request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NO_BINDINGS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> timeout(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TIMEOUT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> errorWithDetails(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ERROR_WITH_DETAILS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> getMessageWithBody(
        grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.MessageWithBody request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MESSAGE_WITH_BODY, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> postWithEmptyBody(
        grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.Body request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_POST_WITH_EMPTY_BODY, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CREATE_BODY = 1;
  private static final int METHODID_LOOKUP = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_GET_QUERY = 5;
  private static final int METHODID_ECHO = 6;
  private static final int METHODID_DEEP_PATH_ECHO = 7;
  private static final int METHODID_NO_BINDINGS = 8;
  private static final int METHODID_TIMEOUT = 9;
  private static final int METHODID_ERROR_WITH_DETAILS = 10;
  private static final int METHODID_GET_MESSAGE_WITH_BODY = 11;
  private static final int METHODID_POST_WITH_EMPTY_BODY = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ABitOfEverythingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ABitOfEverythingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything) request,
              (io.grpc.stub.StreamObserver<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything>) responseObserver);
          break;
        case METHODID_CREATE_BODY:
          serviceImpl.createBody((grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything) request,
              (io.grpc.stub.StreamObserver<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything>) responseObserver);
          break;
        case METHODID_LOOKUP:
          serviceImpl.lookup((sub2.Message.IdMessage) request,
              (io.grpc.stub.StreamObserver<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((sub2.Message.IdMessage) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_QUERY:
          serviceImpl.getQuery((grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ECHO:
          serviceImpl.echo((grpc.gateway.examples.sub.Message.StringMessage) request,
              (io.grpc.stub.StreamObserver<grpc.gateway.examples.sub.Message.StringMessage>) responseObserver);
          break;
        case METHODID_DEEP_PATH_ECHO:
          serviceImpl.deepPathEcho((grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything) request,
              (io.grpc.stub.StreamObserver<grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.ABitOfEverything>) responseObserver);
          break;
        case METHODID_NO_BINDINGS:
          serviceImpl.noBindings((com.google.protobuf.Duration) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_TIMEOUT:
          serviceImpl.timeout((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ERROR_WITH_DETAILS:
          serviceImpl.errorWithDetails((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_MESSAGE_WITH_BODY:
          serviceImpl.getMessageWithBody((grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.MessageWithBody) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_POST_WITH_EMPTY_BODY:
          serviceImpl.postWithEmptyBody((grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.Body) request,
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

  private static final class ABitOfEverythingServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.gateway.examples.examplepb.ABitOfEverythingOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ABitOfEverythingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ABitOfEverythingServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE)
              .addMethod(METHOD_CREATE_BODY)
              .addMethod(METHOD_LOOKUP)
              .addMethod(METHOD_UPDATE)
              .addMethod(METHOD_DELETE)
              .addMethod(METHOD_GET_QUERY)
              .addMethod(METHOD_ECHO)
              .addMethod(METHOD_DEEP_PATH_ECHO)
              .addMethod(METHOD_NO_BINDINGS)
              .addMethod(METHOD_TIMEOUT)
              .addMethod(METHOD_ERROR_WITH_DETAILS)
              .addMethod(METHOD_GET_MESSAGE_WITH_BODY)
              .addMethod(METHOD_POST_WITH_EMPTY_BODY)
              .build();
        }
      }
    }
    return result;
  }
}
