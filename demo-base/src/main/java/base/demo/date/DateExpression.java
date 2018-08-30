package base.demo.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangzezhou
 * @create 2018-07-26 下午5:08
 * @desc 日期转换
 **/
public class DateExpression {

    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(format.format(new Date(1532564706000L)));
        System.out.println(format.format(new Date(1532564042000L)));
        System.out.println(format.format(new Date(1532640074000L)));
        System.out.println(format.format(new Date(1533194864000L)));
        System.out.println(format.format(new Date(1533261659000L)));
        System.out.println(format.format(new Date(1533304964000L)));
        System.out.println(format.format(new Date(1533519192000L)));
        System.out.println(format.format(new Date(1533562392000L)));
    }

}
