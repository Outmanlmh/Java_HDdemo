package com.itdr.service.qiantai;


import com.itdr.domain.User;

/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */
public interface UserService {
    //定义规则的过程：
    //用户登录
    boolean login(String uname, String password);

    //用户注册
    boolean regist(String uname, String password);

    //查看用户信息
    User show(String uname);


}
