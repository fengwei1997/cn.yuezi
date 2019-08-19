package cn.dao;

import cn.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    //添加一个用户
    boolean add(User user);
    //测试
    boolean test(User user);
}
