package com.itheima.stu04_faceObject.test06_student;

import java.util.Scanner;

/*
需求：定义一个长度为3的数组，数组中存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
    要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        //  添加时，若老数组已被存满，则创建一个新数组，长度为老数组长度+1，再将老数组的元素拷贝到新数组中
    要求2：添加完毕之后，遍历所有学生信息
    要求3：通过id删除学生信息。若存在，则删除，若不存在，则提示删除失败
    要求4：删除完毕之后，遍历所有学生信息
    要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
 */
public class TestStu {
    public static void main(String[] args) {
        Student[] sArr = new Student[3];
        //创建初始对象
        Student s1 = new Student(001, "小虎", 24);
        Student s2 = new Student(002, "小白", 22);
        Student s3 = new Student(003, "阿福", 23);
        //存入数组
        sArr[0] = s1;
        sArr[1] = s2;
        sArr[2] = s3;
        System.out.println("-------------初始学生信息------------------");
        show(sArr);
        System.out.println("------------------------------------------");
        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        Student s4 = new Student(004, "阿花", 23);
        //添加，并生成新数组newArr
        Student[] newArr = addElement(sArr, s4);
        //要求2：显示所有学生信息
        System.out.println("-------------添加后的学生信息------------------");
        show(newArr);
        System.out.println("------------------------------------------");

        //要求3：删除信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生信息的id：");
        int id = sc.nextInt();
        int index=getIndex(newArr,id);
        System.out.println(index);
        delete(newArr, index);
        //要求4：显示所有信息
        System.out.println("-------------删除后的学生信息------------------");
        show(newArr);
        System.out.println("------------------------------------------");

        //要求5：查询id为heima002的学生，若存在，则将其年龄+1
        System.out.println("请输入要修改的学生ID：");
        int findId = sc.nextInt();
        int modifyIndex=getIndex(newArr,findId);
        modifyAge(newArr,modifyIndex);
        //newArr[modifyIndex].setAge(newArr[modifyIndex].getAge()+1);
        System.out.println("-------------修改后的学生信息------------------");
        show(newArr);
        System.out.println("------------------------------------------");


    }

    private static Student[] addElement(Student[] sArr, Student s) {
        int count = count(sArr);
        //（1）学号的唯一性判断
        boolean flag = contains(sArr, s.getId());
        if (flag==false) {//flag的默认值为false
            if (count != sArr.length) {//数组未满
                sArr[count] = s;
                return sArr;
            } else {//数组已满
                //System.out.println("数组已满");
                Student[] newArr = new Student[count + 1];//创建新数组，长度较旧数组+1
                //拷贝旧数组
                for (int i = 0; i < sArr.length; i++) {
                    newArr[i] = sArr[i];
                }
                //添加元素
                newArr[count] = s;
                return newArr;
            }
        } else {
            System.out.println("添加失败，该ID已存在！");
            return sArr;//若无法添加，则返回原数组
        }
    }//添加元素：判断数组中是否还有位置,并添加

    public static boolean contains(Student[] sArr, int id) {
        for (int i = 0; i < sArr.length; i++) {
            if (id == sArr[i].getId()) {
                return true;
            }
        }
        return false;
    }//判断新元素的id是否在数组sArr中,并返回结果

    public static int count(Student[] sArr) {
        int count = 0;
        for (int i = 0; i < sArr.length; i++) {//统计数组中的非null元素,即已有元素的个个数
            if (sArr[i] != null) {
                count++;
            }
        }
        return count;
    }//计数器：统计数组sArr中已有元素个数

    public static void show(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                System.out.println(
                        "学号：" + arr[i].getId() + "\t" +
                                "姓名：" + arr[i].getName() + "\t" +
                                "年龄：" + arr[i].getAge()
                );
            }else{
                System.out.println(arr[i]);
            }
        }
    }//显示所有元素的信息

    public static void delete(Student[] newArr, int index) {
            if (index>=0) {
                newArr[index]=null;
                System.out.println("删除成功！");
            }else{
                System.out.println("删除失败，没有该ID");
            }
        }//跟据id删除信息

    public static int getIndex(Student[]newArr,int id){
        for (int i = 0; i < newArr.length; i++) {
            Student stu=newArr[i];//获取对象
            if(stu!=null){//防止报错
                int sId=stu.getId();//如果非空·，则获取其id
                if(id==sId){
                    return i;
                }
            }

        }
        return -1;
    }//获取要删除的学生信息的索引
    public static void modifyAge(Student[]newArr,int index){
            if(index>=0){
                int age=newArr[index].getAge();
                newArr[index].setAge(age+1);
                System.out.println("修改成功，"+newArr[index].getName()+"的年龄+1");
            }else{
                System.out.println("修改失败，没有这个ID");
            }
    }//修改年龄


}
