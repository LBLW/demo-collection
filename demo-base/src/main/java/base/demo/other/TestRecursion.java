package base.demo.other;

/**
 * @author wangzezhou
 * @create 2020-06-01 11:57 AM
 * @desc 递归的一些操作
 **/
public class TestRecursion {

    public static void main(String[] args) {
        get(0);
    }

    public static void get(int i) {
        i++;
        if(i<5)get(i);

        return;
    }
}
