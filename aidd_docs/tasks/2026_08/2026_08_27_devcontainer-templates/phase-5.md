---
status: done
---

# Instruction: C and C++ templates

## Architecture projection

> Tree of the final files. ✅ create

```txt
c/
|-- .devcontainer/
|-- .gitignore
|-- CMakeLists.txt
|-- CMakePresets.json
`-- README.md
cpp/
|-- .devcontainer/
|-- .gitignore
|-- CMakeLists.txt
|-- CMakePresets.json
`-- README.md
```

## User Journey

```mermaid
flowchart TD
  A[Developer copies c or cpp] --> B[Rebuilds Dev Container]
  B --> C[Configures CMake preset]
  C --> D[Formats, analyzes, and tests]
  D --> E[Debugs executable]
```

## Test Scope

```mermaid
---
title: Test scope
---
journey
  section Setup
    system builds C and C++ Dev Containers => pinned build environments start: 5: cli
  section Happy path
    system configures and builds C preset => warning-clean target is produced: 5: cli
    system runs C format, static analysis, and CTest => all C quality commands succeed: 5: cli
    system configures and builds C++ preset => warning-clean target is produced: 5: cli
    system runs C++ format, static analysis, and CTest => all C++ quality commands succeed: 5: cli
  section Edge case - native debugging
    system starts each debugger smoke target => debugging works with narrowly scoped ptrace configuration: 5: cli
```

## Tasks to do

### `1)` Build C and C++ environments

> Provide CMake-based native templates with compiler warnings, analysis, testing, and debugging.

1. Create pinned Dockerfiles and Dev Container settings with opt-in ptrace support.
2. Add CMake projects, presets, sample sources and tests, ignore rules, and READMEs for C and C++.
3. Configure C with cppcheck and clang-format, and C++ with clang-tidy and clang-format.

## Test acceptance criteria

| Task | Acceptance criteria |
| --- | --- |
| 1 | C and C++ configure, build, and run CTest through their documented presets. |
| 2 | Each template runs its required formatter and static analyzer with a clean sample project. |
| 3 | Both templates use version-and-digest-pinned images and narrowly scoped debugger permissions. |
