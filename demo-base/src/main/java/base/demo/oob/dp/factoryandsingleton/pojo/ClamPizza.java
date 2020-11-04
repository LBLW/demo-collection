package base.demo.oob.dp.factoryandsingleton.pojo;

/**
 * @author wangzezhou
 * @create 2020-05-21 12:03 PM
 * @desc 工厂产品实体类
 **/
public class ClamPizza extends Pizza{

    @Override
    public void proper() {

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
        return "Clam";
    }
}
