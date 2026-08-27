---
status: done
---

# Instruction: Python template

## Architecture projection

> Tree of the final files. ✅ create

```txt
python/
|-- .devcontainer/
|   |-- devcontainer.json
|   `-- Dockerfile
|-- .gitignore
|-- pyproject.toml
|-- README.md
`-- tests/
    `-- test_smoke.py
```

## User Journey

```mermaid
flowchart TD
  A[Developer copies python] --> B[Rebuilds Dev Container]
  B --> C[Runs Ruff and pytest]
  C --> D[Starts debugpy smoke target]
```

## Test Scope

```mermaid
---
title: Test scope
---
journey
  section Setup
    system builds Python Dev Container => container starts with pinned base image: 5: cli
  section Happy path
    system runs documented format check => Ruff reports compliant source: 5: cli
    system runs documented lint and test commands => Ruff and pytest succeed: 5: cli
    system runs debug smoke command => debugpy target starts successfully: 5: cli
  section Edge case - copied template
    system runs commands from copied directory => no files outside python are required: 5: cli
```

## Tasks to do

### `1)` Build the Python environment

> Supply CPython, isolated dependencies, quality tooling, tests, and debugging.

1. Resolve and pin a supported Python base image by version and digest.
2. Add Dev Container configuration, project metadata, sample test, ignore rules, and documented commands.
3. Configure Ruff, pytest, and debugpy in the container and project files.

## Test acceptance criteria

| Task | Acceptance criteria |
| --- | --- |
| 1 | The Python Dockerfile uses a version-and-digest-pinned base image. |
| 2 | The rebuilt container runs documented formatting, linting, test, and debug smoke commands. |
| 3 | The copied Python directory has no repository-level runtime dependency. |
