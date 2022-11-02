load("@rules_java//java:defs.bzl", "java_binary")

java_library(
    name = "Service",
    srcs = glob(["gen-java/demo/MultiplicationService.java"]),
    deps = [
        "@maven//:org_apache_thrift_libthrift",
        "@maven//:javax_annotation_javax_annotation_api",
        "@maven//:org_slf4j_slf4j_api",
        "@maven//:org_slf4j_slf4j_simple"
    ],
)

java_binary(
    name = "Server",
    srcs = glob(["**/demo/**/*.java","gen-java/demo/MultiplicationService.java"]),
    deps = [
        "//:Service",
        "@maven//:org_apache_thrift_libthrift",
                "@maven//:javax_annotation_javax_annotation_api",
                "@maven//:org_slf4j_slf4j_api",
                "@maven//:org_slf4j_slf4j_simple"
        ],
)

java_binary(
    name = "Client",
    srcs = glob(["**/demo/**/*.java","gen-java/demo/MultiplicationService.java"]),
    deps = [
        "//:Service",
        "@maven//:org_apache_thrift_libthrift",
                "@maven//:javax_annotation_javax_annotation_api",
                "@maven//:org_slf4j_slf4j_api",
                "@maven//:org_slf4j_slf4j_simple"
        ],
)