# Technology Versions

Versions observed from the pinned images on 2026-08-27. The image digest is the
reproducibility boundary; packages installed with `apt-get` can change when an
image is rebuilt unless their versions are pinned separately.

## Python

| Technology | Version |
| --- | --- |
| Base image | `mcr.microsoft.com/devcontainers/python:1-3.13-bookworm@sha256:0aa711e570b306c02946cdda67587ce8c65978dbb65691341cbcfd4854dfcfff` |
| CPython | 3.13.5 |
| Ruff | 0.12.8 |
| pytest | 8.4.1 |
| debugpy | 1.8.16 |

## Rust

| Technology | Version |
| --- | --- |
| Base image | `mcr.microsoft.com/devcontainers/rust:1-1-bookworm@sha256:fc57fb865035c5395e85246c8842b071ced6e7cde727b3c98abbcc794eaf4759` |
| Rust compiler | 1.88.0 |
| Cargo | 1.88.0 |
| GDB | 13.1 |

## Go

| Technology | Version |
| --- | --- |
| Base image | `mcr.microsoft.com/devcontainers/go:1-1.24-bookworm@sha256:1202710896e06f795a709535742b184a807e696b786423e46141d932777e29cc` |
| Go | 1.24.5 |
| Delve | 1.25.0 |

## Java

| Technology | Version |
| --- | --- |
| Base image | `mcr.microsoft.com/devcontainers/java:1-21-bookworm@sha256:0af991049cded4b8d5a90d2614289ceec390779ad6a3e4b70957e2b4f3bb1230` |
| OpenJDK | 21.0.8 LTS |
| Maven Wrapper distribution | 3.9.10 |
| JUnit Jupiter | 5.13.4 |
| Maven Compiler Plugin | 3.14.1 |
| Maven Surefire Plugin | 3.5.3 |
| Spotless Maven Plugin | 2.44.5 |

## C

| Technology | Version |
| --- | --- |
| Base image | `mcr.microsoft.com/devcontainers/cpp:1-bookworm@sha256:7276064ebe6540274de9c8e29097a955724b21b1c7f2b087587b55a51f7a958b` |
| GCC | 12.2.0 |
| CMake | 3.25.1 |
| cppcheck | 2.10 |
| clang-format | 14.0.6 |
| GDB | 13.1 |

## C++

| Technology | Version |
| --- | --- |
| Base image | `mcr.microsoft.com/devcontainers/cpp:1-bookworm@sha256:7276064ebe6540274de9c8e29097a955724b21b1c7f2b087587b55a51f7a958b` |
| GCC | 12.2.0 |
| CMake | 3.25.1 |
| clang-tidy | 14.0.6 |
| clang-format | 14.0.6 |
| GDB | 13.1 |

## Web

| Technology | Version |
| --- | --- |
| Base image | `oven/bun:1@sha256:5ff609364c049b54eb0ff560ec96319729a972078ef2c755d758f0c6ef89c2d6` |
| Bun | 1.4.0 |
| Biome | 2.2.0 |
| GNU Make | 4.4.1 |
