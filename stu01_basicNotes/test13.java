package com.itheima.stu01_basicNotes;
/*
已知一个数组内的元素为{33，5，22，44，55}，求出数组元素的最大值并打印
 */
public class test13 {
    public static void main(String[] args) {
        int []arr={33,5,22,44,55};
        int result=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>result){
                result=arr[i];
            }
        }
        System.out.println(result);
    }
}
