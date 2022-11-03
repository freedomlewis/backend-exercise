# Use guice in Bazel demo

## Build the project
```
    bazel build //:Server
    bazel build //:Client
```

## Run the server
```
    bazel-bin/Server
    
    // The message
    The simple server start at port: 9001
    
    // This will print when the client connected
    Multiply(3,5)
```

## Run the client
```
    bazel-bin/Client
    
    //The result
    3*5=15
```