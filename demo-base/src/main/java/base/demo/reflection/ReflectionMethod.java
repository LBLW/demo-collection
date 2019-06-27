package base.demo.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wangzezhou
 * @create 2018-11-06 5:15 PM
 * @desc
 **/
public class ReflectionMethod {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Class<TestClass> clazz = TestClass.class;
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

        System.out.println(testA);

        testA = (TestA) getField(testA);

        System.out.println(testA);

    }


    public static TestB getField(TestB testB)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method[] methods = testB.getClass().getMethods();


        Method method = testB.getClass().getDeclaredMethod("setE",int.class);
        method.invoke(testB,testB.getRow());

        return testB;

    }


}
