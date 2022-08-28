package com.itheima.stu01_basicNotes;
/*
定义一个数组，存储1，2，3，4，5，6，7，8，9，10
        遍历数组，如果是偶数，将其除以2，如果是奇数，将其扩大两倍

 */
public class test12 {
    public static void main (String[] args){
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i] /=2;
                //System.out.println(arr[i]);
            }else{
                arr[i] *=2;
                //System.out.println(arr[i]);
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+"\t");
        }
    }
}

