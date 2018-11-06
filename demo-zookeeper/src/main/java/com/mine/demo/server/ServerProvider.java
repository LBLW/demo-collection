package com.mine.demo.server;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

/**
 * @author wangzezhou
 * @create 2018-10-26 1:49 PM
 * @desc 服务提供
 **/
public class ServerProvider {

    private ZooKeeper zk = null;

    public void init() throws IOException {
        zk = new ZooKeeper("",2000,null);
    }

    public void processHandler() {

    }

    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {

        ServerProvider provider = new ServerProvider();
        provider.init();

        provider.zk.create("/servers/server","aaa".getBytes("UTF-8"), ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.EPHEMERAL_SEQUENTIAL);

        Thread.sleep(Long.MAX_VALUE);
    }
}
