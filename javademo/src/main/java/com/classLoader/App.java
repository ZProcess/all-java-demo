package com.classLoader;

import java.lang.reflect.Field;
import org.apache.tools.ant.taskdefs.Classloader;

public class App {

  public static void main(String[] args)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
    //执行静态代码块
//    Class c = Class.forName("com.classLoader.TestClass");
//    Field t = c.getDeclaredField("test");
//    System.out.println(t.get(String.class));
    //不执行静态代码块,直到类第一次使用
    Class d = TestClass.class.getClassLoader().loadClass("com.classLoader.TestClass");
    String s = (String) d.getDeclaredField("test").get(String.class);
    System.out.println(s);
    //类已经载入，则执行非静态代码块块
////    TestClass testClass = new TestClass();
  }
}
