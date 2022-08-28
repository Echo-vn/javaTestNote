package com.itheima.stu01_basicNotes;

import java.util.Random;
import java.util.Scanner;

/*
题目：猜随机数
      让程序产生一个 1~100 的随机数，让用户来猜
 */
public class demo_Random {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random r = new Random();
        int rnum = r.nextInt(100)+1;
        int count =0;       //給游戏增加一个保底，达到一定次数之后便强行猜中

        while(true){    //直到猜对为止
            if(count==5){
                System.out.println("Congratulations! you are right.");
            }
            System.out.println("请写下你猜的数字：");
            int guess = sc.nextInt();
            if (guess == rnum) {
                System.out.println("You are right!");
                break;
            } else if (guess < rnum) {
                System.out.println("Sorry,your guess is too small,again!");
                count++;
                continue;
            } else {
                System.out.println("Sorry,your guess is too big,again!");
                count++;
                continue;
            }
        }
    }
}
