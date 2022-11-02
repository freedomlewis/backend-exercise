load("@rules_java//java:defs.bzl", "java_library", "java_binary")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "Service",
    srcs = glob(["gen-java/**/*.java", "**/thrift/**/*.java"]),
    deps = [
        "@maven//:org_apache_thrift_libthrift",
        "@maven//:javax_annotation_javax_annotation_api",
        "@maven//:org_slf4j_slf4j_api",
        "@maven//:org_slf4j_slf4j_simple"
    ],
)

java_binary(
  name = "Server",
  main_class = "com.thrift.java.demo.server.Server",
  runtime_deps = [":Service"],
)

java_binary(
  name = "Client",
  main_class = "com.thrift.java.demo.client.Client",
  runtime_deps = [":Service"],
)
