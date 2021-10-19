package com.wangkefan.spring5.mutiExample;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MutiExampleTest {
//    多实例对象
//    对应的内存空间不同
//    默认的singleton方法是，在加载spring配置文件的时候创建单实例对象
//    而prototype加载时不是在加载配置文件的时候创建对象，而是在getbean方法中创建
    @Test
    public void mutiExampleTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean8.xml");
        MutiExample mutiExample= applicationContext.getBean("mutiExample",MutiExample.class);
        System.out.println(mutiExample.toString());
        MutiExample mutiExample_1= applicationContext.getBean("mutiExample",MutiExample.class);
        System.out.println(mutiExample_1.toString());
    }
}
