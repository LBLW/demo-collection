package com.demo.MR.wc.flow;

import com.demo.MR.wc.flow.pojo.FlowBean;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-09-20 上午10:06
 * @desc mapper
 **/
public class FlowMapper extends Mapper<LongWritable, Text, Text, FlowBean> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        String line = value.toString();

        String[] words = line.split(" ");

        for (String word : words) {

            FlowBean flowBean = new FlowBean(10, 30);

            context.write(new Text(word), flowBean);
        }
    }
}
