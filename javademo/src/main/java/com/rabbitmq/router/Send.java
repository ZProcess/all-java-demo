package com.rabbitmq.router;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Send {

  public static void main(String[] args) {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("49.235.9.214");
    try {
      Connection connection = factory.newConnection();
      Channel channel = connection.createChannel();
      channel.exchangeDeclare("direct_logs", "direct");
      String message = "Hello direct_logs_orange!";
      channel.basicPublish("direct_logs", "orange", null, message.getBytes());
      System.out.println(" [x] Sent '" + message + "'");
    } catch (IOException e) {
      e.printStackTrace();
    } catch (TimeoutException e) {
      e.printStackTrace();
    }
  }
}
