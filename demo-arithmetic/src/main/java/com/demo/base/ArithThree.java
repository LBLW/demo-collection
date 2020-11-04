package com.demo.base;

import com.demo.util.ArrayUtil;

/**
 * @author wangzezhou
 * @create 2020-05-22 11:54 AM
 * @desc 快排
 **/
public class ArithThree {

    public static void main(String[] args) {
        int[] array = ArrayUtil.generateIntegerArray(10);
        ArrayUtil.displayIntegerArray(array);
        new ArithThree().sorted(array, 0, array.length-1);
        ArrayUtil.displayIntegerArray(array);

    }

    public void sorted(int[] array, int low, int high) {

        int start = low;

        int end = high;

        int key = array[low];

        System.out.println(String.format("key is %d", key));

        while(end > start) {

            while(end > start && array[end] >= key){
                end --;
            }

            if(array[end] <= key) {

                int temp = array[end];

                array[end] = array[start];
                array[start] = temp;
            }

            ArrayUtil.displayIntegerArray(array);
            while(end > start && array[start] <= key) {
                start ++;
            }

            if(array[start] >= key) {
                int temp = array[start];

                array[start] = array[end];
                array[end] = temp;
            }

            ArrayUtil.displayIntegerArray(array);
        }

        ArrayUtil.displayIntegerArray(array);
        if(start > low)
            sorted(array, low, start-1);
        if(end < high)
            sorted(array, end+1, high);
    }

    public void resorted(int[] array, int low, int high) {

        int start = low;

        int end = high;

        int key = array[low];

        while(end > start) {

            while(end > start && array[end] <= key){
                end --;
            }

            if(array[end] >= key) {

                int temp = array[end];

                array[end] = array[start];
                array[start] = temp;
            }

            while(end > start && array[start] >= key) {
                start ++;
            }

            if(array[start] <= key) {
                int temp = array[start];

                array[start] = array[end];
                array[end] = temp;
            }

        }

        if(start > low)
            resorted(array, low, start-1);
        if(end < high)
            resorted(array, end+1, high);
    }

}
