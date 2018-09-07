package com.demo.RPC.service;

/**
 * @author wangzezhou
 * @create 2018-09-07 上午10:21
 * @desc
 **/
public interface LoginService {

    //指定接口版本
    long versionID = 1L;

    String login(String username, String password);
}
