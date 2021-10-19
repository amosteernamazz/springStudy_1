package com.wangkefan.spring5.zhujie.test_1;

import org.springframework.stereotype.Component;

//在注解里面value属性值可以省略，其对应的value值为首字母小写的class类型
@Component(value = "testapp")
public class Testapp {
//    注解是代码特殊标记   格式： @注解名称(属性名称=属性值, 属性名称=属性值)
//    使用注解，注解可以作用在类上面，方法上面，属性上面
//    使用注解的目的，简化xml开发


//    创建对象 功能相同 都用来创建bean实例

//    针对bean管理中创建对象提供的注解
//    @Component(普通组件)
//    @Service (用在业务逻辑层或service层)
//    @Controller(用在web层)
//    @Repository (用在do层或持久层)


//   基于注解方式实现对象的创建
//    第一步：引入aop依赖
//    第二步：开启组件扫描 在对应的bean文件中配置
//    第三步：创建类，在类上面添加创建对象注解
    public void abcdef(){
        System.out.println("hello");
    }






}
