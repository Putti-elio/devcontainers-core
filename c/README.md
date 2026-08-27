# C template

CMake, CTest, compiler warnings, cppcheck, clang-format, and GDB. Build and test:

```sh
clang-format --dry-run --Werror src/main.c
cppcheck --enable=all --error-exitcode=1 src
cmake --preset dev && cmake --build --preset dev && ctest --preset dev
gdb build/c-template
```

The pinned image and ptrace configuration are in `.devcontainer/`.

Equivalent targets: `make format`, `make lint`, `make test`, `make build`,
`make debug`, and `make clean`.
