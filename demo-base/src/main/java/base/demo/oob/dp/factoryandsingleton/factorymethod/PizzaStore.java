package base.demo.oob.dp.factoryandsingleton.factorymethod;

import base.demo.oob.dp.factoryandsingleton.pojo.Pizza;

/**
 * @author wangzezhou
 * @create 2020-05-21 12:39 PM
 * @desc 工厂方法模板类
 **/
public abstract class PizzaStore {

    public abstract Pizza createPizza(String type);

    public double orderPizza(String type){
        this.createPizza(type).proper();
        this.createPizza(type).cut();
        return this.createPizza(type).cost();
    }

}
