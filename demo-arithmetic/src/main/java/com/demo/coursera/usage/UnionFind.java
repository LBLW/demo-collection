package com.demo.coursera.usage;

/**
 * @author wangzezhou
 * @create 2018-11-28 4:20 PM
 * @desc
 *
 * Union-find with specific canonical element.
 * Add a method find() to the union-find data type so that
 * find(i) returns the largest element in the connected component containing i.
 * The operations, union(), connected(), and
 * find() should all take logarithmic time or better.
 * For example, if one of the connected components is
 * {1,2,6,9}, then the find() method should return
 * 9 for each of the four elements in the connected components.
 *
 * 因此只需要在union时，用两个子集中较大的root作为合并后的root就可以了。
 **/
public class UnionFind {


    int[] id;
    int count;

    public UnionFind(int N) {

        id = new int[N];

        for(int i=0; i<N; i++) {
            id[i] = i;
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

    public int find(int i) {
        return root(i);
    }

}
