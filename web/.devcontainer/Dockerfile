FROM oven/bun:1@sha256:9114c058aeae42162ee16dd5084b95fe9473970bb6bcb5b232ab1630f0546895

RUN apt-get update \
    && apt-get install --no-install-recommends -y make \
    && rm -rf /var/lib/apt/lists/*
