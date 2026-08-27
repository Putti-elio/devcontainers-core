# Project Brief

## What it is

- `devcontainers-core` is a public repository of independently copyable Dev Container templates for individual developers.

## Why it exists

- It removes first-day setup work for small exercises and longer-lived projects while keeping the chosen language environment reproducible.

## Domain language

| Term | Meaning |
| ---- | ------- |
| template | A self-contained language directory that a developer copies into a new project. |
| Dev Container | The editor-detected configuration that creates the development environment. |
| image pin | A Docker base-image version combined with its immutable digest. |

## Key features

- Language templates for Python, Rust, Go, Java, C, C++, and web projects.
- Built-in linting, formatting, testing, and debugging defaults.
- Dependabot pull requests for reviewed container-image updates.
