package com.wangkefan.spring5.zhujie.test_1;

import com.wangkefan.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void testService(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2_1.xml");
        Testapp testapp= applicationContext.getBean("testapp", Testapp.class);
        System.out.println(testapp);
        testapp.abcdef();
    }
}
