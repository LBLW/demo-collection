package com.demo.MR.wc.flow;

import com.demo.MR.wc.flow.partitionar.CustomPartitioner;
import com.demo.MR.wc.flow.pojo.FlowBean;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-09-20 上午10:59
 * @desc 任务提交
 **/
public class JobSubmitter {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Job job = Job.getInstance();

        job.setJarByClass(JobSubmitter.class);

        // 设置Map处理相关数据
        job.setMapperClass(FlowMapper.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(FlowBean.class);

        // 设置Reduce处理相关数据
        job.setReducerClass(FlowReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(FlowBean.class);

        job.setInputFormatClass(TextInputFormat.class);
        FileInputFormat.setInputPaths(job, new Path(args[1]));
        // 设置reduce实例数目
        job.setNumReduceTasks(3);

        //设置reduce输出 都是在hdfs上
        // 需要通过hadoop命令查看
        // 输出路径必须不存在
        job.setOutputFormatClass(TextOutputFormat.class);
        FileOutputFormat.setOutputPath(job, new Path(args[2]));

        job.setPartitionerClass(CustomPartitioner.class);

        //提交yarn
        boolean result = job.waitForCompletion(true);

        System.exit(result ? 0 : 1);
    }
}
