package com.lamdaInterface;

public class App {

  public static void main(String[] args) {
    TestLamda testLamda = (i,s) ->{
      System.out.println("i is "+i+"s is"+s);
      return "testok";
    };
    testLamda.myRun(1,"2");
  }
}
