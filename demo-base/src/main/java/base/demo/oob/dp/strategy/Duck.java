package base.demo.oob.dp.strategy;

import lombok.AccessLevel;
import lombok.Setter;

/**
 * @author wangzezhou
 * @create 2020-05-18 8:10 PM
 * @desc 客户端
 **/
@Setter(AccessLevel.PROTECTED)
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    abstract void display();

    void fly(){
        flyBehavior.fly();
    }

    void quack(){
        quackBehavior.quack();
    }


}
