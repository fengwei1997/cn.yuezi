package cn.controller;

import cn.bean.User;
import cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/login")
    public String login(User user){
        System.out.println("user:"+user);
        boolean flag = userService.add(user);
        if(flag){
            System.out.println(user);
            return "index";
        }else {
            System.out.println("null");
            return "login";
        }
    }
}