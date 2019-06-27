package com.demo.coursera.usage;

/**
 * @author wangzezhou
 * @create 2018-11-28 4:51 PM
 * @desc
 * Successor with delete.
 * Given a set of n integers
 * S={0,1,...,n−1} and a sequence of requests of the following form:
 *
 * Remove x from S
 *
 * Find the successor of x: the smallest y in S such that y≥x.
 *
 * design a data type so that all operations (except construction) take logarithmic time or better in the worst case.
 *
 * 就是将移除的节点按照顺序 union，之后取根节点 +1 的元素
 * 实际上是把所有remove的数做了union，root为子集中的最大值，那么getSuccessor(x)实际就是获取remove数中的最大值+1
 **/
public class Successor {


    int[] id;
    boolean[] isRemove;
    int num;

    public Successor(int N) {

        id = new int[N];

        for(int i=0; i<N; i++) {
            id[i] = i;
            isRemove[i] = false;
        }

        num = N;
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

    public boolean connected(int p, int q) {

        int i = root(p);
        int j = root(q);

        return i == j;
    }

    public void remove(int x) {

        if(x > (num - 1)) {
            return;
        }

        isRemove[x] = true;

        if(x > 0 && isRemove[x - 1]) {
            unionLimit(x, x-1);
        }

    }

    public int getSuccessor(int x) {

        if(x > (num - 1)) {
            return -1;
        }

        if(!isRemove[x]) {
            return x;
        }

        if(root(x) + 1 > num - 1) {
            return -1;
        } else {
            return root(x);
        }
    }

}
