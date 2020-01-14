package com.limitTest.otherPack;

import com.limitTest.Father;

public class ChildInOtherPk extends Father {

  public static void main(String[] args) {
    ChildInOtherPk childInOtherPk = new ChildInOtherPk();
    childInOtherPk.protectName = "otherProtectName";

  }
}
