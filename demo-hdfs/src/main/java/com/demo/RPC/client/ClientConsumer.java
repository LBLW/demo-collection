package com.demo.RPC.client;

import com.demo.RPC.service.LoginService;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @author wangzezhou
 * @create 2018-09-07 上午11:08
 * @desc 服务调用方
 **/
public class ClientConsumer {

    public static void main(String[] args) throws IOException {

        LoginService loginService = RPC.getProxy(LoginService.class, 1L,
                            new InetSocketAddress("localhost", 10000),
                            new Configuration());

        System.out.println(loginService.login("rabbit", "tank"));
    }
}
