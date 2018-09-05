package com.demo.client;


import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author wangzezhou
 * @create 2018-08-30 下午3:00
 * @desc HDFS客户端
 **/
public class PutClient {

    public static void main(String[] args) throws Exception {

        //与 nameNode 的交互过程


        String nameNodeResponse = requestNameNode("");
        String[] responseResult = nameNodeResponse.split(":");

        String blockId = responseResult[0];
        String node = responseResult[1];



        // 与 dataNode 的交互

        requestDataNode(blockId, node, "/Users/lblw/Downloads/dc.log");



    }

    public static String requestNameNode(String filePath) throws Exception {

        Socket socket = new Socket("localhost",9000);

        OutputStream requestStream = socket.getOutputStream();

        requestStream.write(filePath.getBytes());
        requestStream.flush();

        InputStream responseStream = socket.getInputStream();

        byte[] bytes = new byte[1024];

        int readCut = responseStream.read(bytes);

        String response = new String(bytes,0, readCut);

        System.out.println(String.format("Response is %s", response));

        requestStream.close();
        responseStream.close();
        socket.close();

        return response;
    }

    public static String requestDataNode(String blockId, String node, String filePath) throws Exception {

        Socket socket = new Socket("localhost", 9900);

        OutputStream requestStream = socket.getOutputStream();

        requestStream.write(String.format("PUT_FILE:%s", blockId).getBytes());
        requestStream.flush();

        FileInputStream fileStream = new FileInputStream(filePath);
        byte[] bytes = new byte[4096];
        int len = 0;
        int count = 0;

        while((len = fileStream.read(bytes)) != -1) {

            requestStream.write(bytes, 0, len);
            requestStream.flush();
            count += len;
            if(count == 1 * 1024 * 1024) {
                break;
            }

        }
        fileStream.close();
        requestStream.close();
        socket.close();

        return null;

    }


}
