package com.demo.leetcode;

/**
 * @author wangzezhou
 * @create 2020-09-21 1:54 PM
 * @desc 1588. 所有奇数长度子数组的和
 *
 * 给你一个正整数数组 arr ，请你计算所有可能的奇数长度子数组的和。
 *
 * 子数组 定义为原数组中的一个连续子序列。
 *
 * 请你返回 arr 中 所有奇数长度子数组的和 。
 *
 **/
public class AddOddNum {

    public static void main(String[] args) {
        int[] nums = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(nums));
    }

    public static int sumOddLengthSubarraysError(int[] arr) {

        int result =0;
        for(int i=0; i<arr.length; i++) {

            if((i+1)%2 != 0){
                for(int j=0; j<arr.length; j++) {
                    if(j+i >= arr.length) {
                        break;
                    }

                    result += arr[j];
                }
            }
        }

        return result;
    }

    /***
     *
     * 计算每个元素最终出现多少次，元素值乘以其最终出现次数累加即可。
     *
     * 计算出现其出现在的子序列的总个数的方法：
     * 任意元素所在奇数长度连续子序列中，必然有其前后元素的个数同时为奇数个或者同时为偶数个(可为0个)，
     * 这样再加上其自身整个子序列的长度就是奇数了。因而其所在的奇数序列的个数就可以通过左右同为奇数个的组合数、左右同为偶数个的组合数计算出来
     *
     * @param arr
     * @return
     */
    public static int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int ans = 0;
        for(int i = 0; i < len; i ++){
            int leftOddCnt = (i + 1) / 2;
            int leftEvenCnt = i / 2 + 1;
            int rightOddCnt = (len - i) / 2;
            int rightEvenCnt = (len - 1 - i) / 2 + 1;
            ans += arr[i] * (leftOddCnt * rightOddCnt + leftEvenCnt * rightEvenCnt);
        }
        return ans;
    }
}
