package base.demo.oob.dp.factoryandsingleton.pojo;

/**
 * @author wangzezhou
 * @create 2020-05-21 12:05 PM
 * @desc 工厂产品实体类
 **/
public class PepperoniPizza extends Pizza {

    @Override
    public void proper() {

    }

    @Override
    public void cut() {
        System.out.println("Pepperoni Cut");
    }

    @Override
    public double cost() {
        return 0.97;
    }

    @Override
    public String description() {
        return "Pepperoni";
    }
}
