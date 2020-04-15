package base.demo.date;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * @author wangzezhou
 * @create 2019-10-17 11:19 AM
 * @desc joda时间比较
 **/
public class TimeCompareByJoda {

    public static void main(String[] args) {
        String start = "20:30";
        String end = "23:30";

        if(containsIntervalTime(start, end)) {
            System.out.println("当前时间位于给出时间段内");
        } else{
            System.out.println("当前时间不在给出时间段内");
        }

    }


    private static String getCurrentDate() {
        return LocalDate.now().toString("yyyy-MM-dd");
    }

    public static boolean containsIntervalTime(String start, String end) {

        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
        String dateStart = getCurrentDate() + " " + start;
        String dateEnd = getCurrentDate() + " " + end;
        DateTime startTime = fmt.parseDateTime(dateStart);
        DateTime endTime = fmt.parseDateTime(dateEnd);

        System.out.println(startTime.toString("yyyy-MM-dd HH:mm"));
        System.out.println(endTime.toString("yyyy-MM-dd HH:mm"));

        Interval interval = new Interval(startTime, endTime);
        return interval.contains(new DateTime());
    }

    public static void datePaseDatetime() {

    }
}
