package com.itheima.stu04_faceObject.test01_combatGame;

import java.util.Random;

//创建一个角色类
public class Role {
    //成员属性变量的定义
    private String name;
    private int blood;
    private char gender;
    private String face;//长相是随机的
    private String[] boyFaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    private String[] girlFaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
    private String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    private String[] injureds_desc = {
            "----结果%s退了半步，毫发无损",
            "----结果给%s造成一处瘀伤",
            "----结果一击命中，%s痛得弯下腰",
            "----结果%s痛苦地闷哼了一声，显然受了点内伤",
            "----结果%s摇摇晃晃，一跤摔倒在地",
            "----结果%s脸色一下变得惨白，连退了好几步",
            "----结果『轰』的一声，%s口中鲜血狂喷而出",
            "----结果%s一声惨叫，像滩软泥般塌了下去"
    };

    //1、定义构造方法
    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //随机长相
        setFace(gender);
    }

    //2、定义set方法
    public void setName(String name) {
        this.name = name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    private void setFace(char gender) {
        Random r = new Random();
        if (gender == '男') {
            int index = r.nextInt(boyFaces.length);
            this.face = boyFaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlFaces.length);
            this.face = girlFaces[index];
        } else {
            this.face = "面目狰狞";
        }
    }

    //3、定义get方法
    public String getName() {
        return name;
    }

    public int getBlood() {
        return blood;
    }

    public char getGender() {
        return gender;
    }

    public String getFace() {
        return face;
    }
    //4、定义行为方法

    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;//随即造成1~20点的伤害
        int attackIndex = r.nextInt(attacks_desc.length);
        int remainBlood = role.getBlood() - hurt;//定义remainBlood用来接收role.Blood()
        remainBlood = remainBlood < 0 ? 0 : remainBlood;//这里对remainBlood做一个判断，然后再赋值给remainBlood
        //修改role.Blood的值
        role.setBlood(remainBlood);
        //攻击描述
        System.out.printf(attacks_desc[attackIndex]+"\n", this.name, role.getName());
        //受伤描述,血量越低，受伤描述逐层向下
        if (role.getBlood() > 90 && role.getBlood() <= 100) {
            System.out.printf(injureds_desc[0] + "\n", role.getName());
        } else if (role.getBlood() > 80 && role.getBlood() <= 90) {
            System.out.printf(injureds_desc[1] + "\n", role.getName());
        } else if (role.getBlood() > 70 && role.getBlood() <= 80) {
            System.out.printf(injureds_desc[2] + "\n", role.getName());
        } else if (role.getBlood() > 60 && role.getBlood() <= 70) {
            System.out.printf(injureds_desc[3] + "\n", role.getName());
        } else if (role.getBlood() > 40 && role.getBlood() <= 60) {
            System.out.printf(injureds_desc[4] + "\n", role.getName());
        } else if (role.getBlood() > 20 && role.getBlood() <= 40) {
            System.out.printf(injureds_desc[5] + "\n", role.getName());
        } else if (role.getBlood() > 0 && role.getBlood() <= 20) {
            System.out.printf(injureds_desc[6] + "\n", role.getName());
        } else if (role.getBlood() == 0) {
            System.out.printf(injureds_desc[7] + "\n", role.getName());
        }

    }//将被攻击对象（role2）传入方法，每调用一次该方法便让role2的血量减去一定值

    public void showRoleInfo() {
        System.out.println("姓名为：" + getName());
        System.out.println("性别为：" + getGender());
        System.out.println("血量为：" +getBlood());
        System.out.println("长相为：" + getFace());
    } //显示所有对象所有属性
}
