package base.demo.oob.dp.observer.impl;

import base.demo.oob.dp.observer.Observer;
import base.demo.oob.dp.observer.Subject;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzezhou
 * @create 2020-05-19 1:52 PM
 * @desc 主题的具体实现
 **/
@Setter
public class ConcreteSubject implements Subject {

    final static List<Observer> OBSERVER_LIST = new ArrayList<>();

    private String state_1;
    private String state_2;
    private String state_3;

    public ConcreteSubject() {

        if(!OBSERVER_LIST.isEmpty()) {
            OBSERVER_LIST.clear();
        }

    }

    @Override
    public boolean registerObserver(Observer observer) {
        OBSERVER_LIST.add(observer);
        return true;
    }

    @Override
    public boolean removeObserver(Observer observer) {
        OBSERVER_LIST.remove(observer);
        return false;
    }

    @Override
    public void notifyObserver() {
        if(!OBSERVER_LIST.isEmpty()) {
            for(Observer observer : OBSERVER_LIST){
                observer.update(state_1, state_2, state_3);
            }
        }
    }
}
