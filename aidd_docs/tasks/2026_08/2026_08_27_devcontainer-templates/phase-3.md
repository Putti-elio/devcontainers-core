---
status: done
---

# Instruction: Rust and Go templates

## Architecture projection

> Tree of the final files. ✅ create

```txt
rust/
|-- .devcontainer/
|-- .gitignore
|-- Cargo.toml
`-- README.md
go/
|-- .devcontainer/
|-- .gitignore
|-- go.mod
`-- README.md
```

## User Journey

```mermaid
flowchart TD
  A[Developer copies rust or go] --> B[Rebuilds Dev Container]
  B --> C[Runs language quality commands]
  C --> D[Debugs a sample program]
```

## Test Scope

```mermaid
---
title: Test scope
---
journey
  section Setup
    system builds Rust and Go Dev Containers => both pinned environments start: 5: cli
  section Happy path
    system runs cargo fmt, clippy, and test => Rust quality commands succeed: 5: cli
    system runs gofmt, vet, and test => Go quality commands succeed: 5: cli
    system runs each debug smoke command => native debugger launches with opt-in permissions: 5: cli
```

## Tasks to do

### `1)` Build Rust and Go environments

> Provide self-contained compiled-language templates with their native quality tools.

1. Create Rust files for Cargo, rustfmt, Clippy, tests, rust-analyzer, and debugger configuration.
2. Create Go files for gofmt, vet, tests, Delve, and debugger configuration.
3. Pin both base images and document all commands and intentional exclusions.

## Test acceptance criteria

| Task | Acceptance criteria |
| --- | --- |
| 1 | Rust passes its documented format, lint, test, and debug smoke commands in its rebuilt container. |
| 2 | Go passes its documented format, vet, test, and debug smoke commands in its rebuilt container. |
| 3 | Both Dockerfiles pin a version and SHA-256 digest, and debugging privileges are only enabled when needed. |
