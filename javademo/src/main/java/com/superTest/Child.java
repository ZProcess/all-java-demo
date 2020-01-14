package com.superTest;

public class Child extends Father {

  public Child() {
    System.out.println("i am Child2222");
  }
  public Child(String name) {
    super(name);
    System.out.println("i am Child");
  }

}
