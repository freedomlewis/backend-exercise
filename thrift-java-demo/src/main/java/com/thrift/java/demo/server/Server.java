package com.thrift.java.demo.server;

import demo.MultiplicationService.Processor;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TSocket;

public class Server {

  public static Handler handler;

  public static Processor processor;

  public static void main(String [] args) {
    try {
      handler = new Handler();
      processor = new Processor(handler);

      Runnable simple = () -> simple(processor);

      new Thread(simple).start();
    } catch (Exception x) {
      x.printStackTrace();
    }
  }

  public static void simple(Processor processor) {
    try {
      TServerTransport serverTransport = new TServerSocket(9090);
      TServer.Args args = new Args(serverTransport);
      args.processorFactory(new TProcessorFactory(processor));
      TServer server = new TSimpleServer(args);

      System.out.println("Starting the simple server...");
      server.serve();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
