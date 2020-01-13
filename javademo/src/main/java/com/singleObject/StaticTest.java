package com.singleObject;

public class StaticTest {

  private StaticTest() {
  }

  private static class InnerClass{
      private static final StaticTest staticTest = new StaticTest();
  }

  public static StaticTest getInstance(){
    return InnerClass.staticTest;
  }
  public static void main(String[] args) {
    for (int i = 0; i < 2; i++) {
      new Thread(new Runnable() {
        @Override
        public void run() {
          StaticTest staticTest = StaticTest.getInstance();
          System.out.println(staticTest);
        }
      }).start();
    }
  }
}
