package com.proxyMethod.jdkProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SingerProxy {

  public static void main(String[] args) {
    Singer singer = new Singer();
    ISinger proxy = (ISinger) Proxy
        .newProxyInstance(singer.getClass().getClassLoader(), singer.getClass().getInterfaces(),
            new InvocationHandler() {
              @Override
              public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                if("dance".equals(method.getName())){
                  return method.invoke(singer,args);
                }
                System.out.println("向观众问好$$$$$$$");
                Object object = method.invoke(singer,args);
                System.out.println("谢谢大家$$$$$$$");
                return object;
              }
            });
    proxy.sing();
    System.out.println("------------------------------");
    proxy.dance();
  }
}
