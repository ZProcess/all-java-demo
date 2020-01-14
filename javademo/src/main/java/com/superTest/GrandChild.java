package com.superTest;

public class GrandChild extends Child{
   private Igrandchild igrandchild;
  public GrandChild() {
    igrandchild = null;
    System.out.println(igrandchild);
    System.out.println("i am GrandChild2222");
  }
  public GrandChild(String name) {
    this();
    System.out.println("i am GrandChild");
  }
  public static void main(String[] args) {
      GrandChild grandChild = new GrandChild("123");
  }
}
