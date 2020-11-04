package base.demo.collection.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author wangzezhou
 * @create 2020-05-20 12:08 PM
 * @desc 作为map的key
 **/

@Setter
@Getter
@ToString
@AllArgsConstructor
public class MapKey implements Comparable<MapKey> {

    private String key;

    @Override
    public int compareTo(MapKey o) {
        return key.compareTo(o.getKey());
    }
}
