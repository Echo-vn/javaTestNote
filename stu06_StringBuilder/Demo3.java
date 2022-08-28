package com.itheima.stu06_StringBuilder;

import java.util.StringJoiner;

//定义一个方法，把int数组中的数据2按照指定格式拼接成一个字符串返回。
//eg：int[]arr{1,2,3}------->输出：[1, 2, 3]
public class Demo3 {
   /* public static void main(String[] args) {
        int[]arr={1,2,3};
        System.out.println(getString(arr));
    }
    public static String getString(int[]arr){
        StringBuilder sb=new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return  sb.toString();
    }*/
    //用StringJoiner更加方便
   public static void main(String[] args) {
       int[]arr={1,2,3,4,5};
       StringJoiner sj=new StringJoiner(", ","[","]");
       for (int i = 0; i < arr.length; i++) {
           sj.add(""+arr[i]);
       }
       String str=sj.toString();
       System.out.println(str);
   }
}
