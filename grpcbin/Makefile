docker:
	docker run -it --rm -v "$(PWD):$(PWD)" -w "$(PWD)" --entrypoint=/bin/sh moul/protoc-gen-gotemplate -xec "make build"

build:
	mkdir -p go-grpc go js py py-grpc java csharp
	protoc -I. --go_out=plugins=grpc:go-grpc grpcbin.proto
	protoc -I. --go_out=go grpcbin.proto
	protoc -I. --js_out=import_style=commonjs,binary:js --grpc_out=js --plugin=protoc-gen-grpc=/usr/bin/grpc_node_plugin grpcbin.proto
	protoc -I. --python_out=py grpcbin.proto
	protoc -I. --python_out=py-grpc --plugin=protoc-gen-grpc=/usr/bin/grpc_python_plugin --grpc_out=py-grpc grpcbin.proto
	protoc -I. --java_out=java --plugin=protoc-gen-grpc=/usr/bin/protoc-gen-grpc-java --grpc_out=java grpcbin.proto && mv java/grpcbin/* java/ && rmdir java/grpcbin
	protoc -I. --csharp_out=csharp --plugin=protoc-gen-grpc=/usr/bin/grpc_csharp_plugin --grpc_out=csharp grpcbin.proto
