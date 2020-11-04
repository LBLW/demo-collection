package base.demo.oob.dp.factoryandsingleton.pojo;

/**
 * @author wangzezhou
 * @create 2020-05-21 11:55 AM
 * @desc 工厂产品实体类
 **/
public class CheesePizza extends Pizza {



    @Override
    public void proper() {

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
    public String description(){
        return "Cheese";
    }
}
