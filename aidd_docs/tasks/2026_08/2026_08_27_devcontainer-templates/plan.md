---
objective: "The repository provides independently copyable, reproducible Dev Container templates for Python, Rust, Go, Java, C, C++, and web development."
status: implemented
---

# Plan: Dev Container templates

## Overview

| Field | Value |
| --- | --- |
| **Goal** | Publish seven self-contained language templates with quality tooling and debugging support. |
| **Source** | [`aidd_docs/INSTALL.md`](../../../../INSTALL.md) |

## Phases

| # | Phase | File |
| --- | --- | --- |
| 1 | Repository foundation | [`phase-1.md`](./phase-1.md) |
| 2 | Python template | [`phase-2.md`](./phase-2.md) |
| 3 | Rust and Go templates | [`phase-3.md`](./phase-3.md) |
| 4 | Java template | [`phase-4.md`](./phase-4.md) |
| 5 | C and C++ templates | [`phase-5.md`](./phase-5.md) |
| 6 | Web template | [`phase-6.md`](./phase-6.md) |

## Resources

| Source | Verified |
| --- | --- |
| https://containers.dev/implementors/json_reference/ | A Dockerfile-backed Dev Container uses `build.dockerfile`; `capAdd` and `securityOpt` support opt-in native debugging. |
| https://docs.docker.com/build/building/best-practices/#pin-base-image-versions | A tag plus SHA-256 digest makes the base image reproducible. |
| https://docs.github.com/en/code-security/dependabot/working-with-dependabot/dependabot-options-reference | Dependabot supports Docker updates for declared directories on a schedule. |

## Decisions

| Decision | Why |
| --- | --- |
| Keep every template entirely within its language directory. | A consumer must be able to copy one directory without shared repository dependencies. |
| Pin every Docker base image by version and digest. | Rebuilds need a stable, auditable base while Dependabot proposes reviewed updates. |
