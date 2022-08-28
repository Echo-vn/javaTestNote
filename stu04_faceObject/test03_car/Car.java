package com.itheima.stu04_faceObject.test03_car;

//定义数组对象
//  属性：品牌，价格，颜色
public class Car {
    private String brand;
    private int price;
    private String color;

    public Car(){}
    public Car(String brand,int price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }
    //定义set方法和get方法
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
}
