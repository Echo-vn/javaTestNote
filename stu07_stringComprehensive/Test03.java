package com.itheima.stu07_stringComprehensive;
//键盘录入一个字符串，打乱里面的内容
import java.util.Scanner;
import java.util.Random;
public class Test03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        //将字符串转换为数组进行操作
        char[]arr=str.toCharArray();
        //打乱操作，从0索引开始与一个随机索引对应的元素交换位置
        Random r=new Random();

        for (int i = 0; i < arr.length; i++) {
            char temp;
            int tempIndex=r.nextInt(arr.length);
            temp=arr[i];
            arr[i]=arr[tempIndex];
            arr[tempIndex]=temp;
        }
        //操作完成，再将字符数组转换成字符串
        String newString=new String(arr);
        System.out.println(newString);
    }
}
