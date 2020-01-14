package com.javaVariable;

//测试java可变参数
public class JavaVariable {
  public void testVariable(String... s){
    if(s != null && !"".equals(s)){
      for(int len =0 ; len < s.length; len++){
        System.out.println(s[len]);
      }
    }
  }
  public static void main(String[] args) {
    JavaVariable javaVariable = new JavaVariable();
    javaVariable.testVariable("i","am","zjc");

  }
}
