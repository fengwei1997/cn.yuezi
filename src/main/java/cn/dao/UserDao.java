package cn.dao;

import cn.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    //添加一个用户
    boolean add(User user);
    //根据ID获取用户的时候不应该获取用户的密码
    User getById(int id);
    //获取用户的完整信息
    User get(User user);
}
