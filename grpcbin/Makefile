all:
	mkdir -p go-grpc go
	protoc -I. --go_out=plugins=grpc:go-grpc grpcbin.proto
	protoc -I. --go_out=go grpcbin.proto
	protoc -I. --go_out=go grpcbin.proto
