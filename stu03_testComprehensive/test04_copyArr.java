package com.itheima.stu03_testComprehensive;
/*
    需求：将一个数组中的元素复制到一个新数组当中
 */
/*
  思路： 1、创建一个数组arr
        2、创建一个新数组newArr用来接收arr中的元素，长度为arr.length
        3、遍历arr，获取到每一个元素
        4、将newArr[j]=arr[i]
        5、遍历输出newArr中的元素
 */
public class test04_copyArr {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6};
        int[] newArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        for(int j=0;j<newArr.length;j++){
            System.out.print(newArr[j]+" ");
        }
    }

}
