package com.wangkefan.spring5.zhujie.compl;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CompletelyTest {
    @Test
    public void completelyTest_1(){
//        一般开发不用xml，也不用spring，其使用spring boot进行开发
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Complitly complitly = applicationContext.getBean("complitly", Complitly.class);
        complitly.show();
    }

}
