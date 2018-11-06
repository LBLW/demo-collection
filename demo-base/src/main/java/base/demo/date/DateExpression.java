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

        System.out.println(format.format(new Date(1538989444000L)));
     }

}
