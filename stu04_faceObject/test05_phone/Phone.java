package com.itheima.stu04_faceObject.test05_phone;
//定义手机类对象，属性包含 品牌，价格，颜色
public class Phone {
    private String brand;
    private int price;
    private String color;
    //构造方法
    public Phone(){}
    public Phone(String brand,int price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }
    //set方法
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setprice(int price){
        this.price=price;
    }
    public void setColor(String color){
        this.color=color;
    }
    //get方法
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }


}
