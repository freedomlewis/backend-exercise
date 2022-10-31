gRPC Demo
==============================================

# Build
```
  // cd to the project root folder 
  ./gradlew installDist
```

# Run server
```
  ./build/install/examples/bin/hello-world-server
  
  // see the print result:
  INFO: Server started, listening on 50051
```

# Run client
```
  ./build/install/examples/bin/hello-world-client
  
  // see the print result
  INFO: Will try to greet gRPC
  INFO: Greeting: Hello gRPC
```