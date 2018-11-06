package com.demo.MR.wc.flow.partitionar;

import com.demo.MR.wc.flow.pojo.FlowBean;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

/**
 * @author wangzezhou
 * @create 2018-09-20 下午1:31
 * @desc 自定义分片规则
 **/
public class CustomPartitioner extends Partitioner<Text, FlowBean> {


    @Override
    public int getPartition(Text text, FlowBean flowBean, int numPartitions) {
        return 0;
    }
}
