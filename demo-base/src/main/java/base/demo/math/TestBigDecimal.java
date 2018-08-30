package base.demo.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author wangzezhou
 * @create 2018-08-10 下午6:03
 * @desc 测试bigDecimal
 **/
public class TestBigDecimal {

    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal((double) 30 / (double) 100).setScale(2, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
        System.out.println(bigDecimal.toString());
    }
}
