# Use guice in Bazel demo

## Build the project
Server
```
    bazel build //:Server
```

Client
```
    bazel build //:Client
```

## Run the server
```
    bazel-bin/Server
```
Server started message

    The simple server start at port: 9001

Client connected message

    Multiply(3,5)

## Run the client
```
    bazel-bin/Client
```
The multiply result from server

    3*5=15