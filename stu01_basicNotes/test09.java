
package com.itheima.stu01_basicNotes;
/*
    题目：逢7必过
    规则：跳过 含7 和 7的倍数
        使用程序打印出1~100之间满足 逢7必过 规则的数字
 */
public class test09 {
    public static void main(String[] args) {
        /*int flag=0;
        int count=0;
        while(flag<100) {
            flag++;
            if (flag % 7==0 || flag/10==7 ||flag%10==7) {
                System.out.print("过\t");
            } else {
                System.out.print(flag+"\t");
            }
            count++;
            if (count%10==0){
                System.out.println();
            }
        }

         */
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {     //分别获取 个位是7，十位是7，7的倍数
                System.out.print("过\t");
                continue;
            }
            System.out.print(i + "\t");
        }
    }

}

