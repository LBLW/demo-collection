package base.demo.io.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wangzezhou
 * @create 2021-01-06 15:05
 * @desc bio端口转发实现的服务端
 * 实现端口转发，服务端需要：
 * 一、接收客户端连接
 * 二、创建一个在线的socket客户端集合
 * 三、循环在线的socket客户端并将消息推送给这些客户端
 **/
public class PortChangeServer {

    public volatile static List<Socket> onlineSocket = new ArrayList<>();

    static Executor executor = new ThreadPoolExecutor(5,10,1000,
            TimeUnit.SECONDS,new LinkedBlockingDeque<>());

    public static void chatServer(){

        try(ServerSocket serverSocket = new ServerSocket(9001)) {

            while(true){
                Socket socket = serverSocket.accept();
                //在线的的客户端存入在线集合中
                onlineSocket.add(socket);

                executor.execute(new ServerReader(socket));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
