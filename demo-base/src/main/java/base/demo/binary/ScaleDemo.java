package base.demo.binary;

/**
 * @author wangzezhou
 * @create 2018-11-08 10:52 AM
 * @desc 进制问题
 **/
public class ScaleDemo {

    public static void main(String[] args) {

        //十进制
        int a = 10;

        //数字前 + 0 表示8进制
        int b = 01;

        //8进制数字最大到7
        // int c = 08; 错误的
        int c = 07;

        int d = 017;

        //数字前 + 0x 表示16进制
        int e = 0x1;

        //表示 16
        int f =0x10;

        //表示 10 16进制数字表示 1 - f
        int g = 0xa;

        int h = 0xf;

    }
}
