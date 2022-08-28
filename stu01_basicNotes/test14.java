package com.itheima.stu01_basicNotes;
/*
        生成10个1~100之间的随机数，将他们存入数组中，
        1、求出这十个数字的和，
        2、求出它们的平均数
        3、统计出有多少个数字比平均值小
 */
import java.util.Random;
public class test14 {
    public static void main(String[] args){
        Random r = new Random();
        int [] arr=new int[10];
        int sum =0; //记录总和
        int count=0;    //记录比平均值小的数字的个数
        for(int i=0;i<arr.length;i++){      //此循环将随机数存入数组arr中
            int num=r.nextInt(100)+1;
            arr[i]=num;
            System.out.print(arr[i]+"\t");
        }
        System.out.println();   //换行
        for(int j=0;j<arr.length;j++){   //此循环用来求和
            sum += arr[j];
        }
        int average = sum/arr.length;
        System.out.println("平均值是："+average);
        for(int k=0;k<arr.length;k++){  //此循环记录比average小的值的个数
            if(arr[k]<average)
                count++;
        }
        System.out.println("比平均值小的数字有"+count+"个");
    }
}
