package cn.service.imp;

import cn.bean.User;
import cn.dao.UserDao;
import cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public boolean add(User user) {
        return userDao.add(user);
    }

    @Override
    public boolean test(User user) {
        return userDao.test(user);
    }
}
