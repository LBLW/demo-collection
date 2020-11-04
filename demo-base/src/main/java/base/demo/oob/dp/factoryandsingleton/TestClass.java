package base.demo.oob.dp.factoryandsingleton;

import base.demo.oob.dp.factoryandsingleton.factorymethod.CheesePizzaStore;
import base.demo.oob.dp.factoryandsingleton.factorymethod.OriginClamPizzaStore;
import base.demo.oob.dp.factoryandsingleton.factorymethod.PizzaStore;

import base.demo.oob.dp.factoryandsingleton.pojo.Pizza;


/**
 * @author wangzezhou
 * @create 2020-05-21 12:28 PM
 * @desc 工厂、单例模式测试类
 **/
public class TestClass {
//
//    private static SingletonLazy singleton_1;
//
//    private static SingletonLazy singleton_2;

    private static Singleton singleton_1;

    private static Singleton singleton_2;

    public static void main(String[] args) {

//        testSimpleFactory();
//        testFactoryMethod();
//        testAbstractFactory();

        testSingleton();
    }

    public static void testSimpleFactory() {

        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Pizza pizza = simplePizzaFactory.createPizza("Cheese");

        System.out.println(pizza.description());
    }

    public static void testFactoryMethod() {

        PizzaStore pizzaStore = new CheesePizzaStore();
        System.out.println(pizzaStore.orderPizza("Cheese"));

    }

    public static void testAbstractFactory() {
        PizzaStore pizzaStore = new OriginClamPizzaStore();
        System.out.println(pizzaStore.orderPizza("clam"));
    }

    public static void testSingleton() {

        Thread thread_1 = new Thread(()-> singleton_1 = Singleton.getThreadSafeInstance());

        Thread thread_2 = new Thread(()-> singleton_2 = Singleton.getThreadSafeInstance());

        thread_1.start();
        thread_2.start();

        System.out.println(singleton_1 == singleton_2);
    }
}
