package com.bazel.java.demo.guice;

import javax.inject.Inject;

import com.bazel.java.demo.guice.annotation.Count;
import com.bazel.java.demo.guice.annotation.Message;

public class Greeter {
  private final String message;
  private final int count;

  @Inject
  Greeter(@Message String message, @Count int count) {
    this.message = message;
    this.count = count;
  }

  public void sayHello() {
    for (int i = 0; i < count; i++) {
      System.out.println(message + " " + i);
    }
  }
}