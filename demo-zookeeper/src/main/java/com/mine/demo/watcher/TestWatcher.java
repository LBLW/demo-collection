package com.mine.demo.watcher;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

/**
 * @author wangzezhou
 * @create 2018-10-24 8:52 PM
 * @desc 监听器实现类
 **/
public class TestWatcher implements Watcher {

    /**
     * zk client 收到来自集群事件通知之后调用
     * @param watchedEvent
     */
    @Override
    public void process(WatchedEvent watchedEvent) {
        System.out.println(watchedEvent);
    }


}
