package base.demo.oob.dp.status;

/**
 * @author wangzezhou
 * @create 2020-06-01 12:20 PM
 * @desc 状态的实现类
 **/
public class StateA implements State {
    @Override
    public void handle() {
        System.out.println("rush A");
    }
}
