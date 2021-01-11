package base.demo.io.bio;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wangzezhou
 * @create 2020-12-30 10:29
 * @desc BIO socket 通讯 Server 端
 *
 * 接收消息
 **/

public class Server {

    public static void main(String[] args) {
        bioServer();
    }

    public static void bioServer() {
        //定义一个socketServer进行端口注册
        try(ServerSocket ss = new ServerSocket(9001)) {
            //监听客户端 socket 链接请求
            Socket socket = ss.accept();
            //从socket管道中得到一个字节输入流
            InputStream inputStream = socket.getInputStream();

            //将字节流包装成缓冲流
            //BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String msg;

            //TODO 正常情况这里应该阻塞住，但是没有可能是1.8做了优化
            while ((msg = bufferedReader.readLine()) != null) {
                System.out.println(msg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
