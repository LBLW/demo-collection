package base.demo.string;

import org.apache.commons.lang.StringUtils;

import java.util.Properties;

/**
 * @author wangzezhou
 * @create 2019-06-17 2:34 PM
 * @desc string 类型 api 测试
 **/
public class StringBase {

    public static void main(String[] args) {

        String ab = "a";
        String ba = "a";
        System.out.println(ab == ba);

        double ac = 2.0;
        int x = 4;

        System.out.println(ac/=++x);

        long a = System.currentTimeMillis();

        System.out.println(String.format("time is %s", a));


        String num = "-4";

        System.out.println(isNumber(num));
        System.out.println(StringUtils.isNumeric(num));

        System.out.println("testPro001".toUpperCase());

        int i=0;
        i=i++;
        System.out.println(i);
    }

    public static boolean isNumber(String str) {

        if(StringUtils.isEmpty(str)) {
            return false;
        }

        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch<'0' || ch>'9') {
                return false;
            }
        }

        return true;
    }
}

