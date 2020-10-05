package com.baidu.service.serviceimpl;

import com.baidu.dao.UserMapper;
import com.baidu.pojo.User;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-05 1:51
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List findUserList() {
        return userMapper.findUserList();
    }

    //添加新的用户
    @Override
    public void addUser(User user) {

        userMapper.addUser(user);
    }
}
