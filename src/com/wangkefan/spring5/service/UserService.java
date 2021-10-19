package com.wangkefan.spring5.service;

import com.wangkefan.spring5.servicetest.ServiceTest;
import com.wangkefan.spring5.servicetest.ServiceTestClass;

public class UserService {
    private ServiceTest serviceTest;

    public void setServiceTest(ServiceTest serviceTest) {
        this.serviceTest = serviceTest;
    }

    public void add(){
        System.out.println("userservice add");
        serviceTest.update();
//        从一个类中调用另外一个类中的方法
//        ServiceTest servicetest = new ServiceTestClass();
//        servicetest.update();
    }

}
