package com.wangkefan.spring5.test3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test3 {
    @Test
    public void test_3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");

        //        级联赋值的方式
        //        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean4.xml");
        Emplo emplo = applicationContext.getBean("employ",Emplo.class);
        emplo.show();
    }
}
