package com.wangkefan.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
//    数组类型属性
    private String[] courses;
    //    list类型的属性
    private List <String> list;
    //    map类型的属性
    private Map <String,String> map;

    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    //    set类型属性
    private Set <String> sets;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
    public void show(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(map);
        System.out.println(sets);
        System.out.println(courseList);
    }
}
