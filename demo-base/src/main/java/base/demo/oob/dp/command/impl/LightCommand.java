package base.demo.oob.dp.command.impl;

import base.demo.oob.dp.command.Command;
import base.demo.oob.dp.command.receiver.Light;

/**
 * @author wangzezhou
 * @create 2020-05-23 5:06 PM
 * @desc 命令的具体实现
 **/
public class LightCommand implements Command {

    private Light light;

    public LightCommand() {
        //command 持有 receiver 对象
        this.light = new Light("远光灯");
    }

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.openLight();
    }

    @Override
    public void undo() {
        light.closeLight();
    }
}
