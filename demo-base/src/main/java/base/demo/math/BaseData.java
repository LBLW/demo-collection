package base.demo.math;

/**
 * @author wangzezhou
 * @create 2018-08-31 下午4:33
 * @desc 基本数据类型拆装箱比较
 **/
public class BaseData{

    public static void main(String[] args) {
        // -128 - 127 可以直接使用 == 比较大小
        Integer a = -129;

        Integer b = -129;

        System.out.println(a == b);

        Integer paseInteger = Integer.valueOf(59);

        double c = 100.0d;
        double d = 3.0d;

        System.out.println(c%d);

        int i,sum =0;
        for(i=0;i<10;i++,sum+=i);
        System.out.println(i);

        System.out.println(17^5);

        int sa=0;
        int sb=0;

        for(int j=0; j <=100; j++) {
            sa += j;
            sb++;
        }

        System.out.println("sa * sb = " + (sa * sb) );

        char s1 = '\u0639';

        String s2 = "hello,world\0";


       String a1[];
       String[] a2;

       Object a3[];


    }
}
