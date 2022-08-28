package com.itheima.stu01_basicNotes;

import java.util.Scanner;

/*
求1~100的偶数和
 */
public class demo_EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1~100的数字：");
        int num=sc.nextInt();
        int count=0;    //count用来保存偶数
        for(int i=num;i>0;i--){
            if(i%2==0)
               count=count+i;
        }
        System.out.println(num+"以内的偶数和为"+count);

    }
}
