package com.wangkefan.spring5.autowire;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Empl {
    @Override
    public String toString() {
        return "Empl{" +
                "dept=" + dept +
                '}';
    }

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }
    @Test
    public void testAutoWire(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean10.xml");
        Empl empl=applicationContext.getBean("empl",Empl.class);
        System.out.println(empl);
    }
}
