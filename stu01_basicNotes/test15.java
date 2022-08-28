package com.itheima.stu01_basicNotes;
/*
定义一个数组，存入1，2，3，4，5
按照要求将元素交换索引对应的元素
交换前：1，2，3，4，5
交换后：5，2，3，4，1
 */
public class test15 {
    public static void main(String[] args){
        int [] arr=new int[]{1,2,3,4,5};
        /*
        int temp=arr[0];   //此变量作为交换元素得到中间变量
        arr[0]=arr[4];
        arr[4]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        */
/*
扩展：将所有元素左右互换
思路：定义变量i，记录左边元素的索引。定义变量j，记录右边元素的索引。由循环来依次宛城交换操作
      每循环一次，进行i++，j--，
 */
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
