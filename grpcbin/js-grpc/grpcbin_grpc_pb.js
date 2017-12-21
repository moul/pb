// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var grpcbin_pb = require('./grpcbin_pb.js');

function serialize_grpcbin_DummyMessage(arg) {
  if (!(arg instanceof grpcbin_pb.DummyMessage)) {
    throw new Error('Expected argument of type grpcbin.DummyMessage');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_grpcbin_DummyMessage(buffer_arg) {
  return grpcbin_pb.DummyMessage.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_grpcbin_EmptyMessage(arg) {
  if (!(arg instanceof grpcbin_pb.EmptyMessage)) {
    throw new Error('Expected argument of type grpcbin.EmptyMessage');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_grpcbin_EmptyMessage(buffer_arg) {
  return grpcbin_pb.EmptyMessage.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_grpcbin_HeadersMessage(arg) {
  if (!(arg instanceof grpcbin_pb.HeadersMessage)) {
    throw new Error('Expected argument of type grpcbin.HeadersMessage');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_grpcbin_HeadersMessage(buffer_arg) {
  return grpcbin_pb.HeadersMessage.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_grpcbin_IndexReply(arg) {
  if (!(arg instanceof grpcbin_pb.IndexReply)) {
    throw new Error('Expected argument of type grpcbin.IndexReply');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_grpcbin_IndexReply(buffer_arg) {
  return grpcbin_pb.IndexReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_grpcbin_SpecificErrorRequest(arg) {
  if (!(arg instanceof grpcbin_pb.SpecificErrorRequest)) {
    throw new Error('Expected argument of type grpcbin.SpecificErrorRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_grpcbin_SpecificErrorRequest(buffer_arg) {
  return grpcbin_pb.SpecificErrorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}


var GRPCBinService = exports.GRPCBinService = {
  // This endpoint
  index: {
    path: '/grpcbin.GRPCBin/Index',
    requestStream: false,
    responseStream: false,
    requestType: grpcbin_pb.EmptyMessage,
    responseType: grpcbin_pb.IndexReply,
    requestSerialize: serialize_grpcbin_EmptyMessage,
    requestDeserialize: deserialize_grpcbin_EmptyMessage,
    responseSerialize: serialize_grpcbin_IndexReply,
    responseDeserialize: deserialize_grpcbin_IndexReply,
  },
  // Unary endpoint that takes no argument and replies an empty message.
  empty: {
    path: '/grpcbin.GRPCBin/Empty',
    requestStream: false,
    responseStream: false,
    requestType: grpcbin_pb.EmptyMessage,
    responseType: grpcbin_pb.EmptyMessage,
    requestSerialize: serialize_grpcbin_EmptyMessage,
    requestDeserialize: deserialize_grpcbin_EmptyMessage,
    responseSerialize: serialize_grpcbin_EmptyMessage,
    responseDeserialize: deserialize_grpcbin_EmptyMessage,
  },
  // Unary endpoint that replies a received DummyMessage
  dummyUnary: {
    path: '/grpcbin.GRPCBin/DummyUnary',
    requestStream: false,
    responseStream: false,
    requestType: grpcbin_pb.DummyMessage,
    responseType: grpcbin_pb.DummyMessage,
    requestSerialize: serialize_grpcbin_DummyMessage,
    requestDeserialize: deserialize_grpcbin_DummyMessage,
    responseSerialize: serialize_grpcbin_DummyMessage,
    responseDeserialize: deserialize_grpcbin_DummyMessage,
  },
  // Stream endpoint that sends back 10 times the received DummyMessage
  dummyServerStream: {
    path: '/grpcbin.GRPCBin/DummyServerStream',
    requestStream: false,
    responseStream: true,
    requestType: grpcbin_pb.DummyMessage,
    responseType: grpcbin_pb.DummyMessage,
    requestSerialize: serialize_grpcbin_DummyMessage,
    requestDeserialize: deserialize_grpcbin_DummyMessage,
    responseSerialize: serialize_grpcbin_DummyMessage,
    responseDeserialize: deserialize_grpcbin_DummyMessage,
  },
  // Stream endpoint that receives 10 DummyMessages and replies with the last received one
  dummyClientStream: {
    path: '/grpcbin.GRPCBin/DummyClientStream',
    requestStream: true,
    responseStream: false,
    requestType: grpcbin_pb.DummyMessage,
    responseType: grpcbin_pb.DummyMessage,
    requestSerialize: serialize_grpcbin_DummyMessage,
    requestDeserialize: deserialize_grpcbin_DummyMessage,
    responseSerialize: serialize_grpcbin_DummyMessage,
    responseDeserialize: deserialize_grpcbin_DummyMessage,
  },
  // Stream endpoint that sends back a received DummyMessage indefinitely (chat mode)
  dummyBidirectionalStreamStream: {
    path: '/grpcbin.GRPCBin/DummyBidirectionalStreamStream',
    requestStream: true,
    responseStream: true,
    requestType: grpcbin_pb.DummyMessage,
    responseType: grpcbin_pb.DummyMessage,
    requestSerialize: serialize_grpcbin_DummyMessage,
    requestDeserialize: deserialize_grpcbin_DummyMessage,
    responseSerialize: serialize_grpcbin_DummyMessage,
    responseDeserialize: deserialize_grpcbin_DummyMessage,
  },
  // Unary endpoint that raises a specified (by code) gRPC error
  specificError: {
    path: '/grpcbin.GRPCBin/SpecificError',
    requestStream: false,
    responseStream: false,
    requestType: grpcbin_pb.SpecificErrorRequest,
    responseType: grpcbin_pb.EmptyMessage,
    requestSerialize: serialize_grpcbin_SpecificErrorRequest,
    requestDeserialize: deserialize_grpcbin_SpecificErrorRequest,
    responseSerialize: serialize_grpcbin_EmptyMessage,
    responseDeserialize: deserialize_grpcbin_EmptyMessage,
  },
  // Unary endpoint that raises a random gRPC error
  randomError: {
    path: '/grpcbin.GRPCBin/RandomError',
    requestStream: false,
    responseStream: false,
    requestType: grpcbin_pb.EmptyMessage,
    responseType: grpcbin_pb.EmptyMessage,
    requestSerialize: serialize_grpcbin_EmptyMessage,
    requestDeserialize: deserialize_grpcbin_EmptyMessage,
    responseSerialize: serialize_grpcbin_EmptyMessage,
    responseDeserialize: deserialize_grpcbin_EmptyMessage,
  },
  // Unary endpoint that returns headers
  headersUnary: {
    path: '/grpcbin.GRPCBin/HeadersUnary',
    requestStream: false,
    responseStream: false,
    requestType: grpcbin_pb.EmptyMessage,
    responseType: grpcbin_pb.HeadersMessage,
    requestSerialize: serialize_grpcbin_EmptyMessage,
    requestDeserialize: deserialize_grpcbin_EmptyMessage,
    responseSerialize: serialize_grpcbin_HeadersMessage,
    responseDeserialize: deserialize_grpcbin_HeadersMessage,
  },
  // Unary endpoint that returns no respnose
  noResponseUnary: {
    path: '/grpcbin.GRPCBin/NoResponseUnary',
    requestStream: false,
    responseStream: false,
    requestType: grpcbin_pb.EmptyMessage,
    responseType: grpcbin_pb.EmptyMessage,
    requestSerialize: serialize_grpcbin_EmptyMessage,
    requestDeserialize: deserialize_grpcbin_EmptyMessage,
    responseSerialize: serialize_grpcbin_EmptyMessage,
    responseDeserialize: deserialize_grpcbin_EmptyMessage,
  },
};

exports.GRPCBinClient = grpc.makeGenericClientConstructor(GRPCBinService);
