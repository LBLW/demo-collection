package base.demo.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wangzezhou
 * @create 2020-05-22 11:43 AM
 * @desc List源码阅读
 **/
public class TestList {

    public static void main(String[] args) {
        testArrayList();
    }

    public static void testArrayList() {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        for (String temp : arrayList) {
            System.out.println(temp);
            if("1".equals(temp)) {
                arrayList.remove(temp);
            }
        }
    }

    public static void testLinkedList() {
        List<String> linkedList = new LinkedList<>();
    }


}
