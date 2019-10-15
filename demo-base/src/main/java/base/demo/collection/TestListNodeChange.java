package base.demo.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangzezhou
 * @create 2019-07-15 10:27 AM
 * @desc 测试list内容转换
 **/
public class TestListNodeChange<T> {


    public static void main(String[] args) {
        new TestListNodeChange<String>().test();

    }


    void test() {

        List<String> list = new ArrayList<>();
        list.add("aaaaaa");
        list.add("bbbbbb");
        list.add("cccccc");

        List<String> to = list.stream().map(String :: valueOf).collect(Collectors.toList());

        System.out.println(to);

    }
}
