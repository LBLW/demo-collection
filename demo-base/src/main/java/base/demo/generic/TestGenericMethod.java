package base.demo.generic;

import base.demo.reflection.TestA;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzezhou
 * @create 2020-05-10 10:09 AM
 * @desc 泛型方法测试
 **/
public class TestGenericMethod<T> {

    private T t;

    //有返回值的泛型方法
    public <T> T testMethod(Class<T> tClass){
        return null;
    }

    //无返回值的泛型方法
    public <T> void testMethodWithoutReturnValue(Class<T> tClass) {

    }

    public static void main(String[] args) {
        List<TestA> list = new ArrayList<>();
    }
}
