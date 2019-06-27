package com.demo.coursera.algorithm;

/**
 * @author wangzezhou
 * @create 2018-11-26 2:01 PM
 * @desc Data structure quick union
 *
 *
 **/
public class QuickUnion {

    int[] id;
    int[] size;
    int count;

    public QuickUnion(int N) {

        id = new int[N];
        size = new int[N];

        for(int i=0; i<N; i++) {
            id[i] = i;
            size[i] = 1;
        }

        count = N;
    }

    /**
     * 回溯查找根节点
     *
     * @param i
     * @return
     */
    private int root(int i) {

        while(i != id[i]) {
            i = id[i];
        }

        return i;
    }

    /**
     * 在回溯查找时展平树
     *
     * 将 当前节点的父节点 上移
     *
     * @param i
     * @return
     */

    private int rootImprovement(int i) {

        while(i != id[i]) {

            id[i] = id[id[i]];
            i = id[i];
        }

        return i;
    }

    public boolean connected(int p, int q) {

        int i = rootImprovement(p);
        int j = rootImprovement(q);

        return i == j;
    }

    /**
     * old Union
     * @param p
     * @param q
     */
    public void union(int p, int q) {

        int i = root(p);
        int j = root(q);

        id[j] = i;
    }

    /**
     * 小树追加到大树下
     *
     * 将 i 变为 j 的子节点
     * 则需要在 j 树的大小上加上 i 的树
     * 反之亦然
     *
     * @param p
     * @param q
     */
    public void unionImprovement(int p, int q) {

        int i = rootImprovement(p);
        int j = rootImprovement(q);

        if (i == j) {
            return;
        }

        if(size[i] < size[j]) {
            id[i] = j;
            size[j] += size[i];
        } else {
            id[j] = i;
            size[i] += size[j];
        }

        count--;
    }

    public int getCount() {
        return count;
    }

    /**
     * 将大元素节点作为根
     *
     * @param p
     * @param q
     */
    public void unionLimit(int p, int q) {

        int i = root(p);
        int j = root(q);

        if(i == j) {
            return;
        }

        if(i > j) {
            id[j] = i;
        } else {
            id[i] = j;
        }
    }

    public int find(int i) {
        return root(i);
    }

}
