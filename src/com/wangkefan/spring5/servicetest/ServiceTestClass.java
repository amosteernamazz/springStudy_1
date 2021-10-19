package com.wangkefan.spring5.servicetest;

public class ServiceTestClass  implements ServiceTest{
    @Override
    public void update() {
        System.out.println("service update");
    }
}
