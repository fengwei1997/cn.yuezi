package cn.test;

import cn.bean.Service;
import cn.controller.ServiceController;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ServiceTest {

    @Test
    public void test1(){
        ServiceController serviceController=new ServiceController();
        ArrayList<Service> list= serviceController.selectAll();
    }
}
