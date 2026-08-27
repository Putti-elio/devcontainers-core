FROM mcr.microsoft.com/devcontainers/cpp:1-bookworm@sha256:7276064ebe6540274de9c8e29097a955724b21b1c7f2b087587b55a51f7a958b

RUN apt-get update \
    && apt-get install --no-install-recommends -y clang-format cppcheck gdb \
    && rm -rf /var/lib/apt/lists/*
