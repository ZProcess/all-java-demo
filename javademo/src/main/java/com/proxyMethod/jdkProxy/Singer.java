package com.proxyMethod.jdkProxy;

public class Singer implements ISinger {

  @Override
  public void sing() {
    System.out.println("唱一首歌");
  }

  @Override
  public void dance() {
    System.out.println("跳舞");
  }
}
