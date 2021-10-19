package com.wangkefan.spring5.test3;

public class Emplo {
    private String ename;
    private String gender;
//    员工属于某一个部门
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Dept getDept() {
        return dept;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void show(){
        System.out.println(ename+" " + gender);
        System.out.println("\n");
        dept.showdept();
    }
}
