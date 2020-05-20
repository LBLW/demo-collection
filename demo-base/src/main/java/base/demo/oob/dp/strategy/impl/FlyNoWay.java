package base.demo.oob.dp.strategy.impl;

import base.demo.oob.dp.strategy.FlyBehavior;

/**
 * @author wangzezhou
 * @create 2020-05-18 8:17 PM
 * @desc 不能飞
 **/
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't Fly!");
    }
}
