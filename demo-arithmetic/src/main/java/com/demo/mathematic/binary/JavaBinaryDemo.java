package com.demo.mathematic.binary;

/**
 * @author wangzezhou
 * @create 2018-12-17 5:42 PM
 * @desc java 二进制
 **/
public class JavaBinaryDemo {

    private static int leftShift(int num, int n) {
        return num << n;
    }

    /**
     * 逻辑右移
     * @param num
     * @param n
     * @return
     */
    private static int logicRightShift(int num, int n) {
        return num >>> n;
    }

    /**
     * 算术右移
     * @param num
     * @param n
     * @return
     */
    private static int calculateRightShift(int num, int n) {
        return num >> n;
    }

    private static int or (int a, int b) {
        return a | b;
    }

    private static int and(int a, int b) {
        return a & b;
    }

    private static int xor(int a, int b) {
        return a ^ b;
    }


    public static void main(String[] args) {
        System.out.println(leftShift(53,1));
        System.out.println(logicRightShift(-53,1));
        System.out.println(calculateRightShift(-53,1));
        System.out.println(or(53,0));
        System.out.println(xor(5,1));
        System.out.println(and(2,1));
    }
}
