package com.integerTest;

//-128~127的值被缓存了，所以不生成新对象
public class IntegerTest {

  public static void main(String[] args) {
    Integer a = 100,b=100,c=127,d=127,e=200,f=200;
    System.out.println(a == b);
    System.out.println(d == c);
    System.out.println(e == f);
  }

}
