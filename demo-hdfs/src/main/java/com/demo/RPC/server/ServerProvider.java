package com.demo.RPC.server;

import com.demo.RPC.service.LoginService;
import com.demo.RPC.service.impl.LoginServiceImpl;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.Server;

import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-09-07 上午11:03
 * @desc 服务发布方
 **/
public class ServerProvider {

    public static void main(String[] args) throws IOException {

        Configuration conf = new Configuration();

        Server server = new RPC.Builder(conf)
                .setBindAddress("localhost")
                .setPort(10000)
                .setProtocol(LoginService.class)
                .setInstance(new LoginServiceImpl())
                .build();

        server.start();
    }
}
