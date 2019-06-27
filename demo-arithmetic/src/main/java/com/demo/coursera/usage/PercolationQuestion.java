package com.demo.coursera.usage;

import com.demo.coursera.algorithm.QuickUnion;

import java.util.Random;

/**
 * @author wangzezhou
 * @create 2018-11-27 3:25 PM
 * @desc 渗滤问题
 **/
public class PercolationQuestion {

    private QuickUnion quickUnion;

    /**
     * 初始化 quick union 与 虚位
     *
     */
    public PercolationQuestion() {



        quickUnion = new QuickUnion((25 + 2));

        // 上虚位连接
        for(int i=1; i<6; i++) {
            quickUnion.unionImprovement(0, i);
        }

        // 下虚位连接
        for(int i=25; i>20; i--) {
            quickUnion.unionImprovement(26, i);
        }
    }


    public int unionCount() {

        int count = 1;

        while (!quickUnion.connected(0, 26)) {


            int p = generateRandom(25, 1);
            int q = generateRandom(25, 1);

            System.out.println(String.format("p is %d, q is %d", p, q));

            quickUnion.unionImprovement(p, q);

            count++;
        }

        return count;
    }

    private int generateRandom(int max, int min) {

        Random random = new Random();

        return random.nextInt(max) % (max - min + 1) + min;
    }

    public static void main(String[] args) {

        PercolationQuestion percolationQuestion = new PercolationQuestion();

        System.out.println(percolationQuestion.unionCount());
    }
}
