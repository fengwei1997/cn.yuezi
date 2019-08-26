package cn.service.imp;

import cn.bean.User;
import cn.bean.UserInfo;
import cn.dao.UserDao;
import cn.dao.UserInfoDao;
import cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserInfoDao userInfoDao;
    @Autowired
    private UserDao userDao;


    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    /*注册用户信息*/
    @Transactional
    @Override
    public boolean register(User user, UserInfo userInfo) {
        boolean flag=userInfoDao.addUserInfo(userInfo);
        System.out.println(userInfo);
        user.setUid(userInfo.getId());//获取到userInfo在数据库中生成的主键id，添加外键id
        boolean flag2=userDao.addUser(user);
        return flag&flag2?true:false;
    }


    @Override
    public boolean test(User user) {
        return userDao.test(user);
    }

    @Override
    public void show() {
        System.out.println("show方法");
    }
}
