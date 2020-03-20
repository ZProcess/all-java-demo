package com.fanxing;

public class Fanxin3<E,T> implements FanxingInterface<T> {

  @Override
  public T getInterface() {
    return null;
  }
  public Fanxin3(E s){
    this.key = s;
  }
  private E key;
  public E getKey(){
    return this.key;
  }
  public static void main(String[] args) {
    Fanxin3<String,Integer> fanxin3 = new Fanxin3<String,Integer>("1333");
    System.out.println(fanxin3.getKey());
  }
}
