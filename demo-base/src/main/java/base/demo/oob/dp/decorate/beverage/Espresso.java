package base.demo.oob.dp.decorate.beverage;

import base.demo.oob.dp.decorate.Beverage;

/**
 * @author wangzezhou
 * @create 2020-05-20 5:42 PM
 * @desc 基类的实现类
 **/
public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
