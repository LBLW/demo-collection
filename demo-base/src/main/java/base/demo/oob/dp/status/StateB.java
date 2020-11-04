package base.demo.oob.dp.status;

/**
 * @author wangzezhou
 * @create 2020-06-01 12:24 PM
 * @desc 状态的实现类
 **/
public class StateB implements State {
    @Override
    public void handle() {
        System.out.println("rush b");
    }
}
