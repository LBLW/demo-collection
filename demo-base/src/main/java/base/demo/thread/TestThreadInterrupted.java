package base.demo.thread;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author wangzezhou
 * @create 2020-04-18 4:35 PM
 * @desc 线程终止的具体流程
 **/
public class TestThreadInterrupted implements Runnable {

    public static void main(String[] args) {

        TestThreadInterrupted testThreadInterrupted = new TestThreadInterrupted();
        Thread thread = new Thread(testThreadInterrupted);

        thread.start();
//        thread.interrupt();
        thread.isInterrupted();
    }

    @Override
    public void run() {

    }


}
