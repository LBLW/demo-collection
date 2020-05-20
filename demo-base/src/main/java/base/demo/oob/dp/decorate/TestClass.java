package base.demo.oob.dp.decorate;

import base.demo.oob.dp.decorate.beverage.Espresso;
import base.demo.oob.dp.decorate.condiment.Mocha;
import base.demo.oob.dp.decorate.condiment.Whip;

/**
 * @author wangzezhou
 * @create 2020-05-20 6:00 PM
 * @desc 测试类
 **/
public class TestClass {

    public static void main(String[] args) {
        Beverage beverage_1 = new Espresso();

        System.out.println(beverage_1.getDescription() + beverage_1.cost());

        Beverage beverage_2 = new Mocha(beverage_1);

        System.out.println(beverage_2.getDescription() + beverage_2.cost());

        Beverage beverage_3 = new Whip(beverage_2);

        System.out.println(beverage_3.getDescription() + beverage_3.cost());


    }
}
