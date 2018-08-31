package base.demo.math;

/**
 * @author wangzezhou
 * @create 2018-08-31 下午4:33
 * @desc 基本数据类型拆装箱比较
 **/
public class BaseData {

    public static void main(String[] args) {
        // -128 - 127 可以直接使用 == 比较大小
        Integer a = -129;

        Integer b = -129;

        System.out.println(a == b);
    }
}
