package com.itheima.stu01_basicNotes;
/*
用while语句打印1~100
 */
public class demo_While {
    public static void main(String[] args) {
        int count=0;    //此变量用来控制输出结果换行的时机
        int i=1;    //初始化i的值
        while(i<=100){
            System.out.print(i+"\t");
            i++;
            count++;
            if (count%10==0)
                System.out.println();
        }
    }
}
