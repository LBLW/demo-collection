package com.demo.MR.wc;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-09-14 下午5:24
 * @desc 提交任务
 **/
public class JobSubmitted {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        Job job = Job.getInstance();

        job.setJar(args[0]);

        // 设置Map处理相关数据
        job.setMapperClass(WcMapper.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        // 设置Reduce处理相关数据
        job.setReducerClass(WcReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        job.setInputFormatClass(TextInputFormat.class);
        FileInputFormat.setInputPaths(job, new Path(args[1]));
        // 设置reduce实例数目
        job.setNumReduceTasks(3);

        //设置reduce输出 都是在hdfs上
        // 需要通过hadoop命令查看
        // 输出路径必须不存在
        job.setOutputFormatClass(TextOutputFormat.class);
        FileOutputFormat.setOutputPath(job, new Path(args[2]));

        //提交yarn
        boolean result = job.waitForCompletion(true);

        System.exit(result ? 0 : 1);
    }
}
