package com.itheima.stu03_testComprehensive;

import java.util.Scanner;

/*
    题目：数字的加密和解密
          某系统的数字密码(>0),采用加密方式传输，如1980
    需求：加密方式为：
          先得到每一位数，将每一位数字+5，再对10取余，最后将结果反转，得到一串新数字
          eg：1980-->8346
 */
/*
    思路分析：1、从键盘录入一个位数任意的整数。
             2、求出其每一位上的数字，并存入数组中
             3、加密：
             5、将加密后的谁进行拼接
 */
/*
加密操作有bug：当输入的密码为12345时，加密后为9876，
 */
public class test06_encryptNum {
    public static void main(String[] args) {
        //1、键盘录入一个大于0的整数，
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入密码：");
        int password = sc.nextInt();
        int[] pwArr=getArr(password);
        encrypt(pwArr);//对arr中的数据加密
        System.out.println("加密后的数字为："+getResult(pwArr));//输出加密后的数字

    }//主函数
    private static int getLength(int password) {
        int length=0;
        int temp=password;
        while(temp!=0){
            temp=temp/10;
            length++;
        }
        System.out.println("length:"+length);
        return length;
    }//1、计算这个数字的位数，即为数组的长度length
    private static int[] getArr(int password) {
        int arrLength=getLength(password);
        int[]tempArr=new int[arrLength];
        int temp = password;//为了不改变password的值，便用临时变量temp来纪录password
        for (int i = arrLength-1; i >=0; i--) {
            int ge =temp % 10;
            tempArr[i]=ge;
            temp=temp/10;
        }
        return tempArr;
    } //2、将输入的数字的每一位放到数组中
    private static void encrypt(int[]arr) {
        //+5操作
        for (int i = 0; i <arr.length; i++) {
            arr[i]=arr[i]+5;
        }
        //对10取余
        for (int j = 0; j < arr.length; j++) {
            arr[j]=arr[j]%10;
        }
        //反转
        for (int i=0,j =arr.length-1; i <j; i++,j--) {
            int temp1=arr[i];
            arr[i]=arr[j];
            arr[j]=temp1;
        }
    }//3、加密操作
    private static int getResult(int[]arr){
        int num=0;
        for (int i = 0; i < arr.length; i++) {
        num=num*10+arr[i];
    }
        //System.out.println("加密后的数字为"+num);
        return num;
}//4、返回最终结果num
}
