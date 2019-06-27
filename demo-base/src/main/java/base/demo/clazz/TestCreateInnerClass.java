package base.demo.clazz;

import java.util.Date;
import java.util.LinkedHashMap;

/**
 * @author wangzezhou
 * @create 2019-03-14 4:22 PM
 * @desc 测试静态内部类是否可以创建多个
 **/
public class TestCreateInnerClass {



    public static void main(String[] args) {

        LinkedHashMap<String, TempClass.TempInnerClass> map = new LinkedHashMap<>();

        map.put("a",new TempClass.TempInnerClass("a", Date.class));
        map.put("b",new TempClass.TempInnerClass("b", String.class));
        map.put("c",new TempClass.TempInnerClass("c", int.class));
        map.put("d",new TempClass.TempInnerClass("d", boolean.class));
        map.put("e",new TempClass.TempInnerClass("e", char.class));

        System.out.println(map);
    }
}
