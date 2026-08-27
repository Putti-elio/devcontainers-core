.PHONY: format lint test build debug clean

format:
	clang-format -i src/main.cpp

lint: build
	clang-format --dry-run --Werror src/main.cpp
	clang-tidy -p build src/main.cpp

test: build
	ctest --preset dev

build:
	cmake --preset dev
	cmake --build --preset dev

debug: build
	gdb build/cpp-template

clean:
	rm -rf build
