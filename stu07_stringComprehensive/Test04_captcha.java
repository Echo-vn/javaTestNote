package com.itheima.stu07_stringComprehensive;
//随机生成一个验证码
/*
要求：1、验证码长5位
     2、内容是4位字母一位数字
     3、字母大小写随机
     4、数字可以出现在任何位置
 */
import java.util.Random;
public class Test04_captcha {
    public static void main(String[] args) {
        //定义一个空数组，长度为5，用来接收验证码
        char[] arr=new char[5];
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chArr=str.toCharArray();
        char[] numArr={'0','1','2','3','4','5','6','7','8','9'};
        //得到验证码
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int chIndex=r.nextInt(chArr.length);
            arr[i]=chArr[chIndex];
        }
        int numIndex=r.nextInt(numArr.length);
        arr[r.nextInt(arr.length)]=numArr[numIndex];
        String captcha=new String(arr);
        System.out.println(captcha);

    }
}
