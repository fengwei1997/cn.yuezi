package cn.dao;

import cn.bean.User;

public interface UserDao {
    //用户登录
    User login(User user);
    //添加一个用户
    boolean add(User user);
    //测试
    boolean test(User user);
}
