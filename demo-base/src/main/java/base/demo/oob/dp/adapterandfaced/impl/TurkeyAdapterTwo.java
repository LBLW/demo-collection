package base.demo.oob.dp.adapterandfaced.impl;

import base.demo.oob.dp.adapterandfaced.Duck;

/**
 * @author wangzezhou
 * @create 2020-05-24 3:23 PM
 * @desc 火鸡鸭子类适配器
 **/
public class TurkeyAdapterTwo extends WildTurkey implements Duck {


    @Override
    public void quack() {
        super.gobble();
    }

//    @Override
    public void fly() {
        super.fly();
    }
}
