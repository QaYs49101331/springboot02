package com.baidu.dao;

import com.baidu.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-05 1:50
 */
//@Mapper
@Repository
public interface UserMapper {


    List findUserList();

    void addUser(User user);
}
