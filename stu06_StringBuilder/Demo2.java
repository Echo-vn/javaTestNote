package com.itheima.stu06_StringBuilder;
//键盘接收一个字符串，由程序判断出是否对称，输出判断结果
import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        StringBuilder sb =new StringBuilder(str);
        //转换为字符串
        String str1=sb.toString();
        String str2=sb.reverse().toString();
        //比较内容，返回结果
        Boolean flag=str1.equals(str2);
        if(flag){
            System.out.println("这个字符串是对称的");
        }else{
            System.out.println("这个字符串不对称");
        }
    }
}
