package base.demo.oob.dp.factoryandsingleton.pojo;

/**
 * @author wangzezhou
 * @create 2020-05-21 11:51 AM
 * @desc 工厂产品的抽象类
 **/
public abstract class Pizza {

    public abstract void proper();

    public abstract void cut();

    public abstract double cost();

    public String description(){

        return "All Pizza";
    }
}
