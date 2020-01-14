package com.javaReference;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {
  public static void main(String[] args) {
    /**
     * 弱引用也是用来描述非必需对象的，当JVM进行垃圾回收时，无论内存是否充足，都会回收被弱引用关联的对象。
     * 在java中，用java.lang.ref.WeakReference类来表示。
     */
    WeakReference<String> wr = new WeakReference<>(new String("hello"));

    System.out.println(wr.get());   // hello

    System.gc();

    System.out.println(wr.get());   // null
    /**
     * 第二个输出结果是null，这说明只要JVM进行垃圾回收，被弱引用关联的对象必定会被回收掉。
     * 不过要注意的是，这里所说的被弱引用关联的对象是指只有弱引用与之关联，
     * 如果存在强引用同时与之关联，则进行垃圾回收时也不会回收该对象（软引用也是如此）。
     * 弱引用可以和一个引用队列（ReferenceQueue）联合使用，
     * 如果弱引用所引用的对象被JVM回收，这个软引用就会被加入到与之关联的引用队列中。
     */
  }
}
