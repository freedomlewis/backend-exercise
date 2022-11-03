package com.thrift.java.demo.server;

import demo.MultiplicationService.Processor;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Server {
  public static final Logger logger = LoggerFactory.getLogger(Server.class.getName());
  public static final int PORT = 9001;

  public static void main(String[] args) {
    try {
      Handler handler = new Handler();
      Processor processor = new Processor(handler);

      Runnable simple = () -> simple(processor);

      new Thread(simple).start();
    } catch (Exception x) {
      x.printStackTrace();
    }
  }

  private static void simple(Processor processor) {
    try {
      TServerTransport serverTransport = new TServerSocket(PORT);
      TServer.Args args = new Args(serverTransport);
      args.processorFactory(new TProcessorFactory(processor));
      TServer server = new TSimpleServer(args);

      logger.info("The simple server start at port: " + PORT);
      server.serve();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
