package base.demo.thread;

/**
 * @author wangzezhou
 * @create 2020-05-23 5:34 PM
 * @desc 锁测试
 **/
public class TestLock {


    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();

        synchronized (Thread.currentThread()) {
            obj.wait();
            obj.notify();
        }
    }
}
