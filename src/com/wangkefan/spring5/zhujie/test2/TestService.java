package com.wangkefan.spring5.zhujie.test2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
    @Test
    public void testService(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2-2.xml");
        Service service= applicationContext.getBean("service", Service.class);
        service.add();
    }
}
