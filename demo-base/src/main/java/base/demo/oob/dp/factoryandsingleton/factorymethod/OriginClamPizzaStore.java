package base.demo.oob.dp.factoryandsingleton.factorymethod;

import base.demo.oob.dp.factoryandsingleton.impl.ClamPizzaIngredientFactory;
import base.demo.oob.dp.factoryandsingleton.pojo.OriginClamPizza;
import base.demo.oob.dp.factoryandsingleton.pojo.Pizza;

/**
 * @author wangzezhou
 * @create 2020-05-21 2:12 PM
 * @desc 工厂方法引入抽象工厂
 **/
public class OriginClamPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return new OriginClamPizza(new ClamPizzaIngredientFactory());
    }
}
