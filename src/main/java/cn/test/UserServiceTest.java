package cn.test;

import cn.bean.User;
import cn.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @RunWith就是一个运行器
 * @RunWith(SpringJUnit4ClassRunner.class),让测试运行于Spring测试环境
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:mvc.xml","classpath:mybatis-config.xml"})
public class UserServiceTest {
    @Autowired
    UserService userService;
    @org.junit.Test //导包错误，一定报错，是此包下的test方法
    public void login(){
        User user=new User();
        user.setUsername("feng1997");
        user.setPassword("m123");
        User user1=new User();
        user1=userService.login(user);
        System.out.println(user1);
    }

    @Test
    public void show(){
        System.out.println("a");
    }
}
