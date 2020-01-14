package com.proxyMethod.cglibProxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor {

  //维护目标对象
  private Object target;


  public ProxyFactory(Object target) {
    this.target = target;
  }

  public Object getProxyInstance() {
    //1. 实例化工具类
    Enhancer en = new Enhancer();
    //2. 设置父类对象
    en.setSuperclass(this.target.getClass());
    //3. 设置回调函数
    en.setCallback(this);
    //4. 创建子类，也就是代理对象
    return en.create();
  }

  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
      throws Throwable {
    System.out.println("向观众问好@@@@@");
    Object object = method.invoke(target, objects);
    System.out.println("向观众问好@@@@");
    return object;
  }

  public static void main(String[] args) {
    Singer singer = new Singer();
    Singer proxySinger = (Singer) new ProxyFactory(singer).getProxyInstance();
    proxySinger.sing();
  }
}
