package base.demo.oob.dp.status;

/**
 * @author wangzezhou
 * @create 2020-06-01 12:31 PM
 * @desc 状态模式测试类
 **/
public class TestClass {

    public static void main(String[] args) {
        testState();
    }

    public static void testState() {

        ManMember member = new ManMember(new StateA(),new StateB());

        member.request("B");
    }
}
