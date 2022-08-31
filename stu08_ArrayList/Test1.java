package com.itheima.stu08_ArrayList;

import java.util.ArrayList;
import java.util.StringJoiner;

//定义一个集合，添加字符串，并遍历；格式————>[a,b,c]
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        //添加字符串元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //遍历
        StringJoiner sj=new StringJoiner(",","[","]");
        for (int i = 0; i < list.size(); i++) {
            String str=list.get(i);
            sj.add(str);
        }
        String s=sj.toString();
        System.out.println(s);
    }
}
