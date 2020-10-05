package com.baidu.service;

import com.baidu.pojo.User;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-05 1:50
 */
public interface UserService {

    List findUserList();
    //添加新的用户
    void addUser(User user);
}
