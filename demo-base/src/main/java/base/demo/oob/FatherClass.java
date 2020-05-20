package base.demo.oob;
/**
 * @author wangzezhou
 * @create 2020-05-16 4:34 PM
 * @desc 父类
 **/

public class FatherClass {

    String name1 = "aaaa";
    public FatherClass() {
        System.out.print("Base");
    }

    public FatherClass(String name) {
        this.name1 = name;
    }

    public static void main(String[] args) {
        SonClass sonClass =null;
        sonClass.a();
    }

}
