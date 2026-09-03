FROM mcr.microsoft.com/devcontainers/cpp:3-bookworm@sha256:44370f2656ebd95788ca2c91d00cea89e7a966d80d04c12e5081a9b2fc19e957

RUN apt-get update \
    && apt-get install --no-install-recommends -y clang-format clang-tidy gdb \
    && rm -rf /var/lib/apt/lists/*
