PACKAGE_NAME = addsvc
PROTO_FILE = $(PACKAGE_NAME).proto

docker:
	docker run -it --rm -v "$(PWD):$(PWD)" -w "$(PWD)" --entrypoint=/bin/sh moul/protoc-gen-gotemplate -xec "make build"

build:
	mkdir -p go-grpc go js py py-grpc java csharp
	protoc -I. --go_out=plugins=grpc:go-grpc $(PROTO_FILE)
	protoc -I. --go_out=go $(PROTO_FILE)
	protoc -I. --js_out=import_style=commonjs,binary:js --grpc_out=js --plugin=protoc-gen-grpc=/usr/bin/grpc_node_plugin $(PROTO_FILE)
	protoc -I. --python_out=py $(PROTO_FILE)
	protoc -I. --python_out=py-grpc --plugin=protoc-gen-grpc=/usr/bin/grpc_python_plugin --grpc_out=py-grpc $(PROTO_FILE)
	protoc -I. --java_out=java --plugin=protoc-gen-grpc=/usr/bin/protoc-gen-grpc-java --grpc_out=java $(PROTO_FILE) && mv java/$(PACKAGE_NAME)/* java/ && rmdir java/$(PACKAGE_NAME)
	protoc -I. --csharp_out=csharp --plugin=protoc-gen-grpc=/usr/bin/grpc_csharp_plugin --grpc_out=csharp $(PROTO_FILE)
