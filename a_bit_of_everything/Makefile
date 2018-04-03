PACKAGE_NAME = a_bit_of_everything
PROTO_FILE = $(PACKAGE_NAME).proto
PROTOC_OPTS = -I. -Ilib

docker:
	docker run -it --rm -v "$(PWD)/..:$(PWD)/.." -w "$(PWD)" --entrypoint=/bin/sh moul/protoc-gen-gotemplate -xec "make build"

build: ../googleapis/google/api/annotations.proto
	mkdir -p go-grpc go js py py-grpc java csharp
	protoc $(PROTOC_OPTS) --go_out=plugins=grpc:go-grpc $(PROTO_FILE)
	protoc $(PROTOC_OPTS) --go_out=go $(PROTO_FILE)
	protoc $(PROTOC_OPTS) --js_out=import_style=commonjs,binary:js --grpc_out=js --plugin=protoc-gen-grpc=/usr/bin/grpc_node_plugin $(PROTO_FILE)
	protoc $(PROTOC_OPTS) --python_out=py $(PROTO_FILE)
	protoc $(PROTOC_OPTS) --python_out=py-grpc --plugin=protoc-gen-grpc=/usr/bin/grpc_python_plugin --grpc_out=py-grpc $(PROTO_FILE)
	protoc $(PROTOC_OPTS) --java_out=java --plugin=protoc-gen-grpc=/usr/bin/protoc-gen-grpc-java --grpc_out=java $(PROTO_FILE)
	protoc $(PROTOC_OPTS) --csharp_out=csharp --plugin=protoc-gen-grpc=/usr/bin/grpc_csharp_plugin --grpc_out=csharp $(PROTO_FILE)

../googleapis/google/api/annotations.proto:
	cd .. && git clone https://github.com/googleapis/googleapis.git

sync:
	rm -rf .tmp
	git clone https://github.com/grpc-ecosystem/grpc-gateway .tmp
	cd .tmp && for file in `find . -name "*.proto"`; do mkdir -p ../`dirname $$file` && cp $$file ../$$file; done
	rm -rf .tmp
