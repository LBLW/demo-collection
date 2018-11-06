package com.demo.redis;

import com.demo.listener.TestListener;
import redis.clients.jedis.Jedis;

import java.io.*;
import java.util.Properties;

/**
 * @author wangzezhou
 * @create 2018-09-28 下午2:48
 * @desc 测试redis事件监听
 **/
public class TestRedisKeyEvents {

    public static void main(String[] args) throws IOException {

        String url = "15.75.8.105";
        int port = 6379;
        String auth = "1Qaz2wsx";

        TestListener testListener = new TestListener();

        Jedis jedis = new Jedis(url, port);
        jedis.auth(auth);
        jedis.psubscribe(testListener, "__keyevent@*__:expired");
    }
}