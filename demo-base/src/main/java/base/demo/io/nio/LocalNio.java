package base.demo.io.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author wangzezhou
 * @create 2020-05-08 11:03 AM
 * @desc java nio的本地调用不涉及网络
 **/
public class LocalNio {

    private static final int BSIZE = 1024;

    private static final String FILE_NAME = "nio_test.data";

    /**
     * io中以下三种流通过nio进行了优化，可以获取channel通道。
     * @throws IOException
     */
    public void getChannel() throws IOException {

        FileChannel fc = new FileOutputStream(FILE_NAME).getChannel();

        fc.write(ByteBuffer.wrap("Some text".getBytes()));
        fc.close();

        fc = new RandomAccessFile(FILE_NAME,"rw").getChannel();

        fc.position(fc.size());//对channel中的数据进行操作
        fc.write(ByteBuffer.wrap("some more".getBytes()));
        fc.close();

        fc = new FileInputStream(FILE_NAME).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        fc.read(buffer);
        buffer.flip();

        while (buffer.hasRemaining()) {
            System.out.println((char) buffer.get());
        }

        fc.close();
    }

    public static void main(String[] args) {
        LocalNio localNio = new LocalNio();
        try {
            localNio.getChannel();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
