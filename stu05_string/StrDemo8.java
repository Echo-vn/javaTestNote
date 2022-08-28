package com.itheima.stu05_string;
//敏感词屏蔽
public class StrDemo8 {
    public static void main(String[] args) {
        //定义敏感词库
        String arr[]={"tmd","cnm"};
        String talk="你玩的真好，下次别tmd玩了，cnm";
        for (int i = 0; i < arr.length; i++) {
            talk=talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
