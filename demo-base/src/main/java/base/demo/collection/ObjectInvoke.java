package base.demo.collection;

import base.demo.pojo.SimpleClass;
import base.demo.pojo.SimpleInnerClass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzezhou
 * @create 2018-12-04 10:50 AM
 * @desc 测试对象引用
 **/
public class ObjectInvoke {

    public static void main(String[] args) {

        List<SimpleClass> simpleClassList = new ArrayList<>();

        for(int i=0; i<5; i++) {

            SimpleInnerClass simpleInnerClass = new SimpleInnerClass();
            simpleInnerClass.setKey("SimpleKey");
            simpleInnerClass.setValue("SimpleValue");

            SimpleClass simpleClass = new SimpleClass();

            simpleClass.setId(i);
            simpleClass.setInnerClass(simpleInnerClass);
            simpleClassList.add(simpleClass);
        }

        System.out.println(simpleClassList);

        for(SimpleClass simpleClass : simpleClassList) {

            if(simpleClass.getId() % 2 == 0) {
                SimpleInnerClass innerClass = simpleClass.getInnerClass();
                innerClass.setKey("otherSimpleKey");
                innerClass.setValue("otherSimpleValue");
            }

        }

        System.out.println(simpleClassList);
    }
}
