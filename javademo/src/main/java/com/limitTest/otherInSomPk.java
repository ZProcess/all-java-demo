package com.limitTest;

//default只能再同一个包下被访问
//protected 能够在同一个包下被访问，不同包的子类也可访问，不同包非子类不可使用
public class otherInSomPk {

  public static void main(String[] args) {
    Father father = new Father();
    father.getDefaultName();
    father.getProtectName();

    ChildInSomePk childInSomePk = new ChildInSomePk();
    childInSomePk.getDefaultName();
    childInSomePk.getProtectName();
  }
}
