package base.demo.oob.dp.factoryandsingleton.factorymethod;

import base.demo.oob.dp.factoryandsingleton.impl.PepperoniPizzaIngredientFactory;
import base.demo.oob.dp.factoryandsingleton.pojo.OriginPepperoniPizza;
import base.demo.oob.dp.factoryandsingleton.pojo.Pizza;

/**
 * @author wangzezhou
 * @create 2020-05-21 2:13 PM
 * @desc 工厂方法引入抽象工厂
 **/
public class OriginPepperoniPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return new OriginPepperoniPizza(new PepperoniPizzaIngredientFactory());
    }
}
