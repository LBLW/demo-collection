package com.demo.mathematic.iterator;

/**
 * @author wangzezhou
 * @create 2018-12-24 11:39 AM
 * @desc 不用自带函数求平方根
 **/
public class SquareRoot {

    public static double getSquareRoot(int n, double deltaThreshold, int maxTry) {

        if(n <= 1) {
            return -1.0;
        }

        double min = 1;
        double max = n;

        for(int i=0; i<maxTry; i++) {
            double middle = (min + max) / 2;
            double square = middle * middle;

            double delta = Math.abs((square / n) - 1);

            if(delta <= deltaThreshold) {
                return middle;
            } else {
                if(square > n) {
                    max = middle;
                } else {
                    min = middle;
                }
            }
        }

        return -2.0;
    }

    public static void main(String[] args) {

        int number = 4;

        double squareRoot = getSquareRoot(number, 0.000001, 10000);

        System.out.println(String.format("%d 的平方根是 %f",number, squareRoot));
    }

}
