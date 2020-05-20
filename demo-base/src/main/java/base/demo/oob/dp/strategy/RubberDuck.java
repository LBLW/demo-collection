package base.demo.oob.dp.strategy;

import base.demo.oob.dp.strategy.impl.FlyNoWay;
import base.demo.oob.dp.strategy.impl.Squeak;

/**
 * @author wangzezhou
 * @create 2020-05-18 8:28 PM
 * @desc 橡皮鸭
 **/
public class RubberDuck extends Duck{

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    void display() {
        System.out.println("This is rubber duck");
    }
}
