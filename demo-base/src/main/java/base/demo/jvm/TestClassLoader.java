package base.demo.jvm;

/**
 * @author wangzezhou
 * @create 2020-05-02 7:33 PM
 * @desc 测试类的加载
 **/
public class TestClassLoader extends ClassLoader {

    // checkBoolean_1加载的准备阶段被初始化成null
    static CheckBoolean checkBoolean_1;


    static CheckBoolean checkBoolean_2 = new CheckBoolean();

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("base.demo.jvm.CheckBoolean");
    }

}
