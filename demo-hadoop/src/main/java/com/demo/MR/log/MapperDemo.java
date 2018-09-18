package com.demo.MR.log;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-09-13 上午11:22
 * @desc Map的demo
 **/
public class MapperDemo extends Mapper<LongWritable, Text, Text, IntWritable> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        String line = value.toString();
        String[] lineElements = line.split(" ");
        String ip = lineElements[0];

        context.write(new Text(ip), new IntWritable(1));
    }
}
