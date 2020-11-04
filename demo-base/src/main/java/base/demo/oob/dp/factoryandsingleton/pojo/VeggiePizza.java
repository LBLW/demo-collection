package base.demo.oob.dp.factoryandsingleton.pojo;

/**
 * @author wangzezhou
 * @create 2020-05-21 11:58 AM
 * @desc 工厂产品实体类
 **/
public class VeggiePizza extends Pizza {

    @Override
    public void proper() {

    }

    @Override
    public void cut() {
        System.out.println("Veggie Cut");
    }

    @Override
    public double cost() {
        return 0.76;
    }

    @Override
    public String description() {
        return "VeggiePizza";
    }
}
