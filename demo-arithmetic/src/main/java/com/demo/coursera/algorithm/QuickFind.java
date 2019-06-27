package com.demo.coursera.algorithm;

/**
 * @author wangzezhou
 * @create 2018-11-26 10:38 AM
 * @desc Data structure
 **/
public class QuickFind {

    int[] id;

    public QuickFind(int j) {

        id = new int[j];
        for(int i = 0; i < j; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int a, int b) {

        return id[a] == id[b];
    }

    public void union(int a, int b) {

        int x = id[a];
        int y = id[b];

        for(int i = 0; i < id.length; i++) {

            if(id[i] == y) {
                id[i] = x;
            }
        }
    }
}
