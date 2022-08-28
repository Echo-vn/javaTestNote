package com.itheima.stu02_method;
/*
判断一个数是否在一个数组中，并将结果返回到调用处
 */
public class test07 {
    public static void main(String[] args) {
        int [] arr=new int[]{123,234,456,4645,432,12,34,545,676};
        System.out.println(contains(643,arr));
    }
    public static boolean contains(int i,int arr[]){
        for(int j=0;j<arr.length;j++){
            if(arr[j]==i)
            return true;
        }
        return false;
    }
}
