package com.demo.MR.wc.flow.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-09-20 上午10:07
 * @desc 实现hadoop序列化
 * 实现 Writable 接口
 **/

@Data
@AllArgsConstructor
// hadoop 通过反射工具进行初始化序列化/反序列化，
// 需要显式的定义一个空参构造函数
@NoArgsConstructor
// hadoop 调用 toString 将内容打印到文件中
@ToString
public class FlowBean implements Writable {

    private long upper;
    private long downer;

    /**
     * 序列化方法
     * @param out
     * @throws IOException
     */
    @Override
    public void write(DataOutput out) throws IOException {
        out.writeLong(this.upper);
        out.writeLong(this.downer);
    }

    /**
     * 反序列化方法
     * 反序列化的参数顺序要与序列化相同
     * @param in
     * @throws IOException
     */
    @Override
    public void readFields(DataInput in) throws IOException {
        this.upper = in.readLong();
        this.downer = in.readLong();
    }
}
