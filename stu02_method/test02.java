package com.itheima.stu02_method;
/*
定义一个方法，求出圆的面积
 */
public class test02 {
    public static void main(String[] args) {
        circleArea(13);
    }

    public static void circleArea(double r) {
        double s=3.14*r*r;
        System.out.println("圆的面积为"+s);
    }
}
