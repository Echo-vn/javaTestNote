package com.itheima.stu02_method;
/*
设计一个方法求出数组的最大值，并将最大值返回
 */
public class test06 {
    public static void main(String[] args) {
        int[] arr={13,34,45,76,43,45,67};
        System.out.println(maxArr(arr));
    }
    public static int maxArr(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
