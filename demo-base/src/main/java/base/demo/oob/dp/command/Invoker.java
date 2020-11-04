package base.demo.oob.dp.command;

import lombok.Setter;

/**
 * @author wangzezhou
 * @create 2020-05-23 4:38 PM
 * @desc 调用者
 **/
@Setter
public class Invoker {

    private Command command;

    public void invoke() {
        command.execute();
    }

    public void cancel() {
        command.undo();
    }
}
