package base.demo.io.bio;

import lombok.AllArgsConstructor;

import java.io.*;
import java.net.Socket;
import java.util.List;

/**
 * @author wangzezhou
 * @create 2021-01-07 9:58
 * @desc 服务端读取消息
 **/
@AllArgsConstructor
public class ServerReader implements Runnable {

    private Socket socket;

    @Override
    public void run() {

        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String msg;

            //TODO 正常情况这里应该阻塞住，但是没有可能是1.8做了优化
            while ((msg = bufferedReader.readLine()) != null) {
                // 服务端接收到客户端消息后，需要推送给所有在线的socket
                sendMsg2AllClient(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // 若出现异常，则代表当前 socket 链接挂起，说明当前 socket 已经下线，需要从列表中移除当前socket
            PortChangeServer.onlineSocket.remove(this.socket);
        }
    }

    /**
     * 推送到所有在线的socket
     * @param msg
     * @throws IOException
     */
    private void sendMsg2AllClient(String msg) throws IOException {
        List<Socket> socketList = PortChangeServer.onlineSocket;

        for(Socket socket : socketList) {
            if(socket != this.socket) {
                PrintStream printStream = new PrintStream(socket.getOutputStream());
                printStream.println(msg);
                printStream.flush();
            }
        }
    }
}
