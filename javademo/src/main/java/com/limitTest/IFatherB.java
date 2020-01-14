package com.limitTest;

public interface IFatherB {
  default void printDefault(){    //8中可用default关键字设置默认实现
    System.out.println(" i am IFatherB");
  }
}
