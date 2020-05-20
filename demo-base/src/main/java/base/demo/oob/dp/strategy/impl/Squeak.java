package base.demo.oob.dp.strategy.impl;

import base.demo.oob.dp.strategy.QuackBehavior;

/**
 * @author wangzezhou
 * @create 2020-05-18 8:20 PM
 * @desc 吱吱叫
 **/
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("zhi zhi zhi");
    }
}
