package base.demo.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangzezhou
 * @create 2019-10-17 9:23 AM
 * @desc 时间比较
 **/
public class TimeCompare {

    public static void main(String[] args) throws ParseException {

        DateFormat format = new SimpleDateFormat("HH:mm:ss");

        Date compareDate = format.parse("17:00:00");
        long currentTime = System.currentTimeMillis();

        if(currentTime > compareDate.getTime()) {
            System.out.println("当前时间大于比较时间");
        } else {
            System.out.println("当前时间小于比较时间");
        }
    }
}
