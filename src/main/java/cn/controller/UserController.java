package cn.controller;

import cn.bean.User;
import cn.bean.UserInfo;
import cn.service.UserService;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/doLogin")
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

    @RequestMapping("/doRegister")
    public String register(UserInfo userInfo,User user){

        System.out.println("userInfo:"+userInfo);
        System.out.println("user:"+user);
        boolean flag=userService.register(user,userInfo);
        if(flag){
            return "redirect:user/login.jsp";
        }
        return "user/register";
    }
}