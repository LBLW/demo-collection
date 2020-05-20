package base.demo.oob.dp.strategy.impl;

import base.demo.oob.dp.strategy.QuackBehavior;

/**
 * @author wangzezhou
 * @create 2020-05-18 8:21 PM
 * @desc 静音
 **/
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("..............");
    }
}
