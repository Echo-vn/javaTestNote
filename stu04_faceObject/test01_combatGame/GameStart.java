package com.itheima.stu04_faceObject.test01_combatGame;

//选择两个角色，进行格斗
public class GameStart {
    public static void main(String[] args) {
        //创建角色
        Role r1 = new Role("乔峰", 100,'男');
        Role r2 = new Role("鸠摩智", 100,'男');
        //显示角色信息
        r1.showRoleInfo();
        r2.showRoleInfo();
        System.out.println();
        //开始战斗
        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println("\n"+r1.getName() + "打败了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println("\n"+r2.getName() + "打败了" + r1.getName());
                break;
            }

        }
    }

}
