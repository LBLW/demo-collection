package base.demo.copy;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wangzezhou
 * @create 2020-05-10 10:34 AM
 * @desc 复制类b
 **/
@Getter
@Setter
public class TempCopyClassB {

    private String a;

    private String b;

    private static String c;

    private static void sayHello(String param) {

    }

    private static void sayHello(Object param) {
        
    }
}
