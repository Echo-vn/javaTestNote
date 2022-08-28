package com.itheima.stu01_basicNotes;
/*
##题目：回文数
        输入一个数x，判断它是不是一个回文数，如果是，则输出true，否则输出false。
        （回文数，即正序的逆序都是同一个数字）
        eg：121，12321，
 */
import java.util.Scanner;
public class test07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int x =sc.nextInt();
        int temp = x;   //定义一个临时变量temp，用来记录x的初始值。
        int num=0;  //num用来表示整数x的逆序
        while(x>0){
            int a = x % 10;   //a用来获取x的每一位数字
            num=num*10+a;
            x=x/10;
        }

        System.out.println(num==temp); //比较获取到的num和x是否相同
    }
}
