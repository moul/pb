// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// based on https://github.com/go-kit/kit/blob/master/examples/addsvc/pb/addsvc.proto
//
'use strict';
var grpc = require('grpc');
var addsvc_pb = require('./addsvc_pb.js');

function serialize_addsvc_ConcatReply(arg) {
  if (!(arg instanceof addsvc_pb.ConcatReply)) {
    throw new Error('Expected argument of type addsvc.ConcatReply');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_addsvc_ConcatReply(buffer_arg) {
  return addsvc_pb.ConcatReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_addsvc_ConcatRequest(arg) {
  if (!(arg instanceof addsvc_pb.ConcatRequest)) {
    throw new Error('Expected argument of type addsvc.ConcatRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_addsvc_ConcatRequest(buffer_arg) {
  return addsvc_pb.ConcatRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_addsvc_SumReply(arg) {
  if (!(arg instanceof addsvc_pb.SumReply)) {
    throw new Error('Expected argument of type addsvc.SumReply');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_addsvc_SumReply(buffer_arg) {
  return addsvc_pb.SumReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_addsvc_SumRequest(arg) {
  if (!(arg instanceof addsvc_pb.SumRequest)) {
    throw new Error('Expected argument of type addsvc.SumRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_addsvc_SumRequest(buffer_arg) {
  return addsvc_pb.SumRequest.deserializeBinary(new Uint8Array(buffer_arg));
}


// The Add service definition.
var AddService = exports.AddService = {
  // Sums two integers.
  sum: {
    path: '/addsvc.Add/Sum',
    requestStream: false,
    responseStream: false,
    requestType: addsvc_pb.SumRequest,
    responseType: addsvc_pb.SumReply,
    requestSerialize: serialize_addsvc_SumRequest,
    requestDeserialize: deserialize_addsvc_SumRequest,
    responseSerialize: serialize_addsvc_SumReply,
    responseDeserialize: deserialize_addsvc_SumReply,
  },
  // Concatenates two strings
  concat: {
    path: '/addsvc.Add/Concat',
    requestStream: false,
    responseStream: false,
    requestType: addsvc_pb.ConcatRequest,
    responseType: addsvc_pb.ConcatReply,
    requestSerialize: serialize_addsvc_ConcatRequest,
    requestDeserialize: deserialize_addsvc_ConcatRequest,
    responseSerialize: serialize_addsvc_ConcatReply,
    responseDeserialize: deserialize_addsvc_ConcatReply,
  },
};

exports.AddClient = grpc.makeGenericClientConstructor(AddService);
