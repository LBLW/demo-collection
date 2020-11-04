package com.demo.leetcode;


/**
 * @author wangzezhou
 * @create 2020-04-28 4:23 PM
 * @desc 题库20. 有效的括号
 **/
public class Symboi {

    public static void main(String[] args) {

        System.out.println(isValid("([]{})"));
    }

    public static boolean isValid(String s) {

        while(s.contains("{}") || s.contains("[]") || s.contains("()")) {
            s = s.replace("{}","");
            s = s.replace("[]", "");
            s = s.replace("()", "");
        }

        return s.equals("");
    }


}
