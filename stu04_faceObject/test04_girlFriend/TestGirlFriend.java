package com.itheima.stu04_faceObject.test04_girlFriend;

import java.util.Scanner;

//定义4个数组对象
/*
要求：1、计算出四个女朋友的平均年龄
      2、统计年龄比平均值低的女朋友有几个，并把她们的所有信息打印出来
 */
public class TestGirlFriend {
    public static void main(String[] args) {
        GirlFriend[] gArr=new GirlFriend[4];
        //创建对象并将其存入数组中
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < gArr.length; i++) {
            GirlFriend g=new GirlFriend();
            //设置属性
            System.out.println("请输入姓名：");
            String name=sc.next();
            g.setName(name);
            System.out.println("请输入年龄：");
            int age=sc.nextInt();
            g.setAge(age);
            System.out.println("请输入性别：");
            char gender=sc.next().charAt(0);//scanner的char类型格式
            g.setGender(gender);
            System.out.println("请输入爱好");
            String hobby=sc.next();
            g.setHobby(hobby);
            //存入数组
            gArr[i]=g;
        }
        //遍历输出各数组元素的信息
        for (int i = 0; i < gArr.length; i++) {
            System.out.println(
                    "姓名："+gArr[i].getName()+"\t"
                    +"性别："+gArr[i].getGender()+"\t"
                    +"年龄："+gArr[i].getAge()+"\t"
                    +"爱好："+gArr[i].getHobby()+"\t"
            );
        }
        //求平均年龄
            //求年龄和
        int sum=0;
        for (int i = 0; i < gArr.length; i++) {
            sum=sum+gArr[i].getAge();
        }
            //求平均值
        int average=sum/ gArr.length;
        System.out.println("平均年龄："+average);
        //统计比平均年龄低的女友个数 ,并将其所有信息输出
        int count=0;
        for (int i = 0; i < gArr.length; i++) {
            if(gArr[i].getAge()<average){
                System.out.println(
                        "姓名："+gArr[i].getName()+"\t"+
                        "性别："+gArr[i].getGender()+"\t"+
                        "年龄："+gArr[i].getAge()+"\t"+
                        "爱好："+gArr[i].getHobby()
                );
            }
        }
    }
}
