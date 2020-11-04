package com.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzezhou
 * @create 2020-09-08 1:19 PM
 * @desc 1431. 拥有最多糖果的孩子
 *
 * 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
 *
 * 对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目。
 *
 **/
public class Candies {

    public static void main(String[] args) {

        int[] candies = {12,1,12};
        int extraCandies = 10;

        List<Boolean> result = kidsWithCandies(candies,extraCandies);

        for(boolean re : result){
            System.out.print(re + ",");
        }
    }

    public static List<Boolean> compareCandies(int[] candies, int extraCandies) {

        if(candies == null || candies.length <2 || candies.length > 100 ) {
            return null;
        }

        if(extraCandies < 1 || extraCandies > 50) {
            return null;
        }

        List<Boolean> result = new ArrayList<>();
        int mark = 0;

        for(int i=0; i<candies.length; i++) {


            int maxCandy = candies[i] + extraCandies;

            for(int j=0; j<candies.length; j++) {

                if(maxCandy < candies[j]) {
                    mark=1;
                    result.add(false);
                    break;
                }
            }

            if(mark == 0) {
                result.add(true);
            }

            mark = 0;
        }

        return result;
    }

    /**
     * 优秀解法
     * @param candies
     * @param extraCandies
     * @return
     */
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 1;
        for (int candy : candies) max = Math.max(max, candy);
        List<Boolean> list = new ArrayList<>();
        for (int candy : candies) list.add(candy+extraCandies>=max);
        return list;
    }

}
