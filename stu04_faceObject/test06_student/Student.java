package com.itheima.stu04_faceObject.test06_student;
//定义学生对象
//属性：学号，姓名，年龄
public class Student {
    private int id;
    private String name;
    private int age;
    //构造函数
    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
