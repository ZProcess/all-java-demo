package com.jedis;

import java.util.Set;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisTest {

  public static void main(String[] args) {
//    Jedis jedis = new Jedis ("139.9.101.36",6379);
//    jedis.auth("tansun");
//    jedis.connect();//连接
//    Set<String> keys = jedis.keys("*"); //列出所有的key
//    System.out.println(keys);
    JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
    JedisPool jedisPool = new JedisPool(jedisPoolConfig,"139.9.101.36",6379,1000,"tansun");
    Jedis jedis = jedisPool.getResource();
    Set<String> keys = jedis.keys("*"); //列出所有的key
    System.out.println(keys);

  }
}
