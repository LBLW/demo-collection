package base.demo.oob.dp.decorate.beverage;

import base.demo.oob.dp.decorate.Beverage;

/**
 * @author wangzezhou
 * @create 2020-05-20 5:50 PM
 * @desc 基类的实现类
 **/
public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("House Blend Coffee");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
