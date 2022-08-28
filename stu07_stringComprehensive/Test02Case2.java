package com.itheima.stu07_stringComprehensive;

public class Test02Case2 {
    public static void main(String[] args) {
        String str1="abcde";
        String str2="cdeab";
        System.out.println( check(str1,str2));;


    }
    public static boolean check(String str1,String str2){
        int count=1;
        while(count<=str1.length()){
            str1=rotateStr(str1);
            if(str2.equals(str1)){
                return true;
            }
            count++;
        }
        return false;
    }//循环对比，返回结果
    public static String rotateStr(String str){
        /*char[]arr=new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i]=str.charAt(i);
        }*/
        char[]arr=str.toCharArray();//将字符串转换为字符数组
        //操作字符串
        char temp=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(i>=0&&i<arr.length-1){
                arr[i]=arr[i+1];
            }else if(i==arr.length-1){
                arr[i]=temp;
            }
        }
        return new String(arr);
    }//字符串旋转
}
