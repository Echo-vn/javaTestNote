package com.itheima.stu06_StringBuilder;
//StringBuilder的构造方法，常用方法
public class Demo1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        //添加
        /*sb.append("abc");
        sb.append(32);
        sb.append(11.2);*/
        sb.append("abc").append(32).append(11.2);//链式编程
        System.out.println(sb);
        //反转
        sb.reverse();
        System.out.println(sb);
        //长度
        System.out.println(sb.length());
        //转换为字符串--->toString()
        String str=sb.toString();
        System.out.println("str:"+str);
        String a=sb.append("abc").reverse().toString();
        System.out.println(a);
    }
}
