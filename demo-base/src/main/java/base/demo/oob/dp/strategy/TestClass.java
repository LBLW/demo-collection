package base.demo.oob.dp.strategy;

/**
 * @author wangzezhou
 * @create 2020-05-18 8:22 PM
 * @desc 策略模式测试类
 **/
public class TestClass {

    public static void main(String[] args) {
        Duck redHeadDuck = new RedHeadDuck();

        redHeadDuck.display();
        redHeadDuck.fly();
        redHeadDuck.quack();

        Duck rubberDuck = new RubberDuck();

        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.fly();


    }
}
