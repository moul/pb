// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var hello_pb = require('./hello_pb.js');

function serialize_hello_HelloRequest(arg) {
  if (!(arg instanceof hello_pb.HelloRequest)) {
    throw new Error('Expected argument of type hello.HelloRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_hello_HelloRequest(buffer_arg) {
  return hello_pb.HelloRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hello_HelloResponse(arg) {
  if (!(arg instanceof hello_pb.HelloResponse)) {
    throw new Error('Expected argument of type hello.HelloResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_hello_HelloResponse(buffer_arg) {
  return hello_pb.HelloResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var HelloServiceService = exports.HelloServiceService = {
  sayHello: {
    path: '/hello.HelloService/SayHello',
    requestStream: false,
    responseStream: false,
    requestType: hello_pb.HelloRequest,
    responseType: hello_pb.HelloResponse,
    requestSerialize: serialize_hello_HelloRequest,
    requestDeserialize: deserialize_hello_HelloRequest,
    responseSerialize: serialize_hello_HelloResponse,
    responseDeserialize: deserialize_hello_HelloResponse,
  },
  lotsOfReplies: {
    path: '/hello.HelloService/LotsOfReplies',
    requestStream: false,
    responseStream: true,
    requestType: hello_pb.HelloRequest,
    responseType: hello_pb.HelloResponse,
    requestSerialize: serialize_hello_HelloRequest,
    requestDeserialize: deserialize_hello_HelloRequest,
    responseSerialize: serialize_hello_HelloResponse,
    responseDeserialize: deserialize_hello_HelloResponse,
  },
  lotsOfGreetings: {
    path: '/hello.HelloService/LotsOfGreetings',
    requestStream: true,
    responseStream: false,
    requestType: hello_pb.HelloRequest,
    responseType: hello_pb.HelloResponse,
    requestSerialize: serialize_hello_HelloRequest,
    requestDeserialize: deserialize_hello_HelloRequest,
    responseSerialize: serialize_hello_HelloResponse,
    responseDeserialize: deserialize_hello_HelloResponse,
  },
  bidiHello: {
    path: '/hello.HelloService/BidiHello',
    requestStream: true,
    responseStream: true,
    requestType: hello_pb.HelloRequest,
    responseType: hello_pb.HelloResponse,
    requestSerialize: serialize_hello_HelloRequest,
    requestDeserialize: deserialize_hello_HelloRequest,
    responseSerialize: serialize_hello_HelloResponse,
    responseDeserialize: deserialize_hello_HelloResponse,
  },
};

exports.HelloServiceClient = grpc.makeGenericClientConstructor(HelloServiceService);
