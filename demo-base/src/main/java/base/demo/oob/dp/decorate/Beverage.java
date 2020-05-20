package base.demo.oob.dp.decorate;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wangzezhou
 * @create 2020-05-20 5:38 PM
 * @desc 装饰者基类
 **/
@Getter
@Setter
public abstract class Beverage {

    String description = "Unknown Beverage";

    public abstract double cost();
}
