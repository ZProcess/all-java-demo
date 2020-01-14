package com.limitTest;

public interface IFather {
    String iName = "IFather"; //属性为public static final
    String getIFatherName();// 默认为public
    default void printDefault(){    //8中可用default关键字设置默认实现
      System.out.println(" i am default IFather");
    }
    static void printStatic(){
      System.out.println("statciA");
    }
}
