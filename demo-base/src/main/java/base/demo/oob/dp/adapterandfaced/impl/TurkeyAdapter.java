package base.demo.oob.dp.adapterandfaced.impl;

import base.demo.oob.dp.adapterandfaced.Duck;
import base.demo.oob.dp.adapterandfaced.Turkey;
import lombok.AllArgsConstructor;

/**
 * @author wangzezhou
 * @create 2020-05-24 3:15 PM
 * @desc 火鸡鸭子对象适配器
 **/
@AllArgsConstructor
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
