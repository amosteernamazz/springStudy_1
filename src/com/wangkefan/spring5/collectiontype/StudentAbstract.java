package com.wangkefan.spring5.collectiontype;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StudentAbstract {
    private List <String> list;

    public void setList(List<String> list) {
        this.list = list;
    }
    public void showAbs() {
        System.out.println(list);
    }
    @Test
    public void testAbstract(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean6.xml");
        StudentAbstract studentAbstract = applicationContext.getBean("student",StudentAbstract.class);
        studentAbstract.showAbs();
    }
}
