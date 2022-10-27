load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "App",
    srcs = glob(["src/main/java/com/bazel/java/demo/*.java"]),
    deps = ["//src/main/java/com/bazel/java/demo/greeting:greeter"],
)