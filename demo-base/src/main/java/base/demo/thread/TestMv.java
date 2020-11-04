package base.demo.thread;

/**
 * @author wangzezhou
 * @create 2020-05-11 3:13 PM
 * @desc 牛客题
 **/
public class TestMv {

    private int data;
    int result = 0;

    public void mv() {
        result += 2;
        data += 2;
        System.out.print(result + " " + data);
    }
}

class ThreadExample extends Thread {

    private TestMv mv;

    public ThreadExample(TestMv mv) {
        this.mv = mv;
    }

    @Override
    public void run() {

        synchronized (mv) {
            mv.mv();
        }
    }
}

class ThreadTest {
    public static void main(String[] args) {
        TestMv testMv = new TestMv();

        ThreadExample t_1 = new ThreadExample(testMv);
        ThreadExample t_2 = new ThreadExample(testMv);
        ThreadExample t_3 = new ThreadExample(testMv);

        t_1.start();
        t_2.start();
        t_3.start();

        Object o = new Object() {
            public boolean equals(Object obj) {
                return true;
            }
        };

        System.out.println(o.equals("Fred"));
    }
}