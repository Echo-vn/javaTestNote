package com.itheima.stu04_faceObject.test04_girlFriend;
//定义女朋友类，属性：姓名，年龄，性别，爱好
public class GirlFriend {
    private String name;
    private int age;
    private char gender;
    private String hobby;
    //构造方法
    public GirlFriend(){}
    public GirlFriend(String name,int age,char gender,String hobby){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.hobby=hobby;
    }
    //set方法
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public void setHobby(String hobby){
        this.hobby=hobby;
    }
    // get方法
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public String getHobby(){
        return hobby;
    }

}
