package com.demo.leetcode;

/**
 * @author wangzezhou
 * @create 2020-09-10 12:44 PM
 * @desc 1470. 重新排列数组
 *
 * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 *
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 *
 **/
public class ListArray {

    public static void main(String[] args) {


        int nums[] = {1,1,2,2};
        int n = 2;

        for(int i : goodShuffle(nums,n)) {
            System.out.print(i+",");
        }
    }

    public static int[] shuffle(int[] nums, int n) {

        if(nums.length != 2 * n || n < 1 | n > 500) {
            return null;
        }

        int result[] = new int[nums.length];
        int count = 0;

        for(int i=0; i<nums.length; i++) {

            if(i < n) {
                result[i*2] = nums[i];
            } else if(i<nums.length-1) {

                result[i - (n - ++count)] = nums[i];
            } else {
                result[i] = nums[i];
            }
        }


        return result;
    }

    /**
     * 看看人家，
     * 循环减一半还不用声明多余的变量
     * @param nums
     * @param n
     * @return
     */
    public static int[] goodShuffle(int[] nums, int n) {
        int [] ret = new int[2*n];
        for(int i=0;i<n;i++){
            ret[i*2]=nums[i];
            ret[i*2+1]= nums[n+i];
        }
        return ret;

    }

}
