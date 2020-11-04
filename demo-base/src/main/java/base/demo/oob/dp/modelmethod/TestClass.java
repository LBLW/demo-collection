package base.demo.oob.dp.modelmethod;

/**
 * @author wangzezhou
 * @create 2020-05-29 11:42 AM
 * @desc 模板方法模式测试类
 **/
public class TestClass {

    public static void main(String[] args) {
        Model model = new ModelImplement();

        model.templateMethod(10);
    }
}
