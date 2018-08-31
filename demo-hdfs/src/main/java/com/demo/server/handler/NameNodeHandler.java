package com.demo.server.handler;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

/**
 * @author wangzezhou
 * @create 2018-08-30 下午9:24
 * @desc Namenode处理
 **/
public class NameNodeHandler implements Runnable {

    private Socket socket;

    private static String[] dataNodes = {"server-104","server-102","server-103"};

    public NameNodeHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {

            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            byte[] bytes = new byte[1024];

            int readCut = inputStream.read(bytes);
            String request = new String(bytes, 0, readCut);

            System.out.println(String.format("Request is %s", request));

            String[] requestParams = request.split(":");

            String requestName = requestParams[0];

            if("PUT_BLOCK".equals(requestName)) {

                long blockId = System.currentTimeMillis();
                int random = new Random().nextInt(2);
                String dataNode = dataNodes[random];

                outputStream.write((blockId + ":" + dataNode).getBytes());
                outputStream.flush();
            }

            inputStream.close();
            outputStream.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
