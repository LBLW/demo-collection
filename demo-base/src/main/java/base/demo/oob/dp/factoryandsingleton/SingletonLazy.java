package base.demo.oob.dp.factoryandsingleton;

/**
 * @author wangzezhou
 * @create 2020-05-22 9:18 PM
 * @desc 懒加载的单例模式
 **/
public class SingletonLazy {

    private static SingletonLazy singletonLazy;

    public static SingletonLazy getInstance() {

        if(singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }

        return singletonLazy;
    }
}
