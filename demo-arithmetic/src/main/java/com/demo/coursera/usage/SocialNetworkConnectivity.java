package com.demo.coursera.usage;

import com.demo.coursera.algorithm.QuickUnion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author wangzezhou
 * @create 2018-11-28 3:20 PM
 * @desc
 *
 * Social network connectivity.
 * Given a social network containing
 * n members and a log file containing m timestamps at which times pairs of members formed friendships,
 * design an algorithm to determine the earliest time at which all members are connected
 * (i.e., every member is a friend of a friend of a friend ... of a friend).
 * Assume that the log file is sorted by timestamp and that friendship is an equivalence relation.
 * The running time of your algorithm should be
 * m log n or better and use extra space proportional to n.
 *
 * 这是个典型的并查集。思路是读取日志文件，遍历文件记录，逐条记录union。
 * 采用加权quick-union算法，就可以满足 m log n 的复杂度要求
 *
 **/
public class SocialNetworkConnectivity {

    private QuickUnion quickUnion;
    private FileInputStream fileInputStream;

    public SocialNetworkConnectivity(int num, FileInputStream fileInputStream) {
        this.quickUnion = new QuickUnion(num);
        this.fileInputStream = fileInputStream;
    }

    public String getEarliestTime() {

        Scanner scanner = new Scanner(fileInputStream, "utf-8");

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();


            if(null != line && !"".equals(line.trim())) {

                String[] lineData = line.split(" ");

                // do more check
                quickUnion.unionImprovement(Integer.parseInt(lineData[1]), Integer.parseInt(lineData[2]));

                if(quickUnion.getCount() == 1) {
                    return lineData[0];
                }

            }
        }

        return null;

    }

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("");
            SocialNetworkConnectivity snc = new SocialNetworkConnectivity(10, fileInputStream);
            System.out.println(snc.getEarliestTime());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
