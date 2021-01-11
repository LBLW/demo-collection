package base.demo.io.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author wangzezhou
 * @create 2021-01-04 10:02
 * @desc 单个socket处理
 **/
public class SocketRunner implements Runnable {

    private Socket socket;

    public SocketRunner(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
