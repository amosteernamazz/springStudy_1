package com.wangkefan.spring5.test1;


// 类的定义
public class User {


    private String userName;
    private String nullshow;
    private String showElement_1;
    private String showElement_2;

    public void setShowElement_1(String showElement_1) {
        this.showElement_1 = showElement_1;
    }

    public void setShowElement_2(String showElement_2) {
        this.showElement_2 = showElement_2;
    }

    public void setNullshow(String nullshow) {
        this.nullshow = nullshow;
    }

    private int userAge;

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
 public User(){

 }

    public void show(){
        System.out.println(userName);
        System.out.println(userAge);
    }

    public void show_2(){
        System.out.println(userName);
        System.out.println(userAge);
    }
    public void show_3(){
        System.out.println(nullshow);
        System.out.println(showElement_1);
        System.out.println(showElement_2);
    }
    public void add(){
        System.out.println("add");
    }


}
