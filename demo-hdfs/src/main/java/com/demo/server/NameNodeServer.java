package com.demo.server;

import com.demo.server.handler.NameNodeHandler;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangzezhou
 * @create 2018-08-30 下午5:54
 * @desc Namenode服务端
 **/
public class NameNodeServer {

    public static void main(String[] args) throws Exception {

        Map<String, Map<Long, String>> metaData = new ConcurrentHashMap<>();

        ServerSocket serverSocket = new ServerSocket(9000);


        while (true) {

            Socket socket = serverSocket.accept();

            new Thread(new NameNodeHandler(socket, metaData)).start();

        }


    }
}
