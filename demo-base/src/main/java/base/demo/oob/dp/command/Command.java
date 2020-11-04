package base.demo.oob.dp.command;

/**
 * @author wangzezhou
 * @create 2020-05-23 4:36 PM
 * @desc 命令接口
 **/
public interface Command {

    void execute();

    void undo();
}
