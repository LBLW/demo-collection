package base.demo.oob.dp.observer.impl;

import base.demo.oob.dp.observer.Observer;

/**
 * @author wangzezhou
 * @create 2020-05-19 1:52 PM
 * @desc 观察者的具体实现_1
 **/
public class ConcreteObserver implements Observer {

    @Override
    public void update(String stats_1, String stats_2, String stats_3) {
        System.out.println(String.format("%s,%s,%s,%s",this,stats_1,stats_2,stats_3));
    }
}
