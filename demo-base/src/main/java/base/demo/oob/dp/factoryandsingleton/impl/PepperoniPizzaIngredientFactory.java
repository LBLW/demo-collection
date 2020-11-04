package base.demo.oob.dp.factoryandsingleton.impl;

import base.demo.oob.dp.factoryandsingleton.PizzaIngredientFactory;
import base.demo.oob.dp.factoryandsingleton.pojo.Cheese;
import base.demo.oob.dp.factoryandsingleton.pojo.Clam;
import base.demo.oob.dp.factoryandsingleton.pojo.Pepperoni;

/**
 * @author wangzezhou
 * @create 2020-05-21 1:48 PM
 * @desc 抽象工厂具体实现
 **/
public class PepperoniPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Clam createClam() {
        return null;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }
}
