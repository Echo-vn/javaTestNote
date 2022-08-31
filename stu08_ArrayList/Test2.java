package com.itheima.stu08_ArrayList;

import java.util.ArrayList;
import java.util.StringJoiner;

//添加整数并遍历成Test1的格式
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
           if(i>=0&&i<list.size()-1){
               System.out.print(list.get(i)+",");
           }else{
               System.out.println(list.get(i)+"]");
           }
        }
    }
}
