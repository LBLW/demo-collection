package com.demo.MR.wc.flow;

import com.demo.MR.wc.flow.pojo.FlowBean;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-09-20 上午10:54
 * @desc reducer
 **/
public class FlowReducer extends Reducer<Text, FlowBean, Text, FlowBean> {

    @Override
    protected void reduce(Text key, Iterable<FlowBean> values, Context context) throws IOException, InterruptedException {

        long upper = 0;
        long downer = 0;

        for (FlowBean flowBean : values) {
            upper += flowBean.getUpper();
            downer += flowBean.getDowner();
        }

        context.write(key, new FlowBean(upper, downer));
    }
}
