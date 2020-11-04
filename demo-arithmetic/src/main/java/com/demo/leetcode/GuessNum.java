package com.demo.leetcode;

/**
 * @author wangzezhou
 * @create 2020-09-16 4:18 PM
 * @desc LCP 01. 猜数字
 *
 * 输入的guess数组为 小A 每次的猜测，answer数组为 小B 每次的选择。guess和answer的长度都等于3。
 **/
public class GuessNum {

    public static void main(String[] args) {
        int []guess = {2,2,1};
        int []answer = {1,2,3};
        System.out.println(game(guess,answer));
    }

    public static int game(int[] guess, int[] answer) {


        int result = 0;

        for(int i =0; i<guess.length; i++) {

           if(guess[i] == answer[i])
               result++;
        }

        return result;
    }
}
