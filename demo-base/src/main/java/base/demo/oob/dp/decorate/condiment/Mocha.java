package base.demo.oob.dp.decorate.condiment;

import base.demo.oob.dp.decorate.Beverage;
import base.demo.oob.dp.decorate.Condiment;

/**
 * @author wangzezhou
 * @create 2020-05-20 5:53 PM
 * @desc 装饰者的实现类
 **/
public class Mocha extends Condiment {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
