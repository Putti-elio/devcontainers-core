# C++ template

CMake, CTest, compiler warnings, clang-tidy, clang-format, and GDB. Build and test:

```sh
clang-format --dry-run --Werror src/main.cpp
cmake --preset dev && cmake --build --preset dev && ctest --preset dev
clang-tidy -p build src/main.cpp
gdb build/cpp-template
```

The pinned image and ptrace configuration are in `.devcontainer/`.

Equivalent targets: `make format`, `make lint`, `make test`, `make build`,
`make debug`, and `make clean`.
