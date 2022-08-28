package com.itheima.stu01_basicNotes;

import java.util.Scanner;

/*
题目：电影院选票
      某电影院售卖了100张票，票的序号为1--100；
      其中奇数票号坐左侧，偶数票号坐右侧。
      键盘录入一个整数表示电影票的序号。
      跟据不同的序号，给出不同的提示；
      如果是奇数，打印坐左边，如果是偶数，打印坐右边
 */

public class demo_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电影票的序号：");
        int ticket = sc.nextInt();
        if(ticket%2==1){
            if(ticket>0&&ticket<100)
            System.out.println("请坐左边！");
        } else{
            if(ticket>0&&ticket<100)
            System.out.println("请坐右边！");
        }


    }
}
