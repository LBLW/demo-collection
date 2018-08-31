package com.demo.server;

import com.demo.server.handler.DataNodeHandler;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wangzezhou
 * @create 2018-08-30 下午5:55
 * @desc Datanode服务端
 **/
public class DataNodeServer {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9900);

        while (true) {

            Socket socket = serverSocket.accept();

            new Thread(new DataNodeHandler(socket)).start();

        }
    }
}
