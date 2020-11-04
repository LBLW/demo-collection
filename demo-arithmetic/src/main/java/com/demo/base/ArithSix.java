package com.demo.base;

import com.demo.util.ArrayUtil;

/**
 * @author wangzezhou
 * @create 2020-05-28 3:52 PM
 * @desc 归并排序
 **/
public class ArithSix {

    public static void main(String[] args) {

        int[] randomArray = ArrayUtil.generateIntegerArray(5);
        ArrayUtil.displayIntegerArray(randomArray);
        mergeSorted(randomArray);
        ArrayUtil.displayIntegerArray(randomArray);

    }

    public static void mergeSorted(int[] array) {
        sort(array, 0, array.length-1);
    }

    private static void sort(int[] array, int left, int right) {

        if(left >= right) {
            return;
        }

        int center = (left + right) >> 1;

        sort(array, left, center);

        sort(array, center+1, right);

        merge(array, left, center, right);
    }

    private static void merge(int[] array, int left, int center, int right) {

        int[] tempArray = new int[array.length];

        int mid = center + 1;

        int third = left;

        int tmp = left;

        while(left <= center && mid <= right) {

            if(array[left] < array[mid]){
                tempArray[third++] = array[left++];
            } else {
                tempArray[third++] = array[mid++];
            }
        }

        while (mid <= right) {
            tempArray[third++] = array[mid++];
        }

        while (left <= center) {
            tempArray[third++] = array[left++];
        }

        while (tmp <= right) {
            array[tmp] = tempArray[tmp++];
        }
    }
}
