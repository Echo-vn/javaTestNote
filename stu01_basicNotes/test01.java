package com.itheima.stu01_basicNotes;
/*题目：
        从键盘录入一个三位数，将其个位，十位，百位上的数字打印输出。

 */
import java.util.Scanner;
public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();
        int a = num/100;
        int b = (num%100)/10;
        int c = (num%100)%10;
        System.out.println("百位："+a+'\n'+"十位："+b+'\n'+"各位："+c+'\n');

    }
}
