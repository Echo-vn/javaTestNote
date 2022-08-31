package com.itheima.stu08_ArrayList.Test3;
//创建一个集合，键盘录入几个学生类对象，遍历
import java.util.ArrayList;
import java.util.Scanner;

public class Tese3 {
    public static void main(String[] args) {
       /* ArrayList<Student> lst=new ArrayList<>();
        lst.add(new Student("小迷糊",23));
        lst.add(new Student("小诗诗",20));
        lst.add(new Student("大聪明",24));*/
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> lst=new ArrayList<>();
        while(true){
            Student stu=new Student();
            System.out.println("请输入姓名：");
            String name=sc.next();
            stu.setName(name);
            System.out.println("请输入年龄：");
            int age= sc.nextInt();
            stu.setAge(age);
            //将对象添加到集合中
            lst.add(stu);
            //循环结束条件
            System.out.println("信息录入完成，还需要继续吗（y/n）：");
            char c=sc.next().charAt(0);
            if(c=='y'){
                continue;
            }else if(c=='n'){
                break;
            }
        }
        //遍历输出
        show(lst);
    }

    private static void show(ArrayList<Student> lst) {
        System.out.print("[");
        for (int i = 0; i < lst.size(); i++) {
            if(i>=0&&i< lst.size()-1){
                System.out.print(lst.get(i).getName()+":"+ lst.get(i).getAge()+", ");
            }else{
                System.out.println(lst.get(i).getName()+":"+ lst.get(i).getAge()+"]");
            }
        }
    }
}
