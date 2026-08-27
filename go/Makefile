.PHONY: format lint test build debug clean

format:
	gofmt -w .

lint:
	@test -z "$(shell gofmt -l .)"
	go vet ./...

test:
	go test ./...

build:
	go build -o go-template .

debug:
	dlv debug .

clean:
	rm -f go-template coverage.out
	go clean -cache -testcache
