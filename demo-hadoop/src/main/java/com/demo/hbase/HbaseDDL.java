package com.demo.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.regionserver.BloomType;

import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-11-06 4:08 PM
 * @desc hbase 数据库操作相关功能
 **/
public class HbaseDDL {

    Connection conn = null;

    /**
     * 获取 hbase 连接
      */
    public void init() throws IOException {
        Configuration conf = HBaseConfiguration.create();
        // 配置hbase-site.xml中的zk的配置
        conf.set("zkConfiguration","");
        conn = ConnectionFactory.createConnection(conf);
    }

    public void createTable() throws IOException {

        // 创建一个表管理器来对表进行ddl操作
        Admin admin = conn.getAdmin();
        HTableDescriptor descriptor = new HTableDescriptor(TableName.valueOf("t_code_table"));
        HColumnDescriptor hColumnDescriptor = new HColumnDescriptor("f1");
        //hbase 中可以存k-v的近n个版本n
        hColumnDescriptor.setMinVersions(1);
        hColumnDescriptor.setMaxVersions(3);
        descriptor.addFamily(hColumnDescriptor);

        admin.createTable(descriptor);

        admin.close();
        conn.close();
    }

    public void dropTable() throws IOException {

        Admin admin = conn.getAdmin();

        //删除表之前先要禁用表
        admin.disableTable(TableName.valueOf("t_code_table"));
        admin.deleteTable(TableName.valueOf("t_code_table"));

        admin.close();
        conn.close();

    }

    public void modifyTable() throws IOException {

        Admin admin = conn.getAdmin();

        HTableDescriptor descriptor = admin.getTableDescriptor(TableName.valueOf("t_code_table"));

        HColumnDescriptor hColumnDescriptor = new HColumnDescriptor("f2");
        hColumnDescriptor.setBlocksize(131204);
        hColumnDescriptor.setBloomFilterType(BloomType.ROW);
        descriptor.addFamily(hColumnDescriptor);

        admin.modifyTable(TableName.valueOf("t_code_table"),descriptor);

        admin.close();
        conn.close();

    }


}
