package main

import "testing"

func TestGreeting(t *testing.T) {
	if got := greeting("Dev Container"); got != "Hello, Dev Container!" {
		t.Fatalf("greeting() = %q", got)
	}
}
