package TestRedis;

import redis.clients.jedis.Jedis;

public class TestRedis {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //设置 redis 字符串数据
        jedis.set("A", "A+");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: "+ jedis.get("A"));
    }
}

 