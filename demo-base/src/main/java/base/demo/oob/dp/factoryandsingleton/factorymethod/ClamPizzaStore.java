package base.demo.oob.dp.factoryandsingleton.factorymethod;

import base.demo.oob.dp.factoryandsingleton.pojo.ClamPizza;
import base.demo.oob.dp.factoryandsingleton.pojo.Pizza;

/**
 * @author wangzezhou
 * @create 2020-05-21 12:45 PM
 * @desc 工厂方法实现类
 **/
public class ClamPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return new ClamPizza();
    }

}
