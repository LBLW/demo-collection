package base.demo.reflection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangzezhou
 * @create 2018-11-07 9:45 AM
 * @desc 测试反射获取值
 **/
public class TestBean {

    Map<String,Object> field = new HashMap<>();

    public int getInt(String name) {
        return getField(name,Integer.class);
    }


    public <T> T getField(String name, Class<T> valueType) {
        Object obj = this.field.get(name);

        if(obj != null) {
            return (T) obj;
        }

        return null;
    }
}
