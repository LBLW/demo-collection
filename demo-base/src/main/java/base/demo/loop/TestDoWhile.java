package base.demo.loop;

/**
 * @author wangzezhou
 * @create 2020-05-03 3:27 PM
 * @desc 测试下doWhile循环
 **/
public class TestDoWhile {

    public static void main(String[] args) {
        int i = 7;

//        do{
        // --i 先计算 再赋值
//            System.out.println(--i);
//            --i;
//        }while (i != 0);

        System.out.println(i);
        // i++先赋值 再计算
        System.out.println(i++);
        System.out.println(i);

        System.out.println(testLoop());
    }

    public static boolean testLoop() {
        try{
            return true;
        } finally {
            return false;
        }
    }
}
