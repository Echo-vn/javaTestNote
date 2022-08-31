package com.itheima.studentSystem;
//用户类:用户名，密码，身份证号码，手机号码
public class User {
    private String userNmae;
    private String password;
    private String userId;
    private String phoneNum;
    //构造
    public User (){};
    public User (String UserName,String password,String userId,String phoneNum){
        this.userNmae=UserName;
        this.password=password;
        this.userId=userId;
        this.phoneNum=phoneNum;
    }
    //set方法
    public void setUserNmae(String userName){
        this.userNmae=userName;
    }
    public void setPassword(String passward){
        this.password=passward;
    }
    public void setUserId(String id){
        this.userId=userId;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum=phoneNum;
    }
    //get方法

    public String getUserNmae() {
        return userNmae;
    }

    public String getPassword() {
        return password;
    }

    public String getUserId() {
        return userId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
}

