package com.demo.server;

import com.demo.server.handler.NameNodeHandler;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wangzezhou
 * @create 2018-08-30 下午5:54
 * @desc Namenode服务端
 **/
public class NameNodeServer {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(9000);

        while (true) {

            Socket socket = serverSocket.accept();

            new Thread(new NameNodeHandler(socket)).start();

        }


    }
}
