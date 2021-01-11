package base.demo.io.bio;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author wangzezhou
 * @create 2020-12-30 10:30
 * @desc Bio socket 通讯 client 端
 *
 * 发送消息
 **/
public class Client {

    public static void main(String[] args) {
        bioSendClient();
    }

    public static void bioClient() {
        //创建一个socket监听9001端口
        try(Socket socket = new Socket("127.0.0.1",9001)) {

            OutputStream outputStream = socket.getOutputStream();

            //并非写缓冲区，而是打印
            //BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

            PrintStream printStream = new PrintStream(outputStream);

            String msg = "Test bio block code";

            // 非换行println方法
            printStream.print(msg);
            printStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bioSendClient() {
        //创建一个socket监听9001端口
        //
        try(Socket socket = new Socket("127.0.0.1",9001)) {

            OutputStream outputStream = socket.getOutputStream();

            //并非写缓冲区，而是打印
            //BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

            PrintStream printStream = new PrintStream(outputStream);

            //创建扫描器
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("please talk");
                String msg = sc.nextLine();
                //这么写，用 reader.readline() 接收时不会判定为一行结尾，所以会阻塞在那里
                // printStream.print(msg);
                printStream.println(msg);
                printStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}