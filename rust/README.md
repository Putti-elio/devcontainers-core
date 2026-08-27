# Rust template

Rust, Cargo, rustfmt, Clippy, rust-analyzer, and GDB. The Docker base image is
pinned in `.devcontainer/Dockerfile`.

```sh
cargo fmt --check
cargo clippy -- -D warnings
cargo test
```

Build and debug the sample executable with GDB:

```sh
cargo build
gdb target/debug/rust-template
```

`SYS_PTRACE` and `seccomp=unconfined` are enabled only for this native-debugging
template. No framework or workspace layout is imposed.

Equivalent targets: `make format`, `make lint`, `make test`, `make build`,
`make debug`, and `make clean`.
