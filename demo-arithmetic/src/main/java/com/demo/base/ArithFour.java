package com.demo.base;

import com.demo.util.ArrayUtil;

/**
 * @author wangzezhou
 * @create 2020-05-23 10:19 AM
 * @desc 插入排序
 **/
public class ArithFour {

    public static void main(String[] args) {

        int[] array = ArrayUtil.generateIntegerArray(20);

        new ArithFour().sorted(array);

        ArrayUtil.displayIntegerArray(array);

    }

    public void sorted(int[] array ) {

        for(int i=1; i<array.length; i++) {

            int insertVal = array[i];

            int index = i-1;

            while(index>=0 && insertVal < array[index]) {

                array[index+1] = array[index];

                index--;
            }

            array[index+1] = insertVal;
        }
    }
}
