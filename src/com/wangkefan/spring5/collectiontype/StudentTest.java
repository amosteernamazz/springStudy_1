package com.wangkefan.spring5.collectiontype;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void studentTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean5.xml");
        Student student = applicationContext.getBean("student",Student.class);
        student.show();
    }
}
