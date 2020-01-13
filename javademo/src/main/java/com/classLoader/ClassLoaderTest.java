package com.classLoader;

import java.lang.reflect.Field;
import java.net.URL;

public class ClassLoaderTest {

  public static void main(String[] args) {

    URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
    for(URL url : urls){
      System.out.println(url.toExternalForm());
    }

    try {
      Class testClass = Class.forName("com.classLoader.TestClass");
      TestClass instance = (TestClass) testClass.newInstance();
      Field field = testClass.getDeclaredField("name");
      field.setAccessible(true);
      field.set(instance,"12");
      System.out.println(instance);
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    }

  }
}