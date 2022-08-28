package com.itheima.stu04_faceObject;

public class Test03_user {
    //属性
    private String name;
    private String password;
    private String email;
    private String gender;
    private int age;
    //构造方法
    public Test03_user(){}//空参构造函数
    public Test03_user(String name,String password,String email,String gender,int age){
        this.name=name;
        this.password=password;
        this.email=email;
        this.gender=gender;
        this.age=age;
    }//带全部参数的构造函数
    //set方法
    public void setName(String name){
        this.name=name;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setAge(int age){
        this.age=age;
    }
    //get方法
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public String getEmail(){
        return email;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    //其他行为方法

}
