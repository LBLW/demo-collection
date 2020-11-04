package base.demo.reflection;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wangzezhou
 * @create 2018-11-06 5:15 PM
 * @desc
 **/
public class ReflectionMethod {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<TestClass> clazz = TestClass.class;

//
//        System.out.println(clazz.getName());
//
//       TestBean tb = new TestBean();
//
//        System.out.println(tb.getInt("aaaa"));
//
        TestA testA = new TestA();

        testA.setRow(1111);
        testA.setPage(22222);

        testA.setA("A");
        testA.setB("B");
        testA.setC("C");

//        System.out.println(testA);
//
//        testA = (TestA) getField(testA);
//
//        System.out.println(testA);

        setField(testA,new String[]{"aaaa","bbbb"});
        System.out.println(testA);

    }


    public static TestB getField(TestB testB)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method[] methods = testB.getClass().getMethods();


        Method method = testB.getClass().getDeclaredMethod("setE",int.class);
        method.invoke(testB,testB.getRow());

        return testB;

    }


    public static void setField(Object testB, String[] testArray)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method[] methods = testB.getClass().getMethods();

        Array.newInstance(null,1);
        /**
         * https://blog.csdn.net/cskgnt/article/details/7816212
         */
        Method method = testB.getClass().getMethod("setTestArray",new Class[]{String[].class});

        /**
         * 这是因为编译器会把字符串数组当作一个可变长度参数传给对象o,而我们取得方法只有一个参数,
         * 所以就会出现wrong number of arguments的异常,
         * 我们只要把字符串数组强制转换为一个Object对象就可以解决这个异常了.
         */
        method.invoke(testB,(Object) testArray);
    }



}
