package com.rabbitmq.fanout;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Recv2 {

  public static void main(String[] args) {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("49.235.9.214");

    try {

      Connection connection = factory.newConnection();
      Channel channel = connection.createChannel();
      channel.exchangeDeclare("logs", "fanout");
      String queueName = channel.queueDeclare().getQueue();
      channel.queueBind(queueName, "logs", "");
      System.out.println(queueName);
      System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
      DeliverCallback deliverCallback = (consumerTag, delivery) -> {
        String message = new String(delivery.getBody(), "UTF-8");
        System.out.println(" [x] Received '" + message + "'");
      };
      channel.basicConsume(queueName, true, deliverCallback, consumerTag -> {
      });
    } catch (IOException e) {
      e.printStackTrace();
    } catch (TimeoutException e) {
      e.printStackTrace();
    }

  }
}
