package base.demo.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzezhou
 * @create 2020-06-30 3:22 PM
 * @desc 测试Synchronized
 **/
public class TestSynchronized {

    volatile int i = 0;

    public synchronized void count() {
        i++;
    }

    public static void main(String[] args) {

        List<Thread> threadList = new ArrayList<>();

        final TestSynchronized testSynchronized = new TestSynchronized();

        int j = 0;

        while (j < 10){
            Thread thread = new Thread(()->{
                testSynchronized.count();
            });

            threadList.add(thread);

            j++;
        }

        for (Thread thread : threadList) {
            thread.start();
        }

        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(threadList.size());
        System.out.println(testSynchronized.i);

    }


}
