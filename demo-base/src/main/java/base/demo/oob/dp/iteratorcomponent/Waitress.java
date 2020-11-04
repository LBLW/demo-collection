package base.demo.oob.dp.iteratorcomponent;

/**
 * @author wangzezhou
 * @create 2020-06-01 11:27 AM
 * @desc 客户端
 **/
public class Waitress {

    Component component;

    public Waitress(Component component) {
        this.component = component;
    }

    public void printMenu() {
        component.print();
    }
}
