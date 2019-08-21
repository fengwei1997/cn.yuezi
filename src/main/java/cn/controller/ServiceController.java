package cn.controller;


import cn.bean.Service;
import cn.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class ServiceController {

    @Autowired
    private ServiceService seriviceService;

    @RequestMapping(path = "/selectAll")
    public ArrayList<Service> selectAll(Service service){
        ArrayList<Service> list=seriviceService.selectAllService();
        return list;
    }

}
