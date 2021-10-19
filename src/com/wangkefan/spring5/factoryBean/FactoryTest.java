package com.wangkefan.spring5.factoryBean;

import com.wangkefan.spring5.collectiontype.Course;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryTest {
    @Test
    public void testFactory(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean7.xml");
        Course course= applicationContext.getBean("factoryBean", Course.class);
        System.out.println(course.toString());

    }
}
