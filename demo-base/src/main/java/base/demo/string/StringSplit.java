package base.demo.string;

/**
 * @author
 * @create 2018-08-06 下午4:10
 * @desc 切字符串
 **/
public class StringSplit {

    public static void main(String[] args) {
        String station = "3101232053999";
//        int station_length = station.length();
//        System.out.println(station.substring((station_length-6),(station_length-3)));

        String test_str_1 = " 200000 ";
        String test_str_2 = " 200000 400000 ";
        String test_str_3 = " 20 40 50";

//        System.out.println(rightTrim(test_str_3));

        int i=0;
        int j=0;
        System.out.println(i++);
        System.out.println(++j);

    }

    public static String rightTrim(String  str) {

        if(str == null) {
            return "";
        }

        int length = str.length();
        for(int i =  length - 1; i >= 0; i--) {
            if(str.charAt(i) != 0x20) {
                break;
            }

            length --;

        }

        return str.substring(0, length);

    }
}
