package base.demo.oob.dp.iteratorcomponent;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wangzezhou
 * @create 2020-06-01 11:20 AM
 * @desc 组合的实现类
 **/

public class Menu extends Component {

    List<Component> list = new ArrayList<>();
    String name;
    String desc;

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void print() {
        System.out.print("\n" + name);
        System.out.println(", " + desc);
        System.out.println("-------------------------------");
        Iterator<Component> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }


}
