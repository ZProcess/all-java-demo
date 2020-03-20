package com.fanxing;

public class Fanxing<T> {
  private T key;
  public Fanxing(T a){
    this.key = a;
  }
  public  T getKey(){
    return this.key;
  }
  public static void main(String[] args) {
    Fanxing fanxing = new Fanxing<Integer>(1);
    System.out.println(fanxing.getKey() instanceof Integer);
  }
}
