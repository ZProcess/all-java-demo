package com.integerTest;

//String 和基础类型为值传递而非引用传递
public class StringTest {
  private String name = "zjc";
  private int age = 12;
  private char[] c = {'a','b','c'};
  public static void main(String[] args) {
    StringTest stringTest = new StringTest();
    stringTest.change(stringTest.name,stringTest.c);
    System.out.println(stringTest.name);
    System.out.println(stringTest.c);
  }
  public  void change(String s ,char[] c){
      s = "hahah";
      c[0] = 'g';
  }

}
