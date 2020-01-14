package com.superTest;

public class Father extends GrandFather{

  public Father() {
    System.out.println("i am Father2222");
  }
  public Father(String name) {
    super(name);
    System.out.println("i am Father");
  }
}
