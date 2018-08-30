package com.demo.client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author wangzezhou
 * @create 2018-08-30 下午3:00
 * @desc HDFS客户端
 **/
public class Client {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost",9000);

        OutputStream requestStream = socket.getOutputStream();

        requestStream.write("PUT_BLOCK:/aa/a.log:1".getBytes());
        requestStream.flush();

        InputStream responseStream = socket.getInputStream();

        byte[] bytes = new byte[1024];

        int readCut = responseStream.read(bytes);

        String response = new String(bytes,0, readCut);

        System.out.println(String.format("Response is %s", response));
        requestStream.close();
        responseStream.close();
        socket.close();
    }
}
