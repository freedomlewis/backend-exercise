load("@rules_java//java:defs.bzl", "java_binary")

java_library(
    name = "guice",
    srcs = ["DemoModule.java", "Greeter.java"],
    visibility = ["//:__pkg__"],
    deps = ["@maven//:com_google_inject_guice", "@maven//:javax_inject_javax_inject"],
)