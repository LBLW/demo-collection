package base.demo.oob.dp.iteratorcomponent;

/**
 * @author wangzezhou
 * @create 2020-06-01 11:29 AM
 * @desc 组合模式测试类
 **/
public class TestClass {

    public static void main(String[] args) {
        testComponent();
    }

    public static void testComponent() {

        Component Menu_1 = new Menu("Menu_1","菜单1");
        Component Menu_2 = new Menu("Menu_2","菜单2");
        Component Menu_3 = new Menu("Menu_3","菜单3");
        Component Menu_4 = new Menu("Menu_4","菜单4");
        Component Menu_5 = new Menu("Menu_5","菜单5");
        Component Menu_6 = new Menu("Menu_6","菜单6");
        Component Menu_7 = new Menu("Menu_7","菜单7");

        Component allMenu = new Menu("All Menu", "全部菜单");

        allMenu.add(Menu_1);
        allMenu.add(Menu_2);
        allMenu.add(Menu_3);
        allMenu.add(Menu_4);
        allMenu.add(Menu_5);
        allMenu.add(Menu_6);
        allMenu.add(Menu_7);

        Menu_2.add(new Menu("subMenu_1","子菜单1"));
        Menu_2.add(new Menu("subMenu_2","子菜单2"));
        Menu_2.add(new Menu("subMenu_3","子菜单3"));
        Menu_2.add(new Menu("subMenu_4","子菜单4"));
        Menu_2.add(new Menu("subMenu_5","子菜单5"));

        Waitress waitress = new Waitress(allMenu);

        waitress.printMenu();
    }
}
