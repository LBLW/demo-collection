package com.demo.leetcode;

/**
 * @author wangzezhou
 * @create 2020-09-09 1:03 PM
 * @desc 1512. 好数对的数目
 *
 * 给你一个整数数组 nums 。
 *
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 *
 * 返回好数对的数目。
 *
 *
 **/
public class GoodNums {

    public static void main(String[] args) {

        int nums[] = {1,2,3};

        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {

        if(nums == null || nums.length < 1 || nums.length > 100) {
            return 0;
        }

        int goodNum = 0;
        for(int i=0; i<nums.length; i++) {

            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    goodNum++;
                }
            }
        }

        return goodNum;
    }

    /**
     * 好思路 神代码
     * 意思是将数组内容绑定为数组下标，
     * 若遇到一样的下标则新数组中的内容自加
     * @param nums
     * @return
     */
    public int goodNumIdenticalPairs(int[] nums) {
        int ans = 0;
        //因为 1<= nums[i] <= 100  所以申请大小为100的数组
        //temp用来记录num的个数
        int[] temp = new int[100];
        /*
        从前面开始遍历nums
        假设nums = [1,1,1,1]
        第一遍
        temp是[0,0,0,0]
        ans+=0;
        temp[0]++;
        第二遍
        temp是[1,0,0,0]
        ans+=1;
        temp[0]++;
        第三遍
        temp=[2,0,0,0]
        ans+=2;
        temp[0]++;
        第四遍
        temp=[3,0,0,0]
        ans+=3;
        temp[0]++;
        */
        for (int num : nums) {
            /*
            这行代码可以写成
            ans+=temp[num - 1];
            temp[num - 1]++;
            */
            ans += temp[num - 1]++;
        }
        return ans;
    }
}
