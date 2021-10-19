package com.wangkefan.spring5.zhujie.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
@Repository
public class PropertiesInfomation  implements PropertiesInfo{
    @Override
    public void add() {
        System.out.println("properties add");
    }

}
