package com.wangkefan.spring5.factoryBean;

import com.wangkefan.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean  implements FactoryBean {

    //   定义返回的bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCourseName("american");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
