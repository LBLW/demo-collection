package com.demo.MR.join;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-10-01 下午4:53
 * @desc
 **/
public class JobReducer extends Reducer<Text, Text, Text, NullWritable> {

    @Override
    protected void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        super.reduce(key, values, context);
    }
}
