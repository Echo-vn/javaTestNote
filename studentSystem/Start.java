package com.itheima.studentSystem;
import java.util.ArrayList;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
        ArrayList<Student> lst=new ArrayList<>();
        //给循环起名，为了可以在任何位置将其跳出
        loop:while (true) {
                System.out.println("-------------学生信息管理系统------------------");
                System.out.println("\t\t\t1、添加学生信息\t\t\t\t\t\t");
                System.out.println("\t\t\t2、删除学生信息\t\t\t\t\t\t");
                System.out.println("\t\t\t3、修改学生信息\t\t\t\t\t\t");
                System.out.println("\t\t\t4、查询学生信息\t\t\t\t\t\t");
                System.out.println("\t\t\t0、退出系统\t\t\t\t\t\t\t\t");
                System.out.println("---------------------------------------------");
                Scanner sc=new Scanner(System.in);
                System.out.println("请选择业务：");
                String choose=sc.next();
                switch(choose){
                    case "1"-> addStudent(lst);
                    case "2"-> deleteStudent(lst);
                    case "3"-> updateStudent(lst);
                    case "4"-> showStudent(lst);
                    case "0"->{
                        System.out.println("正在退出系统......");
                        break loop;//跳出特定的循环
                    }
                    default-> System.out.println("没有这个选项");
                }

            }
        }
    //添加学生对象
    public static void addStudent(ArrayList<Student>lst){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入ID：");
        String id=sc.next();
        for (int i = 0; i < lst.size(); i++) {
            if(lst.get(i).getId().equals(id)){
                System.out.println("添加失败，该id已存在");
                return;
            }
        }
        System.out.println("请输入姓名：");
        String name=sc.next();
        System.out.println("请输入住址：");
        String address=sc.next();
        Student stu=new Student(id,name,address);
        lst.add(stu);
        System.out.println("信息录入成功");
        return ;
    }
    //删除学生信息
    public static void deleteStudent(ArrayList<Student>lst){
        //id存在删除，id不存在，需要提示不存在，并回到初始菜单
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入id");
        String id=sc.next();
        for (int i = 0; i < lst.size(); i++) {
            if(lst.get(i).getId().equals(id)){
               lst.remove(i);//跟据索引删除集合元素
                System.out.println("信息删除完毕");
                return;
            }
        }
        System.out.println("删除失败，没有该id");
        return;
    }
    //修改学生信息
    public static void updateStudent(ArrayList<Student>lst){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入id：");
        String id =sc.next();
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getId().equals(id)){
                System.out.println("请修改id：");
                String newId=sc.next();
                lst.get(i).setId(newId);
                System.out.println("请修改姓名：");
                String newName=sc.next();
                lst.get(i).setName(newName);
                System.out.println("请修改住址：");
                String newAddress=sc.next();
                lst.get(i).setAddress(newAddress);
                System.out.println("数据修改完毕");
            }
        }

    }
    //查询信息
    public static void showStudent(ArrayList<Student> lst){
        /*打印所有的学生信息，需要满足以下要求
                1、如果没有学生信息，提示：当前无学生信息，请添加后再查询
                2、如果有学生信息，需要按照以下格式输出。*/
        if(lst.size()==0){
            System.out.println("当前无学生信息，请添加之后再查询");
            return;
        }else {
            System.out.println("-----------------查看学生信息----------------");
            System.out.println("ID\t\t\t姓名\t\t\t家庭地址");
                 for (int i = 0; i < lst.size(); i++) {
                     System.out.print(lst.get(i).getId()+"\t\t");
                     System.out.print(lst.get(i).getName()+"\t\t");
                     System.out.print(lst.get(i).getAddress()+"\n");
                 }
            System.out.println("---------------------------------------------");
            return;
        }

}
}
