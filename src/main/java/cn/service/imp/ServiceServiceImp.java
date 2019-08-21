package cn.service.imp;

import cn.bean.Service;
import cn.dao.ServiceDao;
import cn.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@org.springframework.stereotype.Service("serviceService")
public class ServiceServiceImp implements ServiceService {

    @Autowired
    private ServiceDao serviceDao;

    @Override
    public boolean addService(Service service) {
        return serviceDao.addService(service);
    }

    @Override
    public boolean deleteService(int id) {
        return serviceDao.deleteService(id);
    }

    @Override
    public Service selectServiceById(int id) {
        return serviceDao.selectServiceById(id);
    }

    @Override
    public ArrayList<Service> selectAllService() {
        return serviceDao.selectAllService();
    }

    @Override
    public Service updateService(Service service) {
        return serviceDao.updateService(service);
    }
}
