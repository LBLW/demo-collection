package com.demo.base;

import com.demo.util.ArrayUtil;

/**
 * @author wangzezhou
 * @create 2020-05-21 11:07 AM
 * @desc 二分查找法
 **/
public class ArithTwo {

    public static void main(String[] args) {

        //二分查找之前需要先对数组进行排序
        int [] array = new ArithOne().sorted(ArrayUtil.generateIntegerArray(100));

        System.out.println(new ArithTwo().search(array, array[38]));
    }

    /**
     * 二分查找 返回数组下标
     * @param array
     * @param a
     * @return
     */
    public int search(int[] array, int a) {

        int lo = 0;

        int hi = array.length - 1;

        int mid;

        while (lo <= hi) {
            mid = (lo + hi)/2;

            if(array[mid] == a) {
                return mid;
            } else if(array[mid] < a){
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return -1;
    }
}
