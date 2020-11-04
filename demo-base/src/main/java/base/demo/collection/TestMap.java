package base.demo.collection;

import base.demo.collection.pojo.MapKey;

import java.util.*;

/**
 * @author wangzezhou
 * @create 2020-05-20 10:32 AM
 * @desc Map源码阅读
 **/
public class TestMap {

    public static void main(String[] args) {

//        testTreeMap();
//        testHashMap();

        testLinkedHashMap();
    }

    public static void testTreeMap() {

        Map<MapKey,String> treeMap = new TreeMap<>();

        for(int i=0; i<3; i++){

            String oldValue = treeMap.put(new MapKey(generateRandomStr()), generateRandomStr());
            System.out.println(oldValue);
        }

        System.out.println(treeMap);

        Set<MapKey> keySet = treeMap.keySet();
        System.out.println(keySet);
    }

    public static void testLinkedHashMap() {

        Map<MapKey, String> linkedHashMap = new LinkedHashMap<>();

        insertData(linkedHashMap);

    }

    public static void testHashMap() {

        Map<MapKey,String> hashMap = new HashMap<>();

        insertData(hashMap);

        System.out.println(hashMap.size());
        System.out.println(6 >> 1);
        System.out.println(13 % 31);
        System.out.println(31 & 13);
        System.out.println(tableSizeFor(58));
        Set<Map.Entry<MapKey,String>> keys = hashMap.entrySet();
        for(Map.Entry entry : keys) {
            System.out.println(entry);
        }


//        System.out.println(1<<30);
//        System.out.println(1<<4);
//
//        int h;
//        System.out.println((h = new MapKey("String").hashCode())^(h >>> 16));
//        System.out.println(new MapKey("String").hashCode());


    }

    static final void insertData(Map<MapKey,String> map) {

        map.put(new MapKey("插入第一个元素"), "25");
        map.put(new MapKey("插入第二个元素"), "37");
        map.put(new MapKey("插入第三个元素"), "25");
        map.put(new MapKey("插入第四个元素"), "37");
        map.put(new MapKey("插入第五个元素"), "25");
        map.put(new MapKey("插入第六个元素"), "37");
        map.put(new MapKey("插入第七个元素"), "25");
        map.put(new MapKey("插入第八个元素"), "37");
    }

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= 1 << 30) ? 1 << 30 : n + 1;
    }

    private static String generateRandomStr() {

        return String.valueOf(Math.floor(Math.random() * 10000));
    }
}
