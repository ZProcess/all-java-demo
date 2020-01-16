package com.prototypePattern;

import java.util.ArrayList;

public class DeepCopy implements Cloneable{
  private String name;
  private int age;
  private ArrayList list;


  public DeepCopy clone() throws CloneNotSupportedException{
     DeepCopy deepCopy =  (DeepCopy) super.clone();
     deepCopy.list = (ArrayList) this.list.clone();
     return deepCopy;
  }

  public DeepCopy(String name, int age, ArrayList list) {
    this.name = name;
    this.age = age;
    this.list = list;
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

  public ArrayList getArrayList() {
    return list;
  }

  public void setArrayList(ArrayList list) {
    this.list = list;
  }

  @Override
  public String toString() {
    return "DeepCopy{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", list=" + list +
        '}';
  }
}
