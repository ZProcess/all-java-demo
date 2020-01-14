package com.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Person p1 = new Person("皮卡丘",11);
    Person p2 = new Person("喷火龙",5);
    Person p3 = new Person("杰尼龟",6);
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Person.txt"));
    System.out.println("序列化前");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    objectOutputStream.writeObject(p1);
    objectOutputStream.writeObject(p2);
    objectOutputStream.writeObject(p3);
    p3.setName("妙蛙种子");
    p3.setAge(8);
    objectOutputStream.writeObject(p3);
    System.out.println("-----------------------------------------");
    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Person.txt") );
    Person p11 = (Person) objectInputStream.readObject();
    Person p22 = (Person) objectInputStream.readObject();
    Person p33 = (Person) objectInputStream.readObject();
    Person p44 = (Person) objectInputStream.readObject();
    System.out.println("反序列化");
    System.out.println(p11);
    System.out.println(p22);
    System.out.println(p33);
    System.out.println(p44);
  }
}
