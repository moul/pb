docker:
	docker run -it --rm -v "$(PWD):$(PWD)" -w "$(PWD)" --entrypoint=/bin/sh moul/protoc-gen-gotemplate -xec "make build"

build:
	mkdir -p go-grpc go js
	protoc -I. --go_out=plugins=grpc:go-grpc grpcbin.proto
	protoc -I. --go_out=go grpcbin.proto
	protoc -I. --js_out=import_style=commonjs,binary:js --plugin=protoc-gen-grpc=/usr/bin/grpc_node_plugin grpcbin.proto
