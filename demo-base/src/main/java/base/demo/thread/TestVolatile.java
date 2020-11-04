package base.demo.thread;

/**
 * @author wangzezhou
 * @create 2020-07-09 11:05 PM
 * @desc volatile关键字特性
 **/
public class TestVolatile {

    private static volatile int a = 0;

    private static int b = 1;

    public static void main(String[] args) {

        Thread thread_1 = new Thread(()->{
            int count = 0;
            int count_2;
            for(int i =0; i< 10; i++) {
                count = count + i;
                count_2 = count + i - 10;
                b = count_2;
                a = count;
                System.out.println("thread_1 : " + b + "，" + a);
            }

        });

        Thread thread_2 = new Thread(()->{
            System.out.println(a);
            System.out.println(b);
        });

        thread_1.start();
        thread_2.start();
    }
}
