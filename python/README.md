# Python template

CPython 3.13 with Ruff, pytest, and debugpy. The base image is pinned by tag
and digest in `.devcontainer/Dockerfile`.

## Use

1. Copy this directory into a new project.
2. Open it in a Dev Container-compatible editor and rebuild the container.
3. The post-create command installs the pinned development dependencies.

Run quality checks from the directory root:

```sh
python -m ruff format --check .
python -m ruff check .
python -m pytest
```

Debug the test target with debugpy, then attach an editor debugger to port
`5678`:

```sh
python -m debugpy --listen 5678 --wait-for-client -m pytest -q
```

The template intentionally does not prescribe a web framework, dependency
manager, or application architecture.

Use `make install`, `make format`, `make lint`, `make test`, `make debug`, or
`make clean` for the same workflow.
