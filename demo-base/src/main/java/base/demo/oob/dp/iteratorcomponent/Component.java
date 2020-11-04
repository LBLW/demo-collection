package base.demo.oob.dp.iteratorcomponent;


/**
 * @author wangzezhou
 * @create 2020-06-01 11:15 AM
 * @desc 组合的基类
 **/
public abstract class Component {

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void print();
}
