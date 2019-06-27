package base.demo.string;

/**
 * @author wangzezhou
 * @create 2018-12-05 4:11 PM
 * @desc 测试subString()
 **/
public class StringSubString {

    public static void main(String[] args) {
        String siteCode = "013-013";

        System.out.println(siteCode.substring(0,3));


        String path_1 = "/opt/alarmFile/FILE/";
        String path_2 = "/opt/alarm/FILE/";

        System.out.println(path_1.substring(0,path_1.length() - 4));
        System.out.println(path_2.substring(0,path_2.length() - 4));
    }
}
