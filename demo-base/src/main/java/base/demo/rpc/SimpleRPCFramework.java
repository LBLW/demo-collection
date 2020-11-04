package base.demo.rpc;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wangzezhou
 * @create 2020-11-04 4:49 PM
 * @desc 简单的rpc调用实现
 **/
public class SimpleRPCFramework {

    public static void export(Object server, int port) throws Exception {

        ServerSocket serverSocket = new ServerSocket(port);

        while (true) {
            Socket socket = serverSocket.accept();

            new Thread(()->{
                try {
                    ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();

        }
    }
}
