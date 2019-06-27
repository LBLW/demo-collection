package base.demo.math;

/**
 * @author wangzezhou
 * @create 2019-06-13 3:56 PM
 * @desc 字符串转整数
 **/
public class IntegerParse {

    public static void main(String[] args) {

        String a = "01:00";

        String b = "10:00";

        System.out.println(Integer.parseInt(a.split(":")[0]));
        System.out.println(Integer.parseInt(b.split(":")[0]));
    }
}
