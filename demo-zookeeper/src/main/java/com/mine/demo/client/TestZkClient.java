package com.mine.demo.client;

import com.mine.demo.watcher.TestWatcher;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author wangzezhou
 * @create 2018-10-19 下午5:11
 * @desc 测试zk连接
 **/
public class TestZkClient {

    ZooKeeper zk = null;

    public  void init() throws IOException {
       zk = new ZooKeeper("",2000,null);
    }

    public void createNode() throws UnsupportedEncodingException, KeeperException, InterruptedException {

        //值是以byte[]传入的，所以所有对象都可以作为value 传入。
        String path = zk.create("", "".getBytes("UTF-8"), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
        System.out.println(path);
        zk.close();
    }

    public void delNode() throws KeeperException, InterruptedException {
        //version -1 表示删除所有版本
        zk.delete("",-1);
        zk.close();
    }

    public void setAndGetData() throws KeeperException, InterruptedException, UnsupportedEncodingException {
        //返回元数据
        Stat metaData = zk.setData("","".getBytes("UTF-8"),-1);

        byte[] getData = zk.getData("",false,null);
        zk.close();
    }




    public void jugeNodeExist() throws KeeperException, InterruptedException {

        Stat meta = zk.exists("",false);
        zk.close();
    }

    public void getSubNode() throws KeeperException, InterruptedException {
        //不是全路径，只是子节点自己的path
        List<String> nodeList = zk. getChildren("", false);
        zk.close();
    }


    public void watch() throws KeeperException, InterruptedException {

        // 监听节点内容数据发生变化的事件
        byte[] data =  zk.getData("", new TestWatcher(), null);



    }

    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {

        ZooKeeper zk = new ZooKeeper("",2000,null);

        byte[] result = zk.getData("", false, null);

        zk.close();
    }
}
