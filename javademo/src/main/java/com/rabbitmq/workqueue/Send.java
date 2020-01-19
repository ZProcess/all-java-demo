package com.rabbitmq.workqueue;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Send {

  public static final String QUEUE_NAME = "hello";

  public static void main(String[] args) {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("49.235.9.214");
    try {
      Connection connection = factory.newConnection();
      Channel channel = connection.createChannel();
      channel.queueDeclare(QUEUE_NAME, false, false, false, null);

      for (int i = 0; i < 10000; i++) {
        String message = "Hello World!" + i;
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        Thread.sleep(1000);
        System.out.println(" [x] Sent '" + message + "'");
      }
    } catch (TimeoutException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
