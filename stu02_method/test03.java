package com.itheima.stu02_method;
    /*
    定义方法，比较两个长方形的面积
     */

public class test03 {
    public static void main(String[] args) {
        double rectangle1=getArea(12.5,34.1);
        double rectangle2=getArea(15.6,23.4);
        compare(rectangle1,rectangle2);
    }

    //定义方法求出长方形面积
    public static double getArea(double length,double width){
        double area = length*width;
        return area;
    }
    //比较两个面积大小的方法
    public static void compare(double area1,double area2){
        if(area1>area2){
            System.out.println("第一个长方形面积大");
        }else if(area1<area2){
            System.out.println("两个长方形面积一样大");
        }else{
            System.out.println("第二个长方形面积大");
        }
    }
}
