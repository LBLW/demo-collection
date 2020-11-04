package com.demo.util;

/**
 * @author wangzezhou
 * @create 2020-05-21 11:23 AM
 * @desc 数组工具类
 **/
public class ArrayUtil {

    /**
     * 生成随机指定长度的整形数组
     * @param length
     * @return
     */
    public static int[] generateIntegerArray(int length) {

        int [] intArray = new int[length];

        for(int i=0; i<length; i++) {
            intArray[i] = Double.valueOf(Math.floor(Math.random() * 1000)).intValue();
        }

        return intArray;
    }


    public static void displayIntegerArray(int a[]){

        for (int i=0; i<a.length; i++) {

            System.out.print(a[i]);
            if(i != a.length-1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
