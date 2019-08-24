package cn.service.imp;

import cn.bean.User;
import cn.bean.UserInfo;
import cn.dao.UserDao;
import cn.dao.UserInfoDao;
import cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
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
        System.out.println(userInfo);//userInfo的主键被获取到了
        user.setUid(userInfo.getId());
        boolean flag2=userDao.addUser(user);
        if(flag&flag2){
            return true;
        }
        return false;
    }


    @Override
    public boolean test(User user) {
        return userDao.test(user);
    }
}
