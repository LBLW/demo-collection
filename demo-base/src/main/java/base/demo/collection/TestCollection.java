package base.demo.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wangzezhou
 * @create 2019-12-25 6:31 PM
 * @desc 测试 map set 集合的api
 **/
public class TestCollection {

    public static void main(String[] args) {

        Set<String> testSet = new HashSet<>();

        testSet.add("123456");
        testSet.add("789");
        testSet.add("1");
        testSet.add("12");
        testSet.add("12345");

        System.out.println(testSet);

        testSet.remove("1");

        System.out.println(testSet);
    }

}
