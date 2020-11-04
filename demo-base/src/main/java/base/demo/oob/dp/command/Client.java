package base.demo.oob.dp.command;

import base.demo.oob.dp.command.impl.LightCommand;
import base.demo.oob.dp.command.receiver.Light;

/**
 * @author wangzezhou
 * @create 2020-05-23 5:13 PM
 * @desc 命令模式 测试类
 **/
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
//        invoker.setCommand(new LightCommand()); client 不必自己持有 receiver 对象
        invoker.setCommand(new LightCommand(new Light("小熊baby")));
        invoker.invoke();
        invoker.cancel();
    }
}
