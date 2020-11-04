package base.demo.oob.dp.factoryandsingleton;

/**
 * @author wangzezhou
 * @create 2020-05-22 8:58 PM
 * @desc 单例模式
 **/
public class Singleton {

    //饿汉模式
//    private static Singleton singleton = new Singleton();
    //线程间可见
    private volatile static Singleton singleton;

    public static Singleton getThreadSafeInstance() {

        // 线程安全的单例模式
        if(singleton == null) {
            synchronized (Singleton.class) {
                if(singleton == null) {
                    return new Singleton();
                }
            }
        }

        return singleton;
    }

}
