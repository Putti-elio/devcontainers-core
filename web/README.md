# Web template

Bun and Biome for JavaScript, TypeScript, JSON, CSS, and supported HTML. The
image is pinned in `.devcontainer/Dockerfile`; Node and Deno are intentionally
not installed.

```sh
bun install --frozen-lockfile
bun run check
bun test
```

Use the built-in Bun debugger or an editor extension compatible with Bun. The
template leaves framework, bundler, and application architecture to the project.

Use `make install`, `make format`, `make lint`, `make test`, `make debug`, or
`make clean`.
