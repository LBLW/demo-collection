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

//        System.out.println(i);
//        // i++先赋值 再计算
//        System.out.println(i++);
//        System.out.println(i);
//
//        System.out.println(testLoop());

        char[] s = "1314520".toCharArray();
        int v1=0, v2=0, v3=0, v4=0;
        for(int j=0; j < s.length; j++) {
            switch (s[j]) {
                default: v4++;
                case '1': v1++;
            case '2': v2++;
            case '3': v3++;
            }
        }
        System.out.println(String.format("%d, %d, %d, %d", v4, v1, v2, v3));
    }

    public static boolean testLoop() {
        try{
            return true;
        } finally {
            return false;
        }
    }
}
