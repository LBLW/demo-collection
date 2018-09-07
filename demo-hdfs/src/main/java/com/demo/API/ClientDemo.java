package com.demo.API;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;

/**
 * @author wangzezhou
 * @create 2018-09-05 上午11:24
 * @desc 调用 hdfs API 传文件
 **/
public class ClientDemo {

    public static void main(String[] args) throws Exception {

        Configuration conf = new Configuration();

        // DistributeFileSystem -> DFSClient -> namenode（通过RPC请求到 namenode 服务）
        FileSystem  hdfsClient = FileSystem.get(new URI("hdfs://server-101:9000/"), conf, "root");

        // 文件上传
        hdfsClient.copyFromLocalFile(new Path(""), new Path(""));

        // 文件下载
        // 本地文件有权限， hadoop 要操作这些文件有两种方式
        // 1. 使用hadoop 提供的本地库(win 有 win 的本地库， linux 有 linux 的本地库)
        // 2. 使用 java 原生库对本地文件进行操作，调用如下API
        hdfsClient.copyToLocalFile(false, new Path(""), new Path(""), true);

        hdfsClient.close();
    }

}
