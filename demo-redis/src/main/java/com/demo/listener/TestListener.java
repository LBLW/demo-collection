package com.demo.listener;

import redis.clients.jedis.JedisPubSub;

/**
 * @author wangzezhou
 * @create 2018-09-28 下午3:04
 * @desc 测试监听
 **/
public class TestListener extends JedisPubSub {

    @Override
    public void onPMessage(String pattern, String channel, String message) {
        System.out.println("pattern : " + pattern);
        System.out.println("channel : " + channel);
        System.out.println("message : " + message);
    }
}
