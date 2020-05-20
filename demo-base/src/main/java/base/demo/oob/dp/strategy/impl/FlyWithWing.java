package base.demo.oob.dp.strategy.impl;

import base.demo.oob.dp.strategy.FlyBehavior;

/**
 * @author wangzezhou
 * @create 2020-05-18 8:16 PM
 * @desc 乘风飞行
 **/
public class FlyWithWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("this duck fly with wing!");
    }
}
