package com.demo.base;

import com.demo.util.ArrayUtil;

/**
 * @author wangzezhou
 * @create 2020-05-20 6:45 PM
 * @desc 冒泡排序
 **/
public class ArithOne {

    public static void main(String[] args) {
        ArithOne arithOne = new ArithOne();
        System.out.println(System.currentTimeMillis());
        ArrayUtil.displayIntegerArray(arithOne.sorted_2(ArrayUtil.generateIntegerArray(100)));
        System.out.println(System.currentTimeMillis());
    }


    //正序
    public int[] sorted(int a[]) {

        for(int i=0; i<a.length; i++) {
            for(int j=1; j<a.length-i; j++) {

                if(a[j-1] > a[j]){
                    int temp = a[j];

                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }

        return a;
    }

    //倒叙
    public int[] sorted_2(int a[]) {

        for(int i=0; i<a.length; i++) {
            for(int j=1; j<a.length-i; j++) {

                if(a[j-1] < a[j]){
                    int temp = a[j];

                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }

        return a;
    }

}
