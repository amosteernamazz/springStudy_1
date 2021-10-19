package com.wangkefan.spring5.singleExample;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingleExampleTest {
//    在spring中，设置创建bean实例是单实例还是多实例，即bean的作用域
//    默认bean中采用的是的单实例的方式
//    创建的对象的地址保持一致
    @Test
    public void singleExampleTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean8.xml");
         SingleExample singleExample=applicationContext.getBean("singleExample",SingleExample.class);
        System.out.println(singleExample);
        SingleExample singleExample_2=applicationContext.getBean("singleExample",SingleExample.class);
        System.out.println(singleExample_2);

    }
}
