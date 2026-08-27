.PHONY: format lint test build debug clean

format:
	cargo fmt

lint:
	cargo fmt --check
	cargo clippy -- -D warnings

test:
	cargo test

build:
	cargo build

debug: build
	gdb target/debug/rust-template

clean:
	cargo clean
