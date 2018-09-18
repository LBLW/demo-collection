package com.demo.MR.log;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-09-13 上午11:23
 * @desc reduce的demo
 **/
public class ReducerDemo extends Reducer<Text, IntWritable, Text, IntWritable> {

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {

        int count = 0;

        for(IntWritable value : values) {
            count += value.get();
        }

        context.write(key, new IntWritable(count));
    }
}
