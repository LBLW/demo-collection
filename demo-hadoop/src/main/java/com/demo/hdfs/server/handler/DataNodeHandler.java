package com.demo.hdfs.server.handler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @author wangzezhou
 * @create 2018-08-31 下午4:08
 * @desc dataNode 处理
 **/
public class DataNodeHandler implements Runnable {

    private Socket socket;

    public DataNodeHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {

            InputStream inputStream = socket.getInputStream();

            byte[] bytes = new byte[22];
            inputStream.read(bytes);

            String requestMsg = new String(bytes);

            String[] requestMsgArray = requestMsg.split(":");
            String blockId = requestMsgArray[1];

            FileOutputStream fileStream = new FileOutputStream("/Users/lblw/Downloads/hdptmp/data/" + blockId);
            int len;
            byte[] fileBytes = new byte[4096];

            while ((len = inputStream.read(fileBytes)) != -1) {
                fileStream.write(fileBytes, 0, len);
            }

            fileStream.close();
            inputStream.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
