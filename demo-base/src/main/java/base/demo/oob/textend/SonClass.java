package base.demo.oob.textend;

/**
 * @author wangzezhou
 * @create 2020-05-16 4:37 PM
 * @desc 子类
 **/
public class SonClass extends FatherClass {


    public SonClass() {
        super("sonClass");
        System.out.println("sonClass");
    }

    public static void main(String[] args) {

        SonClass sonClass = new SonClass();
    }

}
