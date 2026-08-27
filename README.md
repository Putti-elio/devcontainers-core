# devcontainers-core

Copy one directory into a project, then open it in a Dev Container-compatible
editor. Each template is self-contained: it owns its Dockerfile, development
container configuration, quality tooling, test sample, debugger setup, and
ignore rules.

| Template | Runtime and tooling |
| --- | --- |
| [Python](python/README.md) | CPython, Ruff, pytest, debugpy |
| [Rust](rust/README.md) | Cargo, rustfmt, Clippy, GDB |
| [Go](go/README.md) | gofmt, go vet, Delve |
| [Java](java/README.md) | JDK 21, Maven Wrapper, JUnit 5 |
| [C](c/README.md) | CMake, CTest, cppcheck, clang-format, GDB |
| [C++](cpp/README.md) | CMake, CTest, clang-tidy, clang-format, GDB |
| [Web](web/README.md) | Bun, Biome |

The exact runtime and tooling inventory is in [VERSIONS.md](VERSIONS.md).

## Image updates

Every Dockerfile pins a versioned base image to an immutable SHA-256 digest.
Dependabot proposes weekly Dockerfile updates. Before merging one, rebuild the
affected Dev Container and run every quality, test, and debugger smoke command
documented in that template's README.

## Project commands

From the repository root, dispatch a command to a template:

```sh
make test LANGUAGE=python
make lint LANGUAGE=rust
make clean LANGUAGE=web
```

Every template also contains its own `Makefile`, so copied templates support
the same commands directly: `make format`, `make lint`, `make test`, `make
build`, `make debug`, and `make clean` when applicable.
