package com.demo.MR.join;

import com.demo.MR.join.pojo.JoinBean;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileSplit;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-10-01 下午4:53
 * @desc mapper
 **/
public class JobMapper extends Mapper<LongWritable, Text, Text, JoinBean> {

    private String fileName;

    @Override
    protected void setup(Context context) throws IOException, InterruptedException {
        FileSplit fileSplit = (FileSplit) context.getInputSplit();
        fileName = fileSplit.getPath().getName();
    }

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        String line = value.toString();
        String[] dataValue = line.split(",");
        JoinBean joinBean = new JoinBean();
        if("order.txt".equals(fileName)) {

        } else if("value.txt".equals(fileName)) {

        }


    }
}
