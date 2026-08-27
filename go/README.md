# Go template

Go 1.24 with gofmt, go vet, tests, and Delve. The Docker base image is pinned
in `.devcontainer/Dockerfile`.

```sh
gofmt -w .
go vet ./...
go test ./...
```

Debug the sample program with Delve:

```sh
dlv debug .
```

`SYS_PTRACE` and `seccomp=unconfined` are scoped to this native-debugging
template. No web framework or project layering is included.

Equivalent targets: `make format`, `make lint`, `make test`, `make build`,
`make debug`, and `make clean`.
