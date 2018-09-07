package com.demo.RPC.service.impl;

import com.demo.RPC.service.LoginService;

/**
 * @author wangzezhou
 * @create 2018-09-07 上午10:22
 * @desc 登录的接口实现
 **/
public class LoginServiceImpl implements LoginService {

    @Override
    public String login(String username, String password) {

        return String.format("Hello %s, your pass is %s", username, password);
    }
}
