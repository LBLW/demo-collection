package base.demo.clazz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

/**
 * @author wangzezhou
 * @create 2019-03-14 4:18 PM
 * @desc 包含内部类的容器
 **/
public class TempClass {



    @AllArgsConstructor
    @Data
    public static class TempInnerClass {

        private String tempName;

        private Class<?> tempClassType;
    }
}
