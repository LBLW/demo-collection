package base.demo.oob;
/**
 * @author wangzezhou
 * @create 2020-05-16 4:34 PM
 * @desc 父类
 **/

public class FatherClass {
    private String fatherName = "000";
    String name1 = "aaaa";
    static int i;
    public FatherClass() {
        System.out.print("Base");
    }

    public FatherClass(String name) {
        this.name1 = name;
    }

    public static void main(String[] args) {
        SonClass sonClass =null;
        sonClass.a();
        int []a[] = new int [1][1];

        Object o = new Object(){
          public boolean equals(Object o) {
              return true;
          }
        };

        System.out.println(o.equals("a"));
        System.out.println(i);
    }

}
