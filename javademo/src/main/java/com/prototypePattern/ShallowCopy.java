package com.prototypePattern;

import java.util.List;

public class ShallowCopy implements Cloneable {
    private String name;
    private int age;
    private List list;

  public ShallowCopy(String name, int age, List list) {
    this.name = name;
    this.age = age;
    this.list = list;
  }

  /**
   * 克隆方法
   */
  @Override
  protected ShallowCopy clone() throws CloneNotSupportedException {
    return (ShallowCopy) super.clone();
  }

  @Override
  public String toString() {
    return "ShallowCopy{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", list=" + list +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public List getList() {
    return list;
  }

  public void setList(List list) {
    this.list = list;
  }
}
