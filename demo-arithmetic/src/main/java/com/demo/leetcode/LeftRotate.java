package com.demo.leetcode;

/**
 * @author wangzezhou
 * @create 2020-09-11 1:46 PM
 * @desc 剑指 Offer 58 - II. 左旋转字符串
 *
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 **/
public class LeftRotate {

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg", 2));
    }

    public static String reverseLeftWords(String s, int n) {

        if(s == null || s.length() < 1 || s.length() > 10000)
            return null;

        return s.concat(s.substring(0,n)).substring(n);
    }

}
