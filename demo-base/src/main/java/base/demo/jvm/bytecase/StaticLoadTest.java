package base.demo.jvm.bytecase;

/**
 * @author wangzezhou
 * @create 2020-05-05 3:07 PM
 * @desc 静态变量加载字节码案例
 **/
public class StaticLoadTest {

    static int i;

    static {
        i = 3;
        System.out.println("hi hello");
    }

    public void print() {
        System.out.println(" print");
    }

    public static void main(String[] args) {

        StaticLoadTest s1 = new StaticLoadTest();
        s1.print();

        StaticLoadTest s2 = new StaticLoadTest();
        s2.print();
    }
}
