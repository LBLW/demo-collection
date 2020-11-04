package base.demo.oob.dp.command.receiver;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * @author wangzezhou
 * @create 2020-05-23 5:03 PM
 * @desc 接收者，提供多种具体的操作
 **/
@Setter
@AllArgsConstructor
public class Light {

    private String description;

    // 具体的实现操作
    public void openLight() {

        System.out.println("天亮了，开"+description+"灯");
    }

    // 具体的实现操作
    public void  closeLight() {
        System.out.println("麻烦帮我关下"+description+"灯，我要睡觉了");
    }
}
