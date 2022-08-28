package com.itheima.stu05_string;
//跟据身份证号，获取其信息（出生日期，性别）
public class StrDemo7 {
    public static void main(String[] args) {
        String id="6222326199909063459";
        String year=id.substring(7,11);
        String month=id.substring(11,13);
        String day=id.substring(13,15);
        String g=id.substring(17,18);
        System.out.println("出生日期:"+year+"年"+month+"月"+day+"日");
        char gender=id.charAt(18);
        //直接用字符对2取余，结果可以对照ASCII码表
        int flag=gender%2;//字符与整数运算时，相当于其ASCII表中对应的数字参加运算
        if(flag==0){
            System.out.println("性别：女");
        }else if(flag==1){
            System.out.println("性别：男");
        }
        System.out.println('a'+0);


    }
}
