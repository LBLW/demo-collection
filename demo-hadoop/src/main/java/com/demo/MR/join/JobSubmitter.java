package com.demo.MR.join;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author wangzezhou
 * @create 2018-10-01 下午4:52
 * @desc 任务提交
 **/
public class JobSubmitter {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException, URISyntaxException {

        Job job = Job.getInstance();

        job.setJar(args[0]);

        // 设置Map处理相关数据
        job.setMapperClass(JobMapper.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        // 设置Reduce处理相关数据
        job.setReducerClass(JobReducer.class);
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

        // 将资源文件事先加载到mapTask的缓存目录中去
        job.addCacheFile(new URI(""));

        //提交yarn
        boolean result = job.waitForCompletion(true);

        System.exit(result ? 0 : 1);
    }
}
