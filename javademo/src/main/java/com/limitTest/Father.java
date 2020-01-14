package com.limitTest;

import com.sun.org.apache.regexp.internal.RE;

public class Father {
    protected String protectName = "protectName";
    String defaultName = "defaultName";

    protected String getProtectName (){
         return this.protectName;
    }
    String getDefaultName(){
      return this.defaultName;
    }
}
