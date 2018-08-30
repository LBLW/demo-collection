package base.demo.string;

/**
 * @author wangzezhou
 * @create 2018-08-06 下午4:10
 * @desc 切字符串
 **/
public class StringSplit {

    public static void main(String[] args) {
        String station = "3101232053999";
        int station_length = station.length();
        System.out.println(station.substring((station_length-6),(station_length-3)));
    }
}
