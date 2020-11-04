package base.demo.jvm;

/**
 * @author wangzezhou
 * @create 2019-02-15 11:12 AM
 * @desc java语言与jvm看待boolean方式是否相同
 **/
public class CheckBoolean {

    public static void main(String[] args) {
        boolean flag = true;

        if(flag)
            System.out.println("hello, world");

        if(flag == true)
            System.out.println("hello, jvm");

        int m = 12;
        int n = 34;

        System.out.println(String.format("%d,%d",m++,++n));
        System.out.println(String.format("%d,%d",n++,++m));
    }
}
