package com.itheima.stu05_string;
//号码屏蔽：
// eg：13122229876--->131****9876
public class StrDemo6 {
    public static void main(String[] args) {
        String phoneNum="13122229876";
        String hendNum=phoneNum.substring(0,3);
        String endNum=phoneNum.substring(7);
        String newNum=hendNum+"****"+endNum;
        System.out.println(newNum);
    }
}
