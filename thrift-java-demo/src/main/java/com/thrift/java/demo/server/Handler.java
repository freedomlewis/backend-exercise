package com.thrift.java.demo.server;

import demo.MultiplicationService;
import org.apache.thrift.TException;

public class Handler implements MultiplicationService.Iface {

  @Override
  public int multiply(int n1, int n2) throws TException {
    System.out.println("Multiply(" + n1 + "," + n2 + ")");
    return n1 * n2;
  }
}
