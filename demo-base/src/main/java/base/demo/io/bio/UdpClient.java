package base.demo.io.bio;

import java.io.IOException;
import java.net.*;

/**
 * @author wangzezhou
 * @create 2021-01-07 18:42
 * @desc udp客户端模拟
 **/
public class UdpClient {

    public static void main(String[] args){

        try{
            DatagramSocket ds = new DatagramSocket();

            String str = "UDP传输演示：I'm coming!";

            byte[] buf = str.getBytes();

            DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 9990);
            ds.send(dp);
            ds.close();
        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
