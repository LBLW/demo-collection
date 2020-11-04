package base.demo.oob.dp.factoryandsingleton.pojo;

import base.demo.oob.dp.factoryandsingleton.PizzaIngredientFactory;

/**
 * @author wangzezhou
 * @create 2020-05-21 1:51 PM
 * @desc 抽象工厂产品实体类
 **/
public class OriginCheesePizza extends Pizza {

    private PizzaIngredientFactory factory;

    private Cheese cheese;

    private Clam clam;

    private Pepperoni pepperoni;

    public OriginCheesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void proper() {
        cheese = factory.createCheese();
        clam = factory.createClam();
        pepperoni = factory.createPepperoni();
    }

    @Override
    public void cut() {
        System.out.println("Cheese Cut");
    }

    @Override
    public double cost() {
        return 0.85;
    }

    @Override
    public String description() {
        return "cheese Pizza";
    }
}
