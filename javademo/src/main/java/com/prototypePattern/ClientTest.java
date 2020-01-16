package com.prototypePattern;

import java.util.ArrayList;

public class ClientTest {

//  public static void main(String[] args) throws CloneNotSupportedException {
//    ArrayList arrayList = new ArrayList();
//    arrayList.add(1);
//    arrayList.add(2);
//    arrayList.add(3);
//    ShallowCopy shallowCopy = new ShallowCopy("zjc", 11, arrayList);
//    System.out.println("shallowCopy==" + shallowCopy);
//    ShallowCopy shallowCopy1 = shallowCopy.clone();
//    System.out.println("shallowCopy1==" + shallowCopy1);
//    shallowCopy.getList().add(4);
//    System.out.println("shallowCopy1==" + shallowCopy1);
//  }

  public static void main(String[] args) throws CloneNotSupportedException {
    ArrayList arrayList = new ArrayList();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    DeepCopy deepCopy = new DeepCopy("zjc", 12, arrayList);
    System.out.println(deepCopy);
    DeepCopy deepCopy1 = deepCopy.clone();
    System.out.println(deepCopy1);
    deepCopy.getArrayList().add(4);
    deepCopy.getArrayList().add(5);
    System.out.println(deepCopy);
    System.out.println(deepCopy1);

  }
}
