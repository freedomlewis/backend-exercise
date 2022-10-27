load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "runner",
    srcs = ["Runner.java"],
    main_class = "com.bazel.java.demo.runner.Runner",
    deps = ["//src/main/java/com/bazel/java/demo/greeting:greeter"],
)