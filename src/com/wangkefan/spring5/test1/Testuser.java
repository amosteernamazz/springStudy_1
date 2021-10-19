package com.wangkefan.spring5.test1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testuser {
    @Test
    public void testAdd(){
        // IOC容器底层是工厂模式 提供了两种方式  ApplicationContext BeanFactory
        // BeanFactory 是spring内部使用接口，不提供开发人员
        // 只加载配置文件而不去创建对象，在使用时才创建
        // ApplicationContext 功能更多，面向开发人员  一般使用此方法
        // 加载时创建对象
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // ClassPathXmlApplicationContext 对应package下的路径
        // FileSystemXmlApplicationContext 对应文件全路径
        // 获取配置创建的对象
        User user = context.getBean("user",User.class);
        System.out.println(user);
        user.add();
        user.show();
        user.show_2();
        user.show_3();


    }

}
