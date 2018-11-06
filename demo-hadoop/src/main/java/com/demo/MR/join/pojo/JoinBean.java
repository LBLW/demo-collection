package com.demo.MR.join.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-10-01 下午5:27
 * @desc 实体
 **/

@Data
@ToString
@NoArgsConstructor
public class JoinBean implements WritableComparable<JoinBean> {

    private String orderId;
    private String uuid;
    private String uName;
    private String age;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeUTF(this.orderId);
        out.writeUTF(this.uuid);
        out.writeUTF(this.uName);
        out.writeUTF(this.age);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        this.orderId = in.readUTF();
        this.uuid = in.readUTF();
        this.uName = in.readUTF();
        this.age = in.readUTF();
    }

    @Override
    public int compareTo(JoinBean o) {
        return 0;
    }
}
