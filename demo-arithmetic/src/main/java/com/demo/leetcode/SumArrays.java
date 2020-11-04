package com.demo.leetcode;

/**
 * @author wangzezhou
 * @create 2020-09-07 12:38 PM
 * @desc 数组的动态和
 *
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 *
 * 请返回 nums 的动态和。
 * No.1480
 **/
public class SumArrays {

    public static void main(String[] args) {

        int[] input = {1,2,3,4};
        int[] result = sumNums(input);

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + ",");
        }
    }

    static int[] sumNums(int[] nums) {

        if(nums == null || nums.length > 1000 || nums.length < 1) {
            return null;
        }

        int [] resultNums = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            if(i == 0) {
                resultNums[i] = nums[i];
                continue;
            }

            resultNums[i] = resultNums[i-1] + nums[i];
        }

        return resultNums;
    }
}
