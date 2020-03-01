package com.threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
SingleThreadExecutor是使用单个worker线程的Executor，作为单一worker线程的线程池，
SingleThreadExecutor把corePool和maximumPoolSize均被设置为1，和FixedThreadPool一样使用的是无界队列LinkedBlockingQueue,
所以带来的影响和FixedThreadPool一样。对于newSingleThreadExecutor()来说，
也是当线程运行时抛出异常的时候会有新的线程加入线程池替他完成接下来的任务。
创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行，
所以这个比较适合那些需要按序执行任务的场景。比如：一些不太重要的收尾，日志等工作可以放到单线程的线程中去执行。
日志记录一般情况会比较慢（数据量大一般可能不写入数据库），顺序执行会拖慢整个接口，
堆积更多请求，还可能会对数据库造成影响（事务在开启中），所以日志记录完全可以扔到单线程的线程中去，一条条的处理，
也可以认为是一个单消费者的生产者消费者模式。
 */
public class newSingleThreadExecutor {
  public static void main(String[] args) {
    // 单一线程池,永远会维护存在一条线程
    ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
    for (int i = 0; i < 10; i++) {
      final int j = i;
      singleThreadPool.execute(new Runnable() {
        @Override
        public void run() {
          System.out.println(Thread.currentThread().getName() + ":" + j);
        }
      });
    }
    singleThreadPool.shutdown();

  }
}
