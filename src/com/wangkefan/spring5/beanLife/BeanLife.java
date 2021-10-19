package com.wangkefan.spring5.beanLife;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLife {
    private String oname;

    public BeanLife() {
        System.out.println("with no variable constructor.");
    }

    public void setOname(String oname) {
        System.out.println(" the function of set is used.");
        this.oname = oname;
    }
//    创建执行的初始化方法
    public void initMethod(){
        System.out.println("the init function.");
    }
    public void destroyMethod(){
        System.out.println("the object is destroyed");
    }
    @Test
    public void testBean_3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean9.xml");
        BeanLife beanLife= applicationContext.getBean("beanlife",BeanLife.class);
        System.out.println("get the object. ");
        System.out.println(beanLife);

//        需要强制类型转换为classpathxmlapplicationcontext因为applicationcontext是class的实现类，转换成子类
        ((ClassPathXmlApplicationContext) applicationContext).close();

    }}
