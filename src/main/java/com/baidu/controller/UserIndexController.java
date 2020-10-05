package com.baidu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @create 2020-10-05 9:57
 */
@Controller
public class UserIndexController {

    @RequestMapping("/showindex")
    public String showIndex(){

        return "Index";
    }

}
