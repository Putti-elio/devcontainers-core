package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void buildsAGreeting() {
    assertEquals("Hello, Dev Container!", App.greeting("Dev Container"));
  }
}
