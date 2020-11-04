package base.demo.oob.dp.factoryandsingleton.factorymethod;

import base.demo.oob.dp.factoryandsingleton.pojo.PepperoniPizza;
import base.demo.oob.dp.factoryandsingleton.pojo.Pizza;

/**
 * @author wangzezhou
 * @create 2020-05-21 12:46 PM
 * @desc 工厂方法实现类
 **/
public class PepperoniPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return new PepperoniPizza();
    }
}
