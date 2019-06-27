package com.demo.hbase;

import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


/**
 * @author wangzezhou
 * @create 2018-11-15 2:28 PM
 * @desc 数据批量导入hbase
 **/
public class BulkLoad {

    /**
     * 输出泛型确定。
     */
    public static class ConvertWordCountOutToHFileMapper extends Mapper<LongWritable, Text, ImmutableBytesWritable, Put> {

    }
}
