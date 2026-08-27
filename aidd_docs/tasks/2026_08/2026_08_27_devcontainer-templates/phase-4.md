---
status: done
---

# Instruction: Java template

## Architecture projection

> Tree of the final files. ✅ create

```txt
java/
|-- .devcontainer/
|-- .gitignore
|-- .mvn/
|-- mvnw
|-- pom.xml
`-- README.md
```

## User Journey

```mermaid
flowchart TD
  A[Developer copies java] --> B[Rebuilds Dev Container]
  B --> C[Uses Maven Wrapper]
  C --> D[Runs formatter and tests]
  D --> E[Debugs a sample program]
```

## Test Scope

```mermaid
---
title: Test scope
---
journey
  section Setup
    system builds Java Dev Container => pinned JDK 21 environment starts: 5: cli
  section Happy path
    system runs Maven Wrapper formatting check => source formatting is verified: 5: cli
    system runs Maven Wrapper tests => JUnit 5 tests pass: 5: cli
    system runs debug smoke command => Java debugger can attach: 5: cli
  section Edge case - build tool selection
    system inspects container packages => no unpinned global Maven or Gradle is installed: 5: cli
```

## Tasks to do

### `1)` Build the Java environment

> Supply a JDK 21 template that uses the project-owned Maven Wrapper.

1. Resolve and pin the JDK base image, then configure the Dev Container and Java debugger.
2. Add Maven Wrapper, Maven project configuration, JUnit 5, formatter, ignore rules, and a sample test.
3. Document rebuild, quality, test, and debug commands without requiring globally installed Maven or Gradle.

## Test acceptance criteria

| Task | Acceptance criteria |
| --- | --- |
| 1 | The Java template builds with a version-and-digest-pinned JDK 21 image. |
| 2 | Maven Wrapper runs the documented formatting and JUnit test commands in the container. |
| 3 | The template does not install an unpinned global Maven or Gradle. |
