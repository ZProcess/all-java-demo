package com.assertTest;

//默认情况下assert关闭，需要jvm启动添加 -ea
public class AssertTest {

  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    // 格式1：assert [boolean 表达式]
    assert a > b :"a不能大于b";
    assert b>a;
  }
}
