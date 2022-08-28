package com.itheima.stu04_faceObject.test03_car;

import java.util.Scanner;

//定义一个数组，存储3部汽车对象
//创建三个汽车对象，数据从键盘录入而来
public class CarTest {
    public static void main(String[] args) {
        //定义一个数组
        Car[] carArr = new Car[3];
        //创建对象,并键入属性，然后保存到数组中
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=2;i++){
            Car c = new Car();
            System.out.println("请输入汽车品牌：");
            String brand=sc.next();
            c.setBrand(brand);
            System.out.println("请输入价格：");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入颜色：");
            String color=sc.next();
            c.setColor(color);
            //存入数组
            carArr[i]=c;
        }
        //输出数组元素的信息
        for (int i = 0; i < carArr.length; i++) {
            System.out.println(
                            "品牌：" + carArr[i].getBrand()+"\t\t" +
                            "价格：" + carArr[i].getPrice()+"\t\t" +
                            "颜色：" + carArr[i].getColor());
        }
    }
}
