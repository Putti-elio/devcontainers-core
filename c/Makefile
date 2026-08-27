.PHONY: format lint test build debug clean

format:
	clang-format -i src/main.c

lint:
	clang-format --dry-run --Werror src/main.c
	cppcheck --enable=all --error-exitcode=1 src

test: build
	ctest --preset dev

build:
	cmake --preset dev
	cmake --build --preset dev

debug: build
	gdb build/c-template

clean:
	rm -rf build
