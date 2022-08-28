package com.itheima.stu01_basicNotes;

import java.util.Scanner;

/*
键盘录入两个数字，确定一个范围，统计出这个范围内既能被3整除，又能被5整除的数字
 */
public class test05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入范围下限：");
        int min = sc.nextInt();
        System.out.println("请输入范围上限：");
        int max = sc.nextInt();
        for(int i=min;i<max;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i+"\t");    //输出不换行。此时的制表符应该加双引号，单引号输出结果会出错
            }
        }
    }
}
