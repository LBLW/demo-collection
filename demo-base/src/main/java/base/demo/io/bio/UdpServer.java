package base.demo.io.bio;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author wangzezhou
 * @create 2021-01-08 10:28
 * @desc udp通道
 **/
public class UdpServer {

    private DatagramSocket socket;

    public UdpServer() throws SocketException {

        socket = new DatagramSocket();
    }

    public void send(String msg) throws IOException {
        byte[] outData = msg.getBytes("utf-8");

        DatagramPacket datagramPacket = new DatagramPacket(outData,outData.length, InetAddress.getByName("127.0.0.1"),9990);
        socket.send(datagramPacket);
    }

    public void receive() throws IOException {

        DatagramPacket datagramPacket = new DatagramPacket(new byte[1024], 1024);

        while (true) {
            socket.receive(datagramPacket);

            String msg = new String(datagramPacket.getData(), 0, 1024,"utf-8");

            System.out.println(msg);
        }

    }

    public static void main(String[] args) throws IOException {
        UdpServer udpServer = new UdpServer();

        new Thread(()->{
            try {
                udpServer.receive();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String msg = scanner.nextLine();
            udpServer.send(msg);
        }
    }
}
