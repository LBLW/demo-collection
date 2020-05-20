package base.demo.oob.dp.strategy.impl;

import base.demo.oob.dp.strategy.QuackBehavior;

/**
 * @author wangzezhou
 * @create 2020-05-18 8:17 PM
 * @desc 叫
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("ga ga ga");
    }
}
