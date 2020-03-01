package com.threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class newFixedThreadPool {

  public static void main(String[] args) {
    // 获取计算机有几个核
    int processors = Runtime.getRuntime().availableProcessors();
    System.out.println(processors);
    // 第一种线程池:固定个数的线程池,可以为每个CPU核绑定一定数量的线程数
    ExecutorService fixedThreadPool = Executors.newFixedThreadPool(processors * 5);

    for (int i = 0; i < 10; i++) {
      fixedThreadPool.execute(new Runnable() {

        @Override
        public void run() {
          System.out.println(Thread.currentThread().getName());
        }
      });
    }
    fixedThreadPool.shutdown();
  }
}

