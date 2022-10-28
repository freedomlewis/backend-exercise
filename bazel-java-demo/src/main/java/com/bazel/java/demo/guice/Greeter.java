package com.bazel.java.demo.guice;

import javax.inject.Inject;

public class Greeter {
  private final String message;
  private final int count;

  @Inject
  Greeter(@DemoModule.Message String message, @DemoModule.Count int count) {
    this.message = message;
    this.count = count;
  }

  public void sayHello() {
    for (int i = 0; i < count; i++) {
      System.out.println(message);
    }
  }
}