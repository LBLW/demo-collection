package com.demo.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellScanner;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.filter.BinaryPrefixComparator;
import org.apache.hadoop.hbase.filter.ByteArrayComparable;
import org.apache.hadoop.hbase.filter.CompareFilter;
import org.apache.hadoop.hbase.filter.RowFilter;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wangzezhou
 * @create 2018-11-07 1:32 PM
 * @desc Hbase 数据操作
 **/
public class HBaseDML {

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

    /**
     * 插入单条数据
     */
    public void putData() throws IOException {

        Table table = conn.getTable(TableName.valueOf("t_code_table"));

        Put put = new Put("base_table_001".getBytes());
        put.addColumn("base_info".getBytes(),"user_name".getBytes(),"张三".getBytes());
        put.addColumn("base_info".getBytes(),"user_age".getBytes(), Bytes.toBytes(18));

        table.put(put);

        table.close();
        conn.close();
    }

    /**
     * 批量插入数据
     */
    public void putDatas() throws IOException {

        Table table = conn.getTable(TableName.valueOf("t_code_table"));

        Put beforePut = new Put("base_table_001".getBytes());
        beforePut.addColumn("base_info".getBytes(),"user_name".getBytes(),"张三".getBytes());
        beforePut.addColumn("base_info".getBytes(),"user_age".getBytes(), Bytes.toBytes(18));

        Put afterPut = new Put("base_table_001".getBytes());
        afterPut.addColumn("base_info".getBytes(),"user_name".getBytes(),"李四".getBytes());
        afterPut.addColumn("base_info".getBytes(),"user_age".getBytes(),Bytes.toBytes(27));

        List<Put> putList = new ArrayList<>();
        putList.add(beforePut);
        putList.add(afterPut);

        table.put(putList);

        table.close();
        conn.close();
    }

    /**
     * 更新数据
     * 就是将相同列族中的相同的key换为不同的value
     * @throws IOException
     */
    public void updateData() throws IOException {

        Table table = conn.getTable(TableName.valueOf("t_code_table"));

        Put put = new Put("base_table_001".getBytes());
        put.addColumn("base_info".getBytes(), "user_name".getBytes(), "王五".getBytes());

        table.put(put);

        table.close();
        conn.close();

    }

    /**
     * 删除数据
     * @throws IOException
     */

    public void deleteData() throws IOException {

        Table table = conn.getTable(TableName.valueOf("t_code_table"));

        //单独删除一个key
        Delete deleteByKey = new Delete("base_table_001".getBytes());

        deleteByKey.addColumn("base_info".getBytes(),"user_name".getBytes());
        // 删除一行数据; 删除一组数据
        Delete delete_1 = new Delete("base_table_001".getBytes());

        Delete delete_2 = new Delete("base_table_002".getBytes());

        List<Delete> deleteList = new ArrayList<>();
        deleteList.add(delete_1);
        deleteList.add(delete_2);

        table.delete(deleteByKey);
        table.delete(deleteList);

        table.close();
        conn.close();

    }

    /**
     * 单查一行数据
     * @throws IOException
     */
    public void getData() throws IOException {

        Table table = conn.getTable(TableName.valueOf("t_code_table"));

        Get get = new Get("base_table_001".getBytes());

        Result result = table.get(get);

        //从一行数据中取指定 key 的 value 值
        byte[] value = result.getValue("base_info".getBytes(), "user_name".getBytes());
        String userName = Bytes.toString(value);
        System.out.println(userName);

        printResult(result);

        table.close();
        conn.close();
    }

    /**
     * 扫描数据 (查多行数据)
     * @throws IOException
     */

    public void scanData() throws IOException {

        Table table = conn.getTable(TableName.valueOf("t_code_table"));

        // 通过 16 进制数字限制行数
        Scan scan = new Scan("rk001".getBytes(), ("rk005"+"0x00").getBytes());

        ResultScanner scanner = table.getScanner(scan);
        Iterator<Result> iterator = scanner.iterator();

        while (iterator.hasNext()) {
            Result next = iterator.next();

            printResult(next);
        }

    }

    /**
     * 使用过滤器扫描数据
     * @throws IOException
     */
    public void scanFilter() throws IOException {

        Table table = conn.getTable(TableName.valueOf("t_code_table"));

        RowFilter rowFilter = new RowFilter(CompareFilter.CompareOp.NO_OP, new BinaryPrefixComparator("base_info".getBytes()));
        Scan scan = new Scan("rk001".getBytes(), rowFilter);

        ResultScanner scanner = table.getScanner(scan);
        Iterator<Result> iterator = scanner.iterator();

        while (iterator.hasNext()) {
            Result next = iterator.next();

            printResult(next);
        }
    }

    /**
     * 打印 result 中的内容
     * @param result
     * @throws IOException
     */
    public void printResult(Result result) throws IOException {

        //取所有 key value
        CellScanner cellScanner = result.cellScanner();
        while (cellScanner.advance()) {

            Cell cell = cellScanner.current();

            // 直接 getXXXArray 取的是所有数据的 byte[]
            //            byte[] rowArray = cell.getRowArray();
            //            System.out.println(Bytes.toString(rowArray));

            // 取具体某段数据
            byte[] rowArray = cell.getRowArray();
            // 指定数据的偏移量与长度
            System.out.println(Bytes.toString(rowArray, cell.getRowOffset(), cell.getRowLength()));

            byte[] familyArray = cell.getFamilyArray();
            System.out.println(Bytes.toString(familyArray, cell.getFamilyOffset(), cell.getFamilyLength()));

            byte[] qualifierArray = cell.getQualifierArray();
            System.out.println(Bytes.toString(qualifierArray, cell.getQualifierOffset(), cell.getQualifierLength()));

            byte[] valueArray = cell.getValueArray();
            System.out.println(Bytes.toString(valueArray, cell.getValueOffset(), cell.getValueLength()));

        }
    }



}
