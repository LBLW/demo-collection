package base.demo.thread;

/**
 * @author wangzezhou
 * @create 2020-05-17 8:00 PM
 * @desc 线程的基本测试
 **/
public class TestThread {

    public static void main(String[] args) {

        Thread t1 = new Thread(()->
            System.out.println("Thread"));

        Thread t2 = new Thread(()->
            System.out.println("Thread"));

        t1.start();
        System.out.println("one.");
        t2.start();
        System.out.println("two.");
        t2.interrupt();
        t2.isInterrupted();

    }
}
