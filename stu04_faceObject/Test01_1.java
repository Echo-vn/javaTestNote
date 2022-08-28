package com.itheima.stu04_faceObject;

public class Test01_1 {
    public static void main(String[] args) {
        //创建第一个对象
        Test01_girlFriend gf1 = new Test01_girlFriend();
        gf1.name = "花小粥";
        gf1.age=21;
        gf1.height=168;
        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.height);
        gf1.eat();
        gf1.sleep();
        System.out.println("================================================");
        //创建第二个对象
        Test01_girlFriend gf2=new Test01_girlFriend();
        gf2.name="小师妹";
        gf2.age=19;
        gf2.height=166;
        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.height);
        gf2.sleep();
        gf2.eat();
        System.out.println("==================================================");
    }

}
