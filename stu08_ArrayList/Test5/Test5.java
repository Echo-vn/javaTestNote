package com.itheima.stu08_ArrayList.Test5;

import java.util.ArrayList;

//定义一个集合，存入三个手机对象，定义一个方法，将价格低于3000的手机信息返回
public class Test5 {
    public static void main(String[] args) {
        //定义集合
        ArrayList<Phone> lst=new ArrayList<>();
        //创建手机对象
        Phone p1=new Phone("小米",1000);
        Phone p2=new Phone("苹果",8000);
        Phone p3=new Phone("锤子",2999);
        //将对象存入集合中
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        //将价格低于3000的手机信息返回
        String s=exclude(lst);
        System.out.println(s);
    }
    //定义一个将价格低于3000的手机的信息返回的方法
    public static String exclude(ArrayList<Phone> lst){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < lst.size(); i++) {
            if(lst.get(i).getPrice()<3000){
              sb.append("["+lst.get(i).getBrand()+":"+lst.get(i).getPrice()+"]"+"\t");
            }
        }
        String str=sb.toString();
        return str;
    }

}
