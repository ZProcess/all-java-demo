package com.classLoader;

public class TestClass {
      private String name;
      private String age;
      public static String test;
  {
    System.out.println("执行普通代码块！！！");
  }
  static {
    test = "@@@@@被加载了该模块";
    System.out.println("执行静态代码块！！！");
  }
  @Override
  public String toString() {
    return "TestClass结果{" +
        "name='" + name + '\'' +
        ", age='" + age + '\'' +
        '}';
  }
}
