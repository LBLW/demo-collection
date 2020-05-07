package base.demo.thread;


/**
 * @author wangzezhou
 * @create 2020-04-30 3:56 PM
 * @desc 测测wait个notifyAll方法
 **/
public class TestMethodWaitAndNotifyAll {

    public static void main(String[] args) throws InterruptedException {

        final Object obj = new Object();

        Thread t1 = new Thread(()->{
            synchronized (obj) {
                try {
                    obj.wait();
                    System.out.println("T1 is wake up");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        Thread.sleep(1000);

        Thread t2 = new Thread(()->{
           synchronized (obj) {
               obj.notifyAll();
               System.out.println("T2 send notify");
           }
        });

        t2.start();
    }
}
