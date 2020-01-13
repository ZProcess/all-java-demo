package com.singleObject;

public class LazyTest {
   private static LazyTest lazyTest;
   private LazyTest(){

   }
  public static  LazyTest getInstance () {
     if(lazyTest == null){
       synchronized (LazyTest.class){
         if(lazyTest == null){
           lazyTest = new LazyTest();
         }
       }

     }
    return lazyTest;
  }
  public static void main(String[] args) {
    for (int i = 0; i < 2; i++) {
      new Thread(new Runnable() {
        @Override
        public void run() {
          LazyTest lazyTest = LazyTest.getInstance();
          System.out.println(lazyTest);
        }
      }).start();
    }
  }
}
