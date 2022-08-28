package com.itheima.stu01_basicNotes;

import java.util.Scanner;

/*定义一个数组，用来存放5位学生的身高，由用户将该信息保存到数组中，
最后再打印出数组中的每一个元素
 */
public class demo_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double [] arrH=new double[5];
        for(int i=1;i<=arrH.length;i++){
            System.out.println("请录入第"+i+"个学生的身高：");
            double height=sc.nextInt();
            arrH[i-1]=height;
        }
        for(int j=1;j<=arrH.length;j++){
            System.out.println("第"+j+"个同学的身高为"+arrH[j-1]);
        }

    }
}
