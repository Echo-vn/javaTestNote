package com.itheima.studentSystem;

import java.util.Scanner;
import java.util.ArrayList;


public class logIn_UI {
    public static void main(String[] args) {
        //创建一个用户集合，用来保存用户信息
        ArrayList<User> lst = new ArrayList<>();
        //登录界面
        System.out.println("----------------欢迎来到学生管理系统-------------------");
        System.out.println("\t请选择操作:");
        System.out.println("\t\t\t\t1-登录");
        System.out.println("\t\t\t\t2-注册");
        System.out.println("\t\t\t\t3-忘记密码");
        System.out.println("-----------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择操作：");
        String choose = sc.next();
        switch (choose) {
            case "1" -> login(lst, sc);
            case "2" -> register(lst);
            case "3" -> forgetPassword();
            case "0" -> {
                System.out.println("感谢您的使用：");
                System.exit(0);
            }
            default -> System.out.println("没有这个选项，请重输入");
        }
    }

    //登录
    private static void login(ArrayList<User> lst, Scanner sc) {
       /*   1，键盘录入用户名
	        2，键盘录入密码
	        3，键盘录入验证码*/
        loop1:
        while (true) {
            System.out.println("请输入用户名：");
            String name = sc.next();
            //唯一性判断
            if (containsUserName(lst, name) == -1) {
                System.out.println("用户名不存在");
                continue;
            } else {
                int index = containsUserName(lst, name);
                int count = 0;
                loop2:
                while (count<3) {
                    System.out.println("请输入密码：");
                    String pw = sc.next();
                    if (pw != lst.get(index).getPassword()) {
                        count++;
                        System.out.println("密码错误，请重新输入，还有3-count次机会");
                        continue loop2;
                    }else{
                        System.out.println("登录成功！");
                    }
                }


            }
        }


    }

    //注册
    private static void register(ArrayList<User> lst) {
      /*  1，用户名需要满足以下要求：
		验证要求：
			用户名唯一
			用户名长度必须在3~15位之间
			只能是字母加数字的组合，但是不能是纯数字*/
        Scanner sc = new Scanner(System.in);
        String name = null;
        loop1:
        while (true) {
            System.out.println("请输入用户名：");
            name = sc.next();
            //用户名规范判断
            if (name.length() < 3 || name.length() > 15) {
                System.out.println("用户名不符合规范，请重新输入");
                continue;
            }
            for (int i = 0; i < name.length(); i++) {
                char chs = name.charAt(i);//获取串的每一个字符
                if (chs < 48 || chs > 57) {
                    break loop1;
                }
            }
            System.out.println("用户名不符合规范，请重新输入");
        }

        //用户名的唯一性判断
        if (lst.size() == 0) {//直接注册
            setInfo(lst, sc, name);
        } else {
            while (true) {
                if (containsUserName(lst, name) != -1) {//true
                    System.out.println("该用户名已存在，请重新输入");
                    continue;
                } else {
                    setInfo(lst, sc, name);
                    break;
                }
            }
        }
    }

    //设置user对象的属性
    private static void setInfo(ArrayList<User> lst, Scanner sc, String name) {
        User u = new User();
        //1、设置姓名
        u.setUserNmae(name);
        //2、设置密码
        while (true) {
            System.out.println("请输入密码：");
            String password1 = sc.next();
            System.out.println("请确认密码：");
            String password2 = sc.next();
            if (password1.equals(password2)) {
                u.setPassword(password1);
                System.out.println("密码设置成功\n");
                break;
            } else {
                System.out.println("前后密码不一致，请重新输入");
                continue;
            }
        }
           /*
            3、验证身份证号：
			        长度为18位
			        不能以0为开头
			        前17位，必须都是数字
			        最为一位可以是数字，也可以是大写X或小写x*/
        String id;
        loop2:
//身份证验证
        while (true) {
            //判断id长度是否合适
            System.out.println("请输入身份证号：");
            id = sc.next();
            if (id.length() != 18) {
                System.out.println("身份证格式有误，请重新输入");
                continue;
            }
            //前17位的判断
            for (int i = 0; i < id.length() - 1; i++) {
                char chs = id.charAt(i);

                if (id.charAt(0) == 0) {
                    System.out.println("身份证格式有误，请重新输入");
                    continue;
                } else if (chs < 48 || chs > 57) {
                    System.out.println("身份证格式有误，请重新输入");
                    continue;
                }
            }
            //最后一位的判断
            char endCh = id.charAt(id.length() - 1);
            if ((endCh >= 48 && endCh <= 57) || (endCh == 'x') || (endCh == 'X')) {
                u.setUserId(id);
                System.out.println("身份验证成功\n");
                break loop2;
            }


        }
            /*4、手机号验证
			    长度为11位
			    不能以0为开头
			    必须都是数字*/
        String phone;
        loop3:
//手机号验证
        while (true) {
            System.out.println("请输入号码：");
            phone = sc.next();
            //（1）位数判断，（2）首位不能为0
            if (phone.length() != 11) {
                System.out.println("号码格式错误，请重新输入");
                continue;
            } else if (phone.charAt(0) == '0') {
                System.out.println("号码格式错误，请重新输入");
                continue;
            }
            //（3）都是数字
            for (int i = 0; i < phone.length(); i++) {
                char ch = phone.charAt(i);
                if (ch < 48 || ch > 57) {
                    continue loop3;
                }
            }
            //手机号验证成功
            u.setPhoneNum(phone);
            System.out.println("手机号验证成功\n");
            break loop3;
        }
        //将创建的对象u保存到集合中
        lst.add(u);
        System.out.println("账号注册成功!");
    }

    //忘记密码
    private static void forgetPassword() {

    }

    //判断userName的唯一性
    public static int containsUserName(ArrayList<User> lst, String name) {
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getUserNmae().equals(name)) {
                return i;
            }
        }
        return -1;
    }


}
