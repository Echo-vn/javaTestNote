package com.itheima.stu02_method;
/*
题目：使用方法重载的思想，设计一个能比较两个整数是否相同的方法
需求：要求兼容所有整数类型(byte,short,int,long)
 */
public class test04 {
    public static void main(String[] args) {
        compare(112345,1991243254);

    }
    public static void compare(byte b1,byte b2 ){
        System.out.println(b1==b2);
    }
    public static void compare(short s1,short s2 ){
        System.out.println(s1==s2);
    }
    public static void compare(int i1,int i2 ){
        System.out.println(i1==i2);
    }
    public static void compare(long n1,long n2 ){
        System.out.println(n1==n2);
    }

}



