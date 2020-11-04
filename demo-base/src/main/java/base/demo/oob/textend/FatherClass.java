package base.demo.oob.textend;

/**
 * @author wangzezhou
 * @create 2020-05-16 4:34 PM
 * @desc 父类
 **/

public class FatherClass {

    OtherClass otherClass = new OtherClass();

    public FatherClass() {
        this("father");
        System.out.print("Base");
    }

    public FatherClass(String name) {
        System.out.println(name);
    }


}
