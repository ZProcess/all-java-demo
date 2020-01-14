package com.javaReference;

public class StrongReferenceTest {
  public static void main(String[] args) {
    new StrongReferenceTest().test();
  }

  public void test() {
    /**
     * 强引用就是指在程序代码之中普遍存在的，比如下面这段代码中的object和objects都是强引用
     * 只要某个对象有强引用与之关联，JVM必定不会回收这个对象，即使在内存不足的情况下，
     * JVM宁愿抛出OutOfMemory错误也不会回收这种对象
     */
    Object object = new Object();
    Object[] objects = new Object[100];
    /**
     * 当运行至Object[] objArr = new Object[100];这句时，如果内存不足，JVM会抛出OOM错误也不会回收object指向的对象。
     * 不过要注意的是，当test运行完之后，object和objects都已经不存在了，所以它们指向的对象都会被JVM回收。
     * 如果想中断强引用和某个对象之间的关联，可以显示地将引用赋值为null，这样一来的话，JVM在合适的时间就会回收该对象。
     */
  }
}
