package com.itheima.stu04_faceObject.test05_phone;

import java.util.Scanner;

public class TestPhone {
    public static void main(String[] args) {
        //1、定义数组
        Phone[] pArr = new Phone[3];
        //2、创建对象并将其存储到数组中
        Scanner sc = new Scanner(System.in);//声明Scanner的对象sc
        for (int i = 0; i < pArr.length; i++) {
            //创建对象并设置属性
            Phone p = new Phone();
            System.out.println("请输入手机品牌：");
            String brand = sc.next();
            p.setBrand(brand);
            System.out.println("请输入价格：");
            int price = sc.nextInt();
            p.setprice(price);
            System.out.println("请输入颜色：");
            String color = sc.next();
            p.setColor(color);
            //存入数组
            pArr[i] = p;
        }
        //3、遍历数组，输出元素
        for (int i = 0; i < pArr.length; i++) {
            System.out.println(
                    "品牌：" + pArr[i].getBrand() + "\t\t"
                            +"价格：" + pArr[i].getPrice() + "\t\t"
                            +"颜色：" + pArr[i].getColor()
            );
        }
        //4、求出三部手机的平均值
        //求和
        int sum = 0;
        for (int i = 0; i < pArr.length; i++) {
            sum = sum + pArr[i].getPrice();
        }
        //求平均值
        int average = sum / pArr.length;
        System.out.println("三部手机的平均值为：" + average);
    }
}
