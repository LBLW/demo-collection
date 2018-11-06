package com.demo.MR.join.comparator;

import com.demo.MR.join.pojo.JoinBean;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

/**
 * @author wangzezhou
 * @create 2018-10-02 下午3:05
 * @desc comparator
 **/
public class UidGroupComparator extends WritableComparator {

    public UidGroupComparator() {
        super(JoinBean.class, true);
    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        return 0;
    }
}
