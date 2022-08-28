package com.itheima.stu01_basicNotes;
/*
求n的阶乘
 */
import java.util.Scanner;
public class test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要求阶乘的整数：");
        int n = sc.nextInt();
        int sum=1;
        if(n>=1){
            for(int i=n;i>0;i--){
                sum=sum*i;
            }
            System.out.println(n+"的阶乘为"+sum);
        }
        else
            System.out.println("你输入的不是一个正整数！");




    }
}
