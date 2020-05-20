package base.demo.oob.dp.decorate.condiment;

import base.demo.oob.dp.decorate.Beverage;
import base.demo.oob.dp.decorate.Condiment;

/**
 * @author wangzezhou
 * @create 2020-05-20 5:55 PM
 * @desc 装饰者的实现类
 **/
public class Whip extends Condiment {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", whip";
    }

    @Override
    public double cost() {
        return 0.78 + beverage.cost();
    }
}
