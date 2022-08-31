package com.itheima.stu08_ArrayList.Test3;
//定义一个学生类
public class Student {

    private String name;
    private int age;
    //构造方法
    public Student(){};
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    //set方法
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    //get方法
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
