package base.demo.thread;

/**
 * @author wangzezhou
 * @create 2020-07-09 8:41 PM
 * @desc ThreadLocal源码阅读
 **/
public class TestThreadLocal {


    private static final ThreadLocal<Long> t_l = new ThreadLocal<Long>(){
        @Override
        protected Long initialValue() {
            return System.currentTimeMillis();
        }
    };

    public static final void begin() {

        long time = System.currentTimeMillis();
        t_l.set(time);
        System.out.println("t_l set time is " + time);
    }

    public static final long end() {
        return System.currentTimeMillis() - t_l.get();
    }

    public static void main(String[] args) {

        Thread thread_1 = new Thread(()->{
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            begin();

            System.out.println("Thread_1:" + end());
        });

        Thread thread_2 = new Thread(()->{
            begin();
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread_2:" + end());
        });

        thread_1.start();
        thread_2.start();

    }
}
