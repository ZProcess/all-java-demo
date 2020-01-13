package com.singleObject;

public enum  EnumTest {
    INSTANCE;

  public static void main(String[] args) {
    for (int i = 0; i < 2; i++) {
      new Thread(new Runnable() {
        @Override
        public void run() {
          EnumTest enumTest = EnumTest.INSTANCE;
          System.out.println(enumTest);
        }
      }).start();
    }
  }
}
