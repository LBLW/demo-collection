package com.demo.MR.wc;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-09-24 下午3:17
 * @desc combiner
 * 工作机制相同，工作阶段不同
 **/
public class WcCombiner extends Reducer<Text, IntWritable, Text, IntWritable> {

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {

        int count = 0;

        for(IntWritable value : values) {
            count += value.get();
        }

        context.write(key, new IntWritable(count));
    }
}
