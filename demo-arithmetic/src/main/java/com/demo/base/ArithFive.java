package com.demo.base;

import com.demo.util.ArrayUtil;

/**
 * @author wangzezhou
 * @create 2020-05-24 12:33 PM
 * @desc shell排序
 **/
public class ArithFive {

    public static void main(String[] args) {

        int[] array = ArrayUtil.generateIntegerArray(20);
        ArrayUtil.displayIntegerArray(array);
        new ArithFive().sorted(array);
        ArrayUtil.displayIntegerArray(array);

    }

    public void sorted(int[] a) {
        int dk = a.length / 2;

        while (dk >= 1) {
            insertSorted(a, dk);
            dk = dk / 2;
        }
    }

    private void insertSorted(int[] a, int dk) {


        for(int i=dk; i<a.length; i++) {

            if(a[i] < a[i-dk]) {

                int insertVal = a[i];

                a[i] = a[i-dk];

                int j;

                for(j=i-dk; j>=0 && insertVal < a[j]; j=j-dk) {
                    a[j+dk] = a[j];
                }

                a[j+dk] = insertVal;

            }

        }
    }
}
