package base.demo.other;

/**
 * @author wangzezhou
 * @create 2020-09-07 1:17 PM
 * @desc 测试内部类
 *
 * 静态内部类不可以直接访问外围类的非静态数据，
 * 而非静态内部类可以直接访问外围类的数据，包括私有数据。
 **/
public class TestInnerClass {

    private int property1 = 2;

    private static int property2 = 1;

    class InnerClass {

        int property = property1+1;
    }

    static class StaticInnerClass {

        int property = property2+1;
    }
}
