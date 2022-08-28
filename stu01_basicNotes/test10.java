package com.itheima.stu01_basicNotes;
/*
    从键盘输入一个大于等于2的整数，求出其平方根。
    结果要求保留整数
 */
import java.util.Scanner;
public class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个不小于2的整数：");
        int num = sc.nextInt();
        int temp=1;     //temp为平方根
        while(true){
            int result1 = temp*temp;
            int result2=(temp+1)*(temp+1);
            if (result1<num && result2>num || result1==num){
                System.out.println(num+"的平方根是"+temp);
                break;
            }else{
                ++temp;
                continue;
            }
        }


    }
}
