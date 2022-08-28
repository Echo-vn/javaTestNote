package com.itheima.stu01_basicNotes;

/*
题目：断线重连业务
    某游戏在掉线时会触发重连，设计一个循环结构，最多进行5次重连，并显示此时是第几次重连。
 */
public class demo_for {
    public static void main(String[] args) {
        int i;
        for (i=1;i<=5;i++){
            System.out.println("正在进行第"+i+"次重连。。。。");
        }
    }
}

