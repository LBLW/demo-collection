package com.demo.MR.wc;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-09-14 上午10:19
 * @desc
 **/
public class WcReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {

        int count = 0;

        for(IntWritable value : values) {
            count += value.get();
        }

        context.write(key, new IntWritable(count));
    }
}
