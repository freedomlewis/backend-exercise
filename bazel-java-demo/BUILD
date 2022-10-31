load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "App",
    srcs = glob(["src/main/java/com/bazel/java/demo/*.java", "src/main/java/com/bazel/java/demo/guice/*.java"]),
    deps = ["@maven//:com_google_inject_guice", "@maven//:javax_inject_javax_inject"],
)