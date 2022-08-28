package com.itheima.stu05_string;
//定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回
//eg: 输入：int[]arr={1,2,3};     输出为：[1,2,3]
public class StrDemo3 {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        System.out.println(getStr(arr));

    }
    public static String getStr(int[]arr) {

        if (arr == null) {
            return "";
        } else if (arr.length == 0) {
            return "[]";
        } else {
            String str="[";
            for (int i = 0; i < arr.length; i++) {
                if(i>=0&&i<arr.length-1){
                    str=str+arr[i]+", ";
                }else if(i==arr.length-1){
                    str=str+arr[i]+"]";
                }

            }
            return str;
        }

    }


}
