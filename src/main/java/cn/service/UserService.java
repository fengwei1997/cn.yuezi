package cn.service;

import cn.bean.User;
import cn.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface UserService {
    //用户登录
    User login(User user);
    //添加一个用户
    boolean add(User user);
    //测试
    boolean test(User user);
}
