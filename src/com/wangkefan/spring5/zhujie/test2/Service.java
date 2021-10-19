package com.wangkefan.spring5.zhujie.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value="service")
public class Service {

    @Autowired
    @Qualifier(value = "propertiesInfomation")
    private PropertiesInfo propertiesInfo;

    @Resource(name = "propertiesInfomation")
    private PropertiesInfo propertiesInfo_2;
    public void add(){
        System.out.println("service add ......");
        propertiesInfo.add();
        propertiesInfo_2.add();
        System.out.println(serviceName);
    }

    @Value(value = "abc")
    private String serviceName;



    //    基于注解方式的属性注入
//    @Autowired  根据属性类型进行自动装配
//    第一步，在两个类添加注解
//    第二步，在service中定义properties属性，在属性上使用注解，当有值的时候，添加其对应的对象不用添加set方法
//    第三步，在对应的测试类中，得到对应的bean文件

//    @Qualifier  根据属性名称进行注入
//    使用的时候应当跟Autowire一起使用
//    当使用interface对应实现类不唯一，但属性为对应interface接口，此时使用Qualifier(value="")填对应的实现类即可

//    @Resource   根据类型注入或名称注入
//    其存在于javax包中，可以根据名称导入
//    @Value      注入普通类型属性
//    注入到对应类型中去

}
