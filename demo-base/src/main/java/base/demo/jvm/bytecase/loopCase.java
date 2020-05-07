package base.demo.jvm.bytecase;

/**
 * @author wangzezhou
 * @create 2020-05-04 2:36 PM
 * @desc 循环相关的字节码案例
 **/
public class loopCase {

    public static void main(String[] args) {

        int i = 0;
        int k = 0;
        int j = 0;
        long x = 0L;

        while(i < 4) {

            k = k++;
            j = ++j;
            i++;
        }

        System.out.println(k);
        System.out.println(j);
    }
}
