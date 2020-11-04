package com.demo.leetcode;

/**
 * @author wangzezhou
 * @create 2018-11-14 6:13 PM
 * @desc
 * 输入整数数组 arr ，找出其中最小的 k 个数。
 * 例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 **/
public class TwoSum {

    public static void main(String[] args) {

    }

    public static int[] getLeastNumbers(int[] arr, int target) {

        int oldNum = 0;
        int tempNum = 0;

        for(int i = 0; i < arr.length; i++) {

            tempNum = arr[i];
            if(tempNum < oldNum){
                oldNum = tempNum;
            }
        }

        return null;
    }

}
