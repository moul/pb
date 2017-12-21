package hello;

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
    comments = "Source: hello.proto")
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "hello.HelloService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<hello.Hello.HelloRequest,
      hello.Hello.HelloResponse> METHOD_SAY_HELLO =
      io.grpc.MethodDescriptor.<hello.Hello.HelloRequest, hello.Hello.HelloResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "hello.HelloService", "SayHello"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              hello.Hello.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              hello.Hello.HelloResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<hello.Hello.HelloRequest,
      hello.Hello.HelloResponse> METHOD_LOTS_OF_REPLIES =
      io.grpc.MethodDescriptor.<hello.Hello.HelloRequest, hello.Hello.HelloResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "hello.HelloService", "LotsOfReplies"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              hello.Hello.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              hello.Hello.HelloResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<hello.Hello.HelloRequest,
      hello.Hello.HelloResponse> METHOD_LOTS_OF_GREETINGS =
      io.grpc.MethodDescriptor.<hello.Hello.HelloRequest, hello.Hello.HelloResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "hello.HelloService", "LotsOfGreetings"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              hello.Hello.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              hello.Hello.HelloResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<hello.Hello.HelloRequest,
      hello.Hello.HelloResponse> METHOD_BIDI_HELLO =
      io.grpc.MethodDescriptor.<hello.Hello.HelloRequest, hello.Hello.HelloResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "hello.HelloService", "BidiHello"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              hello.Hello.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              hello.Hello.HelloResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    return new HelloServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(hello.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_HELLO, responseObserver);
    }

    /**
     */
    public void lotsOfReplies(hello.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOTS_OF_REPLIES, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<hello.Hello.HelloRequest> lotsOfGreetings(
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_LOTS_OF_GREETINGS, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<hello.Hello.HelloRequest> bidiHello(
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_BIDI_HELLO, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAY_HELLO,
            asyncUnaryCall(
              new MethodHandlers<
                hello.Hello.HelloRequest,
                hello.Hello.HelloResponse>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            METHOD_LOTS_OF_REPLIES,
            asyncServerStreamingCall(
              new MethodHandlers<
                hello.Hello.HelloRequest,
                hello.Hello.HelloResponse>(
                  this, METHODID_LOTS_OF_REPLIES)))
          .addMethod(
            METHOD_LOTS_OF_GREETINGS,
            asyncClientStreamingCall(
              new MethodHandlers<
                hello.Hello.HelloRequest,
                hello.Hello.HelloResponse>(
                  this, METHODID_LOTS_OF_GREETINGS)))
          .addMethod(
            METHOD_BIDI_HELLO,
            asyncBidiStreamingCall(
              new MethodHandlers<
                hello.Hello.HelloRequest,
                hello.Hello.HelloResponse>(
                  this, METHODID_BIDI_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractStub<HelloServiceStub> {
    private HelloServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(hello.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lotsOfReplies(hello.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_LOTS_OF_REPLIES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<hello.Hello.HelloRequest> lotsOfGreetings(
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_LOTS_OF_GREETINGS, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<hello.Hello.HelloRequest> bidiHello(
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_BIDI_HELLO, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public hello.Hello.HelloResponse sayHello(hello.Hello.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAY_HELLO, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<hello.Hello.HelloResponse> lotsOfReplies(
        hello.Hello.HelloRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_LOTS_OF_REPLIES, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<hello.Hello.HelloResponse> sayHello(
        hello.Hello.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_LOTS_OF_REPLIES = 1;
  private static final int METHODID_LOTS_OF_GREETINGS = 2;
  private static final int METHODID_BIDI_HELLO = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((hello.Hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<hello.Hello.HelloResponse>) responseObserver);
          break;
        case METHODID_LOTS_OF_REPLIES:
          serviceImpl.lotsOfReplies((hello.Hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<hello.Hello.HelloResponse>) responseObserver);
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
        case METHODID_LOTS_OF_GREETINGS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.lotsOfGreetings(
              (io.grpc.stub.StreamObserver<hello.Hello.HelloResponse>) responseObserver);
        case METHODID_BIDI_HELLO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidiHello(
              (io.grpc.stub.StreamObserver<hello.Hello.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class HelloServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return hello.Hello.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceDescriptorSupplier())
              .addMethod(METHOD_SAY_HELLO)
              .addMethod(METHOD_LOTS_OF_REPLIES)
              .addMethod(METHOD_LOTS_OF_GREETINGS)
              .addMethod(METHOD_BIDI_HELLO)
              .build();
        }
      }
    }
    return result;
  }
}
