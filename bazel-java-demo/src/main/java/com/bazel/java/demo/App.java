package com.bazel.java.demo;

import com.bazel.java.demo.guice.DemoModule;
import com.bazel.java.demo.guice.Greeter;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new DemoModule());
    Greeter greeter = injector.getInstance(Greeter.class);
    greeter.sayHello();
  }
}
