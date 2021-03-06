package com.javaReference;

import java.lang.ref.SoftReference;

public class SoftRefereneceTest {
  public static void main(String[] args) {
    /**
     * 软引用是用来描述一些有用但并不是必需的对象，在Java中用java.lang.ref.SoftReference类来表示。
     * 对于软引用关联着的对象，只有在内存不足的时候JVM才会回收该对象。因此，这一点可以很好地用来解决OOM的问题，
     * 并且这个特性很适合用来实现缓存：比如网页缓存、图片缓存等。
     * 软引用可以和一个引用队列（ReferenceQueue）联合使用，如果软引用所引用的对象被JVM回收，这个软引用就会被加入到与之关联的引用队列中。
     */
    SoftReference<String> sr = new SoftReference<>(new String("hello"));

    System.out.println(sr.get());   // hello

    System.gc();

    System.out.println(sr.get());   // hello
  }
}
