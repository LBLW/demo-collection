package base.demo.oob.dp.observer.impl;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wangzezhou
 * @create 2020-05-19 3:18 PM
 * @desc 观察者tank
 **/
public class TankObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(String.format("%s Tank Now is %s form!", this, arg));
    }
}
