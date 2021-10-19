package com.wangkefan.spring5.servicetest;

import com.wangkefan.spring5.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

    @org.junit.jupiter.api.Test
    public void test_2(){

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
    UserService userService = applicationContext.getBean("userservice", UserService.class);
    userService.add();
    }
}
