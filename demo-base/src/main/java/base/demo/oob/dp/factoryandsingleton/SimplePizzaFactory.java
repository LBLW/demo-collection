package base.demo.oob.dp.factoryandsingleton;

import base.demo.oob.dp.factoryandsingleton.pojo.CheesePizza;
import base.demo.oob.dp.factoryandsingleton.pojo.ClamPizza;
import base.demo.oob.dp.factoryandsingleton.pojo.Pizza;

/**
 * @author wangzezhou
 * @create 2020-05-21 12:26 PM
 * @desc 简单工厂
 **/
public class SimplePizzaFactory {


    public Pizza createPizza(String type) {

        switch (type) {
            case "Cheese" : return new CheesePizza();
            case "Clam" : return new ClamPizza();
            case "Pepperoni" : return new ClamPizza();
            default: return null;
        }
    }
}
