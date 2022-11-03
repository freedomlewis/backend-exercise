package com.thrift.java.demo.client;

import com.thrift.java.demo.server.Server;
import demo.MultiplicationService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
  public static final Logger logger = LoggerFactory.getLogger(Client.class.getName());

  public static void main(String[] args) {

    try {
      TTransport transport;

      transport = new TSocket("localhost", Server.PORT);
      transport.open();

      TProtocol protocol = new TBinaryProtocol(transport);
      MultiplicationService.Client client = new MultiplicationService.Client(protocol);

      perform(client);

      transport.close();
    } catch (TException x) {
      x.printStackTrace();
    }
  }

  private static void perform(MultiplicationService.Client client) throws TException {
    int product = client.multiply(3, 5);
    logger.info("3*5=" + product);
  }
}
