package base.demo.oob.dp.factoryandsingleton.pojo;

import base.demo.oob.dp.factoryandsingleton.PizzaIngredientFactory;

/**
 * @author wangzezhou
 * @create 2020-05-21 1:52 PM
 * @desc 抽象工厂产品实体类
 **/
public class OriginClamPizza extends Pizza {

    private PizzaIngredientFactory factory;

    private Cheese cheese;

    private Clam clam;

    private Pepperoni pepperoni;

    public OriginClamPizza(PizzaIngredientFactory factory) {
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
        System.out.println("Clam Cut");
    }

    @Override
    public double cost() {
        return 0.72;
    }

    @Override
    public String description() {
        return "cheese Pizza";
    }
}
