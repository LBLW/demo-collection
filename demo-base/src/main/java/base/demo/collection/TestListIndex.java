package base.demo.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author wangzezhou
 * @create 2018-11-30 10:53 AM
 * @desc 测试List相关API
 **/
public class TestListIndex {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("31012326000098");
        list.add("31012326000130");
        list.add("31012326000174");
        list.add("31012326000185");
        list.add("31012326011111");
        list.add("31012326011121");
        list.add("31012326011522");

//        System.out.println(list.indexOf("31012326000186"));

        System.out.println(testCount ());
    }

    /**
     * 测试分隔符
     * @return
     */
    public static String testCount () {

        String count = "a,b,c,d,e";

        String[] counts = count.split(",");

        Set<String> set = new HashSet<>();

        for(String s : counts) {
            set.add(s);
        }

        int countNum = 0;

        StringBuffer str = new StringBuffer();
        for(String b : set) {
            str.append(b);

            if(countNum < set.size()-1) {
                str.append(",");
            }
            countNum++;

        }

        return str.toString();

    }
}
