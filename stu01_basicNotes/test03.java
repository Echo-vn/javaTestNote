package com.itheima.stu01_basicNotes;
/*寺庙里有三个和尚，身高分别为168，210，150
判断并输出最高的身高

 */
public class test03 {
    public static void main(String[] args) {
        int hight1=168;
        int hight2=210;
        int hight3=150;
        int max1 = hight1>hight2? hight1:hight2;
        int maxhight = max1>hight3? max1:hight3;
        System.out.println("三人中最高的身高为："+maxhight);

    }
}
