package com.bazel.java.demo.guice.module;

import com.bazel.java.demo.guice.annotation.Count;
import com.bazel.java.demo.guice.annotation.Message;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class GuiceModule extends AbstractModule {
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
