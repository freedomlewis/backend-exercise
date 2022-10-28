package com.bazel.java.demo.guice;

import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

public class DemoModule extends AbstractModule {
  @Qualifier
  @Retention(RUNTIME)
  @interface Message {}

  @Qualifier
  @Retention(RUNTIME)
  @interface Count {}

  @Provides
  @Count
  static Integer provideCount() {
    return 3;
  }

  @Provides
  @Message
  static String provideMessage() {
    return "hello Bazel";
  }
}
