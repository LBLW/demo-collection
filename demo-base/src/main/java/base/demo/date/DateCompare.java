package base.demo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author wangzezhou
 * @create 2019-07-24 4:55 PM
 * @desc 日期比较
 **/
public class DateCompare {

    public static void main(String[] args) throws Exception {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date startTime = format.parse("2019-07-15 20:00:00");

        Date countEndTime = format.parse("2019-07-15 21:59:59");

        Calendar calendar = Calendar.getInstance();



        while (true) {
            calendar.setTime(startTime);
            calendar.add(Calendar.MINUTE, 5);
            Date endTime = calendar.getTime();
            int countResult = countEndTime.compareTo(endTime);
            System.out.println(countResult);
            if(countResult == -1) {
                break;
            }

            startTime = endTime;
        }
    }
}
