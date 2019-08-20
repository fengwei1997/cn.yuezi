package cn.dao;

import cn.bean.Service;

public interface ServiceDao {
    //添加服务
    boolean addService(Service service);
    //删除服务
    boolean deleteService(int id);
    //查询服务
    Service selectServiceById(int id);
    //修改服务信息
    Service updateService(Service service);
}
