package com.itheima.stu04_faceObject.test02_goods;
//创建商品对象
    //属性：商品ID，名字，价格，库存
public class GoodsRole {
    //1、定义商品属性
    private String id;
    private String name;
    private double price;
    private int inventory;
    //2、定义构造函数
    public GoodsRole(){}
    public GoodsRole(String id,String name,double price,int inventory){
        this.id=id;
        this.name=name;
        this.price=price;
        this.inventory=inventory;
    }
    //3、定义set/get方法
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void setInventory(int inventory){
        this.inventory=inventory;
    }
    public int getInventory(){
        return inventory;
    }

}
