---
status: done
---

# Instruction: Repository foundation

## Architecture projection

> Tree of the final files. ✅ create

```txt
.
|-- .github/
|   `-- dependabot.yml
`-- README.md
```

## User Journey

```mermaid
flowchart TD
  A[Developer opens repository] --> B[Selects a language template]
  B --> C[Reads its documented commands]
  D[Dependabot scans Dockerfiles] --> E[Opens an update pull request]
```

## Test Scope

```mermaid
---
title: Test scope
---
journey
  section Setup
    system inspects repository metadata => expected files are present: 5: cli
  section Happy path
    system parses Dependabot configuration => Docker update schedule is valid: 5: cli
    system reads repository README => all seven template directories are discoverable: 5: cli
  section Edge case - mutable image tag
    system searches Dockerfiles => no base image uses latest: 5: cli
```

## Tasks to do

### `1)` Add repository entry points

> Make all templates discoverable and image updates reviewable.

1. Add a root README that explains the copy-one-directory model and links every template.
2. Configure weekly Dependabot Docker updates for every template directory.
3. Document manual review and container validation before image-update merges.

## Test acceptance criteria

| Task | Acceptance criteria |
| --- | --- |
| 1 | The root README links Python, Rust, Go, Java, C, C++, and web templates. |
| 2 | Dependabot declares a valid Docker update configuration for each Dockerfile directory. |
| 3 | Repository documentation requires a rebuilt-container quality check before merging image updates. |
