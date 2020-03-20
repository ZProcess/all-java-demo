package com.fanxing;

public class Fanxing4 {

  //不是泛型方法
  public void showValue(Fanxing5<?> t){
    System.out.println(t.key);
  }
  //不是泛型方法
  public <E> void showValue2(Fanxing5<E> t){
    System.out.println(t.key);
  }

  public static void main(String[] args) {
    Fanxing5<Number> fanxing = new Fanxing5<>(12);
    Fanxing5<Integer> fanxing2 = new Fanxing5<>(123);
    Fanxing4 fanxing4 = new Fanxing4();
    fanxing4.showValue(fanxing2);
    fanxing4.showValue(fanxing);
    fanxing4.showValue2(fanxing);
    fanxing4.showValue2(fanxing2);
  }
}
