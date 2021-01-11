package base.demo.io.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.*;

/**
 * @author wangzezhou
 * @create 2021-01-04 8:49
 * @desc 多线程socket服务端
 **/
public class MultithreadingServer {

    static Executor executor = new ThreadPoolExecutor(5,10,1000,
            TimeUnit.SECONDS,new LinkedBlockingDeque<>());


    public static void main(String[] args) {
        bioServer();
    }

    public static void bioServer() {

        try(ServerSocket socket = new ServerSocket(9001)) {

            executor.execute(new SocketRunner(socket.accept()));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
