package com.demo.leetcode;

/**
 * @author wangzezhou
 * @create 2020-09-14 3:53 PM
 * @desc 1486. 数组异或操作
 *
 * 给你两个整数，n 和 start 。
 *
 * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
 *
 * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
 *
 **/
public class NumXor {

    public static void main(String[] args) {
        System.out.println(xorOperation(1, 7));
    }

    public static int xorOperation(int n, int start) {

        int result = 0;
        for(int i=0; i < n; i++) {
            result ^= (start + 2*i);
        }

        return result;
    }
}
