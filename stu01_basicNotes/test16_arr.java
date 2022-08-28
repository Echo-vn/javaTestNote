package com.itheima.stu01_basicNotes;
/*
定义一个数组，里面的元素有1，2，3，4，5。将里面的元素随机打乱并且打印出来
 */
import java.util.Random;
public class test16_arr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Random r=new Random();
        int randomIndex=r.nextInt(arr.length);
        for(int i=0;i<arr.length;i++){  //打乱数组中的元素
            int temp=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
