.PHONY: install format lint test debug clean

install:
	python -m pip install -e '.[dev]'

format:
	python -m ruff format .

lint:
	python -m ruff format --check .
	python -m ruff check .

test:
	python -m pytest

debug:
	python -m debugpy --listen 5678 --wait-for-client -m pytest -q

clean:
	rm -rf .pytest_cache .ruff_cache .venv build dist src/*.egg-info .coverage
