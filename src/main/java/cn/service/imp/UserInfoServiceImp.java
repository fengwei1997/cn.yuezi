package cn.service.imp;

import cn.bean.UserInfo;
import cn.dao.UserInfoDao;
import cn.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.transform.Source;

@Service
public class UserInfoServiceImp implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;
    @Override
    public boolean addUserInfo(UserInfo userInfo) {
        boolean flag=userInfoDao.addUserInfo(userInfo);
        System.out.println(flag);
        return flag;
    }
}
