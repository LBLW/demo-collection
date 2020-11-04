package base.demo.oob.dp.adapterandfaced;

import base.demo.oob.dp.adapterandfaced.impl.TurkeyAdapter;
import base.demo.oob.dp.adapterandfaced.impl.TurkeyAdapterTwo;
import base.demo.oob.dp.adapterandfaced.impl.WildTurkey;

/**
 * @author wangzezhou
 * @create 2020-05-24 3:20 PM
 * @desc 适配器模式与外观模式测试类
 **/
public class TestClass {

    public static void main(String[] args) {
        testAdapter();
    }

    public static void testAdapter() {
        //对象适配器
        Duck duck = new TurkeyAdapter(new WildTurkey());
        duck.quack();
        duck.fly();

        //类适配器
        Duck duck_2 = new TurkeyAdapterTwo();
        duck_2.quack();
        duck_2.fly();
    }
}
