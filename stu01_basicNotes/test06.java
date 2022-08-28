package com.itheima.stu01_basicNotes;
/*
    while练习：已知珠穆朗玛峰的高度为8844.43米，即8844430毫米。
    有一张无限大的纸，其厚度为0.1毫米，请问要对折多少次才可以达到珠穆朗玛峰的高度？
 */
public class test06 {
    public static void main(String[] args) {
        double height=8844430L;
        int count=0;
        double paper = 0.1f;//初始化
        while(paper<height){
            paper*=2;
            count++;
        }
        System.out.println("一共需要对折"+count+"次");


    }
}
