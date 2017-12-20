all:
	mkdir -p go-grpc
	protoc -I. --go_out=plugins=grpc:go-grpc grpcbin.proto
