package cn.controller;

import cn.bean.User;
import cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/doLogin")
    public String login(User user, ModelMap modelMap, HttpServletRequest request){
        System.out.println("user:"+user);
        User user1 = userService.login(user);
        System.out.println(user1);
        if(user1!=null){//登陆成功进入index页面
            return "index";
        }
        modelMap.addAttribute("loginError","登陆失败，请重新登录");
        return "user/login"; //默认是请求转发
    }
}