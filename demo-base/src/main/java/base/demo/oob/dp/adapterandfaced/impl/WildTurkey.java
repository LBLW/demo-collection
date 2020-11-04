package base.demo.oob.dp.adapterandfaced.impl;

import base.demo.oob.dp.adapterandfaced.Turkey;

/**
 * @author wangzezhou
 * @create 2020-05-24 3:15 PM
 * @desc 火鸡实现
 **/
public class WildTurkey implements Turkey {


    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
