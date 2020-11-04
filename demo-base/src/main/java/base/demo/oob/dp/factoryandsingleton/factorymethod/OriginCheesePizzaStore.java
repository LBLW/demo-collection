package base.demo.oob.dp.factoryandsingleton.factorymethod;

import base.demo.oob.dp.factoryandsingleton.impl.CheesePizzaIngredientFactory;
import base.demo.oob.dp.factoryandsingleton.pojo.OriginCheesePizza;
import base.demo.oob.dp.factoryandsingleton.pojo.Pizza;

/**
 * @author wangzezhou
 * @create 2020-05-21 2:11 PM
 * @desc 工厂方法引入抽象工厂
 **/
public class OriginCheesePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return new OriginCheesePizza(new CheesePizzaIngredientFactory());
    }
}
