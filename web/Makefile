.PHONY: install format lint test debug clean

install:
	bun install --frozen-lockfile

format:
	bunx biome format --write .

lint:
	bun run check

test:
	bun test

debug:
	bun --inspect src/greeting.ts

clean:
	rm -rf node_modules coverage
