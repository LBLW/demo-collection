package com.demo.other;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * @author wangzezhou
 * @create 2020-05-13 2:11 PM
 * @desc 测试布隆过滤器
 **/
public class TestBloomFilter {

    private static int total = 10000000;

    public static final BloomFilter<Integer> BLOOM_FILTER = BloomFilter.create(Funnels.integerFunnel(), total,0.01);
//    public static final BloomFilter<Integer> BLOOM_FILTER = BloomFilter.create(Funnels.integerFunnel(), total);

    public static void main(String[] args) {

        for(int i=0; i<total; i++) {
            BLOOM_FILTER.put(i);
        }

        for(int i=0; i<total; i++) {
            if(!BLOOM_FILTER.mightContain(i)) {
                System.out.println("有元素未匹配");
            }
        }


        int count = 0;
        for(int i=total; i < total+10000; i++) {
            if(BLOOM_FILTER.mightContain(i)) {
                count++;
            }
        }

        System.out.println(String.format("误伤:%d",count));
    }
}