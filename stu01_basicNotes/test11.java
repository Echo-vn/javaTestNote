package com.itheima.stu01_basicNotes;

import java.util.Scanner;

/*
    从键盘输入一个数字，判断其是 质数 还是 合数
 */
public class test11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();
        /*
        for(int i=1;i<=num;i++){
            int result =num%i;
                 //1、被1整除，结果为本身    2、被自身整除，结果为1   3、被大于1且小于自身的数整除便不是质数
            if(result==0 && i<num ){
                System.out.println("该数字不是个质数,是合数");
                break;
            }else{
                System.out.println("该数字是一个质数");
                break;
            }
        }
        */
        /*
        以下是老师的代码，这里用了一个标记，让它来决定质数与否，使思路更加明确
         */
        boolean flag=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=false;
                break;
            }
        }
        if (flag){      //这里我括号里用了 flag=true，发现结果错误，原来是将true又赋值给了flag，因此改变了结果
            System.out.println("它是一个质数");
        }else{
            System.out.println("它是一个合数");
        }
    }
}
