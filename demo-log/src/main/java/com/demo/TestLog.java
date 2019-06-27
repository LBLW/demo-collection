package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wangzezhou
 * @create 2018-11-07 10:02 AM
 * @desc 日志测试
 **/
public class TestLog {
    private final static Logger LOGGER = LoggerFactory.getLogger(TestLog.class);

    public static void main(String[] args) {
        LOGGER.error("");
    }
}
