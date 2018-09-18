package com.demo.MR.log;

import com.demo.MR.log.MapperDemo;
import com.demo.MR.log.ReducerDemo;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author wangzezhou
 * @create 2018-09-13 下午4:10
 * @desc 提交mapreduce任务到yarn
 **/
public class JobSubmitted {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        InputStream propertiesStream = new FileInputStream("/etc/demo/demo.properties");
        Properties properties = new Properties();
        properties.load(propertiesStream);

        // 建立 job 以提交至 yarn
        Job job = Job.getInstance();

        // 指定 jar 包路径
        job.setJar(properties.getProperty("jar.path"));

        // 设置Map处理相关数据
        job.setMapperClass(MapperDemo.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        // 设置Reduce处理相关数据
        job.setReducerClass(ReducerDemo.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        //设置reduce输入 都是在hdfs上 需要通过hadoop命令查看
        job.setInputFormatClass(TextInputFormat.class);
        FileInputFormat.setInputPaths(job, new Path(properties.getProperty("log.input")));

        //设置reduce输出 都是在hdfs上
        // 需要通过hadoop命令查看
        // 输出路径必须不存在
        job.setOutputFormatClass(TextOutputFormat.class);
        FileOutputFormat.setOutputPath(job, new Path(properties.getProperty("log.output")));

        //提交yarn
        boolean result = job.waitForCompletion(true);

        System.exit(result ? 0 : 1);


    }
}
