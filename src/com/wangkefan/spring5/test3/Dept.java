package com.wangkefan.spring5.test3;

public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }
    public void showdept(){
        System.out.println("the dept is" + " " + dname);
    }
}
