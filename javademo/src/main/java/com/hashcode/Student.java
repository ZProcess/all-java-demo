package com.hashcode;

import java.util.Objects;

public class Student {
  private String name;
  private int age;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return age == student.age &&
        Objects.equals(name, student.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
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

  public static void main(String[] args) {
    Student student = new Student("zjc",123);
    Student student1 = new Student("zjc",123);
    System.out.println(student.equals(student1));
    System.out.println(student.hashCode());
    System.out.println(student1.hashCode());
  }
}
