package com.baidu.controller;

import com.baidu.pojo.User;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-05 1:44
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public List Login(){


        List<User> list =  userService.findUserList();
        return  list;
    }
    /*
        name : 将前端name的属性值 绑定到后端参数列表的属性上,如果前后端参数参数不一致使用
        required: 表示当前的参数一定要获取到,没有就报错
        defaultValue :当前参数如果设置了默认值, required=true 将失效
     */
    @RequestMapping("/adduser")
    public String  addUser(@RequestParam(name = "usernames", required = true, defaultValue ="张三" ) String username, @RequestParam(defaultValue = "123456") String password, @RequestParam(defaultValue = "18")  String age){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(Integer.parseInt(age));
        System.out.println(user);
        userService.addUser(user);
        return "success";
    }


}
