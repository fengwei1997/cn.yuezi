package cn.service;

import cn.bean.Service;

import java.util.ArrayList;

public interface ServiceService {

    //添加服务
    boolean addService(Service service);
    //删除服务
    boolean deleteService(int id);
    //查询服务
    Service selectServiceById(int id);
    //查询所有服务
    ArrayList<Service> selectAllService();
    //修改服务信息
    Service updateService(Service service);
}
