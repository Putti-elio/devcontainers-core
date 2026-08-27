from python_template import greeting


def test_greeting() -> None:
    assert greeting("Dev Container") == "Hello, Dev Container!"
