package cn.service;

import cn.bean.User;
import cn.bean.UserInfo;
import cn.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {
    //用户登录
    User login(User user);
    //注册用户信息
    boolean register(User user, UserInfo userInfo);
    //测试
    boolean test(User user);
    //
    void show();
}
