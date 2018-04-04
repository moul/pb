// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var a_bit_of_everything_pb = require('./a_bit_of_everything_pb.js');
var google_api_annotations_pb = require('./google/api/annotations_pb.js');
var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var examples_sub_message_pb = require('./examples/sub/message_pb.js');
var examples_sub2_message_pb = require('./examples/sub2/message_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var protoc$gen$swagger_options_annotations_pb = require('./protoc-gen-swagger/options/annotations_pb.js');

function serialize_google_protobuf_Duration(arg) {
  if (!(arg instanceof google_protobuf_duration_pb.Duration)) {
    throw new Error('Expected argument of type google.protobuf.Duration');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_google_protobuf_Duration(buffer_arg) {
  return google_protobuf_duration_pb.Duration.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_google_protobuf_Empty(arg) {
  if (!(arg instanceof google_protobuf_empty_pb.Empty)) {
    throw new Error('Expected argument of type google.protobuf.Empty');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_google_protobuf_Empty(buffer_arg) {
  return google_protobuf_empty_pb.Empty.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_grpc_gateway_examples_examplepb_ABitOfEverything(arg) {
  if (!(arg instanceof a_bit_of_everything_pb.ABitOfEverything)) {
    throw new Error('Expected argument of type grpc.gateway.examples.examplepb.ABitOfEverything');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_grpc_gateway_examples_examplepb_ABitOfEverything(buffer_arg) {
  return a_bit_of_everything_pb.ABitOfEverything.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_grpc_gateway_examples_examplepb_Body(arg) {
  if (!(arg instanceof a_bit_of_everything_pb.Body)) {
    throw new Error('Expected argument of type grpc.gateway.examples.examplepb.Body');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_grpc_gateway_examples_examplepb_Body(buffer_arg) {
  return a_bit_of_everything_pb.Body.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_grpc_gateway_examples_examplepb_MessageWithBody(arg) {
  if (!(arg instanceof a_bit_of_everything_pb.MessageWithBody)) {
    throw new Error('Expected argument of type grpc.gateway.examples.examplepb.MessageWithBody');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_grpc_gateway_examples_examplepb_MessageWithBody(buffer_arg) {
  return a_bit_of_everything_pb.MessageWithBody.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_grpc_gateway_examples_sub_StringMessage(arg) {
  if (!(arg instanceof examples_sub_message_pb.StringMessage)) {
    throw new Error('Expected argument of type grpc.gateway.examples.sub.StringMessage');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_grpc_gateway_examples_sub_StringMessage(buffer_arg) {
  return examples_sub_message_pb.StringMessage.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sub2_IdMessage(arg) {
  if (!(arg instanceof examples_sub2_message_pb.IdMessage)) {
    throw new Error('Expected argument of type sub2.IdMessage');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sub2_IdMessage(buffer_arg) {
  return examples_sub2_message_pb.IdMessage.deserializeBinary(new Uint8Array(buffer_arg));
}


// ABitOfEverything service is used to validate that APIs with complicated
// proto messages and URL templates are still processed correctly.
var ABitOfEverythingServiceService = exports.ABitOfEverythingServiceService = {
  create: {
    path: '/grpc.gateway.examples.examplepb.ABitOfEverythingService/Create',
    requestStream: false,
    responseStream: false,
    requestType: a_bit_of_everything_pb.ABitOfEverything,
    responseType: a_bit_of_everything_pb.ABitOfEverything,
    requestSerialize: serialize_grpc_gateway_examples_examplepb_ABitOfEverything,
    requestDeserialize: deserialize_grpc_gateway_examples_examplepb_ABitOfEverything,
    responseSerialize: serialize_grpc_gateway_examples_examplepb_ABitOfEverything,
    responseDeserialize: deserialize_grpc_gateway_examples_examplepb_ABitOfEverything,
  },
  createBody: {
    path: '/grpc.gateway.examples.examplepb.ABitOfEverythingService/CreateBody',
    requestStream: false,
    responseStream: false,
    requestType: a_bit_of_everything_pb.ABitOfEverything,
    responseType: a_bit_of_everything_pb.ABitOfEverything,
    requestSerialize: serialize_grpc_gateway_examples_examplepb_ABitOfEverything,
    requestDeserialize: deserialize_grpc_gateway_examples_examplepb_ABitOfEverything,
    responseSerialize: serialize_grpc_gateway_examples_examplepb_ABitOfEverything,
    responseDeserialize: deserialize_grpc_gateway_examples_examplepb_ABitOfEverything,
  },
  lookup: {
    path: '/grpc.gateway.examples.examplepb.ABitOfEverythingService/Lookup',
    requestStream: false,
    responseStream: false,
    requestType: examples_sub2_message_pb.IdMessage,
    responseType: a_bit_of_everything_pb.ABitOfEverything,
    requestSerialize: serialize_sub2_IdMessage,
    requestDeserialize: deserialize_sub2_IdMessage,
    responseSerialize: serialize_grpc_gateway_examples_examplepb_ABitOfEverything,
    responseDeserialize: deserialize_grpc_gateway_examples_examplepb_ABitOfEverything,
  },
  update: {
    path: '/grpc.gateway.examples.examplepb.ABitOfEverythingService/Update',
    requestStream: false,
    responseStream: false,
    requestType: a_bit_of_everything_pb.ABitOfEverything,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_grpc_gateway_examples_examplepb_ABitOfEverything,
    requestDeserialize: deserialize_grpc_gateway_examples_examplepb_ABitOfEverything,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  delete: {
    path: '/grpc.gateway.examples.examplepb.ABitOfEverythingService/Delete',
    requestStream: false,
    responseStream: false,
    requestType: examples_sub2_message_pb.IdMessage,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_sub2_IdMessage,
    requestDeserialize: deserialize_sub2_IdMessage,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  getQuery: {
    path: '/grpc.gateway.examples.examplepb.ABitOfEverythingService/GetQuery',
    requestStream: false,
    responseStream: false,
    requestType: a_bit_of_everything_pb.ABitOfEverything,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_grpc_gateway_examples_examplepb_ABitOfEverything,
    requestDeserialize: deserialize_grpc_gateway_examples_examplepb_ABitOfEverything,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  // Echo allows posting a StringMessage value.
  //
  // It also exposes multiple bindings.
  //
  // This makes it useful when validating that the OpenAPI v2 API
  // description exposes documentation correctly on all paths
  // defined as additional_bindings in the proto.
  echo: {
    path: '/grpc.gateway.examples.examplepb.ABitOfEverythingService/Echo',
    requestStream: false,
    responseStream: false,
    requestType: examples_sub_message_pb.StringMessage,
    responseType: examples_sub_message_pb.StringMessage,
    requestSerialize: serialize_grpc_gateway_examples_sub_StringMessage,
    requestDeserialize: deserialize_grpc_gateway_examples_sub_StringMessage,
    responseSerialize: serialize_grpc_gateway_examples_sub_StringMessage,
    responseDeserialize: deserialize_grpc_gateway_examples_sub_StringMessage,
  },
  deepPathEcho: {
    path: '/grpc.gateway.examples.examplepb.ABitOfEverythingService/DeepPathEcho',
    requestStream: false,
    responseStream: false,
    requestType: a_bit_of_everything_pb.ABitOfEverything,
    responseType: a_bit_of_everything_pb.ABitOfEverything,
    requestSerialize: serialize_grpc_gateway_examples_examplepb_ABitOfEverything,
    requestDeserialize: deserialize_grpc_gateway_examples_examplepb_ABitOfEverything,
    responseSerialize: serialize_grpc_gateway_examples_examplepb_ABitOfEverything,
    responseDeserialize: deserialize_grpc_gateway_examples_examplepb_ABitOfEverything,
  },
  noBindings: {
    path: '/grpc.gateway.examples.examplepb.ABitOfEverythingService/NoBindings',
    requestStream: false,
    responseStream: false,
    requestType: google_protobuf_duration_pb.Duration,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_google_protobuf_Duration,
    requestDeserialize: deserialize_google_protobuf_Duration,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  timeout: {
    path: '/grpc.gateway.examples.examplepb.ABitOfEverythingService/Timeout',
    requestStream: false,
    responseStream: false,
    requestType: google_protobuf_empty_pb.Empty,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_google_protobuf_Empty,
    requestDeserialize: deserialize_google_protobuf_Empty,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  errorWithDetails: {
    path: '/grpc.gateway.examples.examplepb.ABitOfEverythingService/ErrorWithDetails',
    requestStream: false,
    responseStream: false,
    requestType: google_protobuf_empty_pb.Empty,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_google_protobuf_Empty,
    requestDeserialize: deserialize_google_protobuf_Empty,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  getMessageWithBody: {
    path: '/grpc.gateway.examples.examplepb.ABitOfEverythingService/GetMessageWithBody',
    requestStream: false,
    responseStream: false,
    requestType: a_bit_of_everything_pb.MessageWithBody,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_grpc_gateway_examples_examplepb_MessageWithBody,
    requestDeserialize: deserialize_grpc_gateway_examples_examplepb_MessageWithBody,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
  postWithEmptyBody: {
    path: '/grpc.gateway.examples.examplepb.ABitOfEverythingService/PostWithEmptyBody',
    requestStream: false,
    responseStream: false,
    requestType: a_bit_of_everything_pb.Body,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_grpc_gateway_examples_examplepb_Body,
    requestDeserialize: deserialize_grpc_gateway_examples_examplepb_Body,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
};

exports.ABitOfEverythingServiceClient = grpc.makeGenericClientConstructor(ABitOfEverythingServiceService);
// camelCase and lowercase service names are valid but not recommended (use TitleCase instead)
var camelCaseServiceNameService = exports.camelCaseServiceNameService = {
  empty: {
    path: '/grpc.gateway.examples.examplepb.camelCaseServiceName/Empty',
    requestStream: false,
    responseStream: false,
    requestType: google_protobuf_empty_pb.Empty,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_google_protobuf_Empty,
    requestDeserialize: deserialize_google_protobuf_Empty,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
};

exports.camelCaseServiceNameClient = grpc.makeGenericClientConstructor(camelCaseServiceNameService);
var AnotherServiceWithNoBindingsService = exports.AnotherServiceWithNoBindingsService = {
  noBindings: {
    path: '/grpc.gateway.examples.examplepb.AnotherServiceWithNoBindings/NoBindings',
    requestStream: false,
    responseStream: false,
    requestType: google_protobuf_empty_pb.Empty,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_google_protobuf_Empty,
    requestDeserialize: deserialize_google_protobuf_Empty,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
  },
};

exports.AnotherServiceWithNoBindingsClient = grpc.makeGenericClientConstructor(AnotherServiceWithNoBindingsService);
