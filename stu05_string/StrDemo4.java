package com.itheima.stu05_string;

import java.util.Scanner;

//定义一个方法，实现字符串反转
public class StrDemo4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        System.out.println(reverseStr(str));
    }
    public static String reverseStr(String s){
        /*char [] reverse=new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char chs=s.charAt(i);
            reverse[s.length()-i-1]=chs;
        }
       String str=new String(reverse);
        return str;*/
        //优化代码如下
        String str="";
        for (int i = s.length()-1; i >= 0; i--) {
            char chs=s.charAt(i);
            str=str+chs;
        }
        return str;
    }
}
