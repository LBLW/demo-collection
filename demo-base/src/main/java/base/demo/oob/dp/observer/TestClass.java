package base.demo.oob.dp.observer;

import base.demo.oob.dp.observer.impl.*;

/**
 * @author wangzezhou
 * @create 2020-05-19 1:55 PM
 * @desc 测试类
 **/
public class TestClass {

    public static void main(String[] args) {

        javaObserver();

    }

    public static void javaObserver() {

        final BuildObserver observable = new BuildObserver();


        Thread rabbitObserverThread = new Thread(()->{

            int count = 0;

            while (count < 10) {
                count++;
                observable.addObserver(new RabbitObserver());
            }
        });

        Thread tankObserverThread =  new Thread(()->{
            int count = 0;

            while (count < 10) {
                count++;
                observable.addObserver(new TankObserver());
            }
        });

        rabbitObserverThread.start();
        tankObserverThread.start();

        try {
            Thread.currentThread().sleep(10);
            Thread.currentThread().wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(observable.countObservers());
        observable.setChanged();
        observable.notifyObservers("rabbit & tank");

    }

    public static void ownObserver() {
        ConcreteSubject subject = new ConcreteSubject();

        Observer concrete = new ConcreteObserver();
        Observer monkey = new MonkeyObserver();

        subject.registerObserver(concrete);
        subject.registerObserver(monkey);

        subject.setState_1("太阴");
        subject.setState_2("太阳");
        subject.setState_3("阴阳");

        subject.notifyObserver();

        subject.removeObserver(monkey);

        subject.setState_3("不景气");

        subject.notifyObserver();
    }
}
