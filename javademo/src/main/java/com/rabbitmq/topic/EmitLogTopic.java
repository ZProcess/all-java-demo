package com.rabbitmq.topic;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class EmitLogTopic {
  private static final String EXCHANGE_NAME = "topic_logs";

  public static void main(String[] argv) throws Exception {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("49.235.9.214");
    try (Connection connection = factory.newConnection();
        Channel channel = connection.createChannel()) {

      channel.exchangeDeclare(EXCHANGE_NAME, "topic");

      String routingKey = "quick.orange.rabbit" ;
      String message = "hello topic";

      channel.basicPublish(EXCHANGE_NAME, routingKey, null, message.getBytes("UTF-8"));
      System.out.println(" [x] Sent '" + routingKey + "':'" + message + "'");
    }
  }
}
