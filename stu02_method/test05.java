package com.itheima.stu02_method;
/*
     设计一个方法用于数组遍历，要求遍历结果是在同一行上的
     例如：[11,22,33,44,55]
 */
public class test05 {
    public static void main(String[] args) {
        int [] arr=new int[]{11,22,33,44,55};

        traverseArr(arr);

    }
    public static void traverseArr(int arr[]){
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            if(i==arr.length-1) {
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]\n");
    }
}
