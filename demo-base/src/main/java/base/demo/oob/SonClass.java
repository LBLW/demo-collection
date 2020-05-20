package base.demo.oob;

/**
 * @author wangzezhou
 * @create 2020-05-16 4:37 PM
 * @desc 子类
 **/
public class SonClass extends FatherClass {

    String a;

    private String name = "abc";


    public SonClass(String a) {
        this.a = a;
    }

    public static void main(String[] args) {
        SonClass sonClass = new SonClass("1111");
        System.out.println(sonClass.a);

        System.out.println((short) 10/10.2*2);

//        new FatherClass();
//
//        SonClass s1 = new SonClass();
//        SonClass s2 = new SonClass();

//        System.out.println(s1.name == s2.name);
//        System.out.println(s1.name.equals(s2.name));
//        System.out.println(s1.equals(s2));
    }

    public static void a() {
        System.out.println("a method");
    }
}
