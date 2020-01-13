package com.singleObject;

public class HungerTest {
   private static final HungerTest hungerTest = new HungerTest();
  private HungerTest() {
  }
  public static HungerTest getInstance () {
        return hungerTest;
  }

  public static void main(String[] args) {
    for(int i = 0;i<100;i++){
      new Thread(new Runnable() {
        @Override
        public void run() {
          HungerTest hungerTest = HungerTest.getInstance();
          System.out.println(hungerTest);
        }
      }).start();
    }
  }
}
