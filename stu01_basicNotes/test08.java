package com.itheima.stu01_basicNotes;

import java.util.Scanner;

/*
题目：商和余数
        给定两个整数，作为被除数和除数（大小不超过int的范围）
        将两数相除，得到商和余数（要求不能用 除法，乘法 和 %运算符）
 */
public class test08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入被除数：");
        int num1=sc.nextInt();
        System.out.println("请输入除数：");
        int num2=sc.nextInt();
        int count =0;   //count 为商
        while(num1>=num2){
            num1=num1-num2;
            count++;
        }
        System.out.println("商为"+count);
        System.out.println("余数为"+num1);
    }
}
