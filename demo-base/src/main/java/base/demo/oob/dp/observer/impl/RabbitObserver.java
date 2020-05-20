package base.demo.oob.dp.observer.impl;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wangzezhou
 * @create 2020-05-19 3:17 PM
 * @desc 观察者Rabbit
 **/
public class RabbitObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(String.format("%s Rabbit Now is %s form", this,arg));
    }
}
