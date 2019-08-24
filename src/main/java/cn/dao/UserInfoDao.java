package cn.dao;

import cn.bean.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao {
    //添加一条用户信息
    boolean addUserInfo(UserInfo userInfo);
}
