package com.itheima.stu08_ArrayList.Test4;
//在main方法中定义一个集合，存入三个用户对象。
//要求：定义一个方法，跟据id查找对应的用户信息（存在，返回true，不存在，返回false）
import java.util.ArrayList;
public class Test4 {
    public static void main(String[] args) {
        //定义集合
        ArrayList<User> lst=new ArrayList<>();
        //创建对象
        User u1=new User("a001","yc001","qaz123");
        User u2=new User("a002","yc002","qaz234");
        User u3=new User("a003","yc003","qaz345");
        //添加到集合中
        lst.add(u1);
        lst.add(u2);
        lst.add(u3);
        //查看id是否存在
        boolean result= contains(lst,"a004");
        System.out.println(result);

    }
    public static boolean contains(ArrayList<User> lst, String id){
        //遍历集合，将其元素的id，与传入的id进行字符串的比对
        for (int i = 0; i < lst.size(); i++) {
            if(lst.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }

}
