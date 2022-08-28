package com.itheima.stu05_string;
//键盘录入一个字符串，统计其中的大写字符，小写字符，数字
import java.util.Scanner;
public class StrDemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        int bigCount=0;
        int smallCount=0;
        int numCount=0;
        for (int i = 0; i < str.length(); i++) {
            char chs=str.charAt(i);
            if(chs>='A'&&chs<='Z'){
                bigCount++;
            }else if(chs>='a'&&chs<='z'){
                smallCount++;
            }else if (chs>='0'&&chs<='9'){
                numCount++;
            }
        }
        System.out.printf("大写字母有%s个\n",bigCount);
        System.out.printf("小写字母有%s个\n",smallCount);
        System.out.printf("数字有%s个\n",numCount);
    }
}
