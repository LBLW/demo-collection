package base.demo.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author wangzezhou
 * @create 2019-05-24 2:51 PM
 * @desc 初始化日期
 **/
public class InitializationDate {

    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);

        Date nowDate = calendar.getTime();

        System.out.println(dateFormat.format(nowDate));

        calendar.set(Calendar.MONDAY, calendar.get(Calendar.MONDAY) - 1);

        String lastDate = dateFormat.format(calendar.getTime());

        System.out.println(lastDate);


    }
}
