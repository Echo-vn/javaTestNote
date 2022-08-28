package com.itheima.stu03_testComprehensive;

import java.util.Scanner;

/*
需求：数字解密
        针对test06加密后的数字进行解密，输出解密后的数字
 */
public class test07_decryptNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入加密后的数字：");
        int password = sc.nextInt();
        int[] dpArr = getArr(password);//decryptPasswordArr
        decrypt(dpArr);//对arr中的数据解密
        System.out.println("解密后的数字为：" + getResult(dpArr));//输出加密后的数字

    }

    private static void decrypt(int[] arr) {
        //1、倒序的逆推
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j - i];
            arr[j - i] = temp;
        }
        //2、 对10取余过的数子，逆推
            /*分析：（1）原数据（0~9）+5后的范围是（5，6，7，8，9，10，11，12，13，14）
                (2）对10取余之后的结果是（5，6，7，8，9， 0，1，2，3，4）
               （3）因此这一步解密时要加个判断：5~9逆推之后还是本身，0~4逆推时要+10
             */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5 && arr[i] <= 9) {
                arr[i] = arr[i];
            } else {
                arr[i] = arr[i] + 10;
            }
        }
        //3、+5操作的逆推，-5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }

    }

    private static int getLength(int password) {
        int length = 0;
        int temp = password;
        while (temp != 0) {
            temp = temp / 10;
            length++;
        }
        System.out.println("length:" + length);
        return length;
    }//1、计算这个数字的位数，即为数组的长度length

    private static int[] getArr(int password) {
        int arrLength = getLength(password);
        int[] tempArr = new int[arrLength];
        int temp = password;//为了不改变password的值，便用临时变量temp来纪录password
        for (int i = arrLength - 1; i >= 0; i--) {
            int ge = temp % 10;
            tempArr[i] = ge;
            temp = temp / 10;
        }
        return tempArr;
    } //2、将输入的数字的每一位放到数组中

    private static int getResult(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        //System.out.println("加密后的数字为"+num);
        return num;
    }//4、返回最终结果num
}



