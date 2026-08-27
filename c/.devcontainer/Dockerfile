FROM mcr.microsoft.com/devcontainers/cpp:2-bookworm@sha256:80fb33a875a92d2cf7bc20a4b551b0dd94b789d92899041153c72bd7a52dc511

RUN apt-get update \
    && apt-get install --no-install-recommends -y clang-format cppcheck gdb \
    && rm -rf /var/lib/apt/lists/*
