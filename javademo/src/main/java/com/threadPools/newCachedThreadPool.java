package com.threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class newCachedThreadPool {
  public static void main(String[] args) {
    // 缓存线程池，无上限
    ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
    for (int i = 0; i < 100; i++) {
      cachedThreadPool.execute(new Runnable() {
        @Override
        public void run() {
          System.out.println(Thread.currentThread().getName());
        }
      });
    }
    cachedThreadPool.shutdown();
  }
}
