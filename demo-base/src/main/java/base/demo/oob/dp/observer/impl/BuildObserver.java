package base.demo.oob.dp.observer.impl;

import java.util.Observable;

/**
 * @author wangzezhou
 * @create 2020-05-19 3:46 PM
 * @desc 假面骑士Builder主题
 **/
public class BuildObserver extends Observable {

    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }
}
