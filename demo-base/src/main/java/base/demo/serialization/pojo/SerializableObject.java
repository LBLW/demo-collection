package base.demo.serialization.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author wangzezhou
 * @create 2020-05-07 2:32 PM
 * @desc 序列化对象
 **/
@Getter
@Setter
public class SerializableObject implements Serializable {



    private int property_1;

    private String property_2;

    private transient String t_property;

    public static String staticProperty;



}
