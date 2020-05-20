package base.demo.oob.dp.strategy;

import base.demo.oob.dp.strategy.impl.FlyWithWing;
import base.demo.oob.dp.strategy.impl.Quack;

/**
 * @author wangzezhou
 * @create 2020-05-18 8:23 PM
 * @desc 红头鸭
 **/
public class RedHeadDuck extends Duck {

    @Override
    void display() {
        System.out.println("this is red head duck");
    }

    public RedHeadDuck() {
        setFlyBehavior(new FlyWithWing());
        setQuackBehavior(new Quack());
    }
}
