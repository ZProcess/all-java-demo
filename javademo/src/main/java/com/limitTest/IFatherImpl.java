package com.limitTest;

import jdk.nashorn.internal.ir.IfNode;

public class IFatherImpl implements IFather ,IFatherB{

  @Override
  public String getIFatherName() {
    return null;
  }

  @Override
  public void printDefault() {
    System.out.println("a 和 b中同时又default，必须冲洗呢，否则不知道该选择哪一个");
  }
  public static void printStatic(){
    System.out.println("child Static");
  }
  public static void main(String[] args) {
    IFather iFather = new IFatherImpl();
     iFather.getIFatherName();
    String name = IFather.iName;
    String name2 = IFatherImpl.iName;
    iFather.printDefault();
    IFather.printStatic();
    IFatherImpl.printStatic();
  }
}
