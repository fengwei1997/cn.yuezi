package cn.service.imp;

import cn.bean.User;
import cn.dao.UserDao;
import cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User login(User user) {
        User u=userDao.login(user);
        if(u!=null){
            return u;
        }

        return null;
    }
}
