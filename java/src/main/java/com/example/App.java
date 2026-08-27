package com.example;

public final class App {
  private App() {}

  public static String greeting(String name) {
    return "Hello, " + name + "!";
  }

  public static void main(String[] args) {
    System.out.println(greeting("Dev Container"));
  }
}
