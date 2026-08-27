FROM mcr.microsoft.com/devcontainers/rust:1-1-bookworm@sha256:fc57fb865035c5395e85246c8842b071ced6e7cde727b3c98abbcc794eaf4759

RUN apt-get update \
    && apt-get install --no-install-recommends -y gdb \
    && rm -rf /var/lib/apt/lists/*
