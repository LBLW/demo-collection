package com.demo.MR.wc.filter;

import com.demo.MR.wc.upper.UpperJobSubmittedStepOne;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-09-19 上午10:29
 * @desc 过滤相同mac
 **/
public class FilterMac {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        Job job = Job.getInstance();

        //
        job.setJarByClass(FilterMac.class);

        // 设置Map处理相关数据
        job.setMapperClass(FilterMapper.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        // 设置Reduce处理相关数据
        job.setReducerClass(FilterReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        job.setInputFormatClass(TextInputFormat.class);
        FileInputFormat.setInputPaths(job, new Path(args[0]));

        //设置reduce输出 都是在hdfs上
        // 需要通过hadoop命令查看
        // 输出路径必须不存在
        job.setOutputFormatClass(TextOutputFormat.class);
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        // 设置reduce实例数目
        job.setNumReduceTasks(Integer.valueOf(args[2]));

        //提交yarn
        boolean result = job.waitForCompletion(true);

        System.exit(result ? 0 : 1);
    }
}

class FilterMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        context.write(value, new IntWritable(1));

    }
}

class FilterReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {

        int count = 0;

        for(IntWritable value : values){
            count += value.get();
        }

        if(count > 1) {
            context.write(key, new IntWritable(count));
        }
    }
}
