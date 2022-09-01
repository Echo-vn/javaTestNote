package com.itheima.studentSystem;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class logIn_UI {
    public static void main(String[] args) {
        //创建一个用户集合，用来保存用户信息
        ArrayList<User> lst = new ArrayList<>();
        //登录界面
        while (true) {
            System.out.println("----------------欢迎来到学生管理系统-------------------");
            System.out.println("\t请选择操作:");
            System.out.println("\t\t\t\t1-登录");
            System.out.println("\t\t\t\t2-注册");
            System.out.println("\t\t\t\t3-忘记密码");
            System.out.println("\t\t\t\t0-退出系统");
            System.out.println("-----------------------------------------------------");

            Scanner sc = new Scanner(System.in);
            System.out.println("请选择操作：");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(lst, sc);
                case "2" -> register(lst, sc);
                case "3" -> forgetPassword(lst, sc);
                case "0" -> {
                    System.out.println("感谢您的使用!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("没有这个选项，请重输入\n");
                }
            }
        }
    }

    //登录
    private static void login(ArrayList<User> lst, Scanner sc) {
        //printList(lst);
       /*   1，键盘录入用户名
	        2，键盘录入密码
	        3，键盘录入验证码*/
       /* 验证要求：
		    用户名如果未注册，直接结束方法，并提示：用户名未注册，请先注册
		    判断验证码是否正确，如不正确，重新输入
		    再判断用户名和密码是否正确，有3次机会*/
        //1、输入用户名
        int count=0;
        while (count<3) {
            System.out.println("请输入用户名：");
            String name = sc.next();
            //唯一性判断
            if (containsUserName(lst, name) == -1) {
                System.out.println("该用户名未注册，请先注册");
                return;
            }
            //2、输入密码
            System.out.println("请输入密码：");
            String pw = sc.next();
            //验证码
            while (true) {
                String captcha = captcha();
                System.out.println(captcha);
                System.out.println("请输入验证码：");
                String capNum = sc.next();
                if (captcha.equalsIgnoreCase(capNum)) {
                    break;
                } else {
                    System.out.println("验证码输入错误，请重试");
                }
            }
            //3、用户信息的判断
            User userInfo = new User(name, pw, null, null);
            boolean result = judgeInfo(lst, userInfo);
            if (result) {
                System.out.println("\n登录成功，欢迎来到学生管理系统");
                break;
            } else {
                if(count==2){
                    System.out.println("账户"+name+"已锁定，请联系客服（xxx-xxx-xx）");
                }else{
                    System.out.println("账号或密码错误，你还有"+(2-count)+"次机会");
                }
                count++;
            }
        }


    }

    //注册
    private static void register(ArrayList<User> lst, Scanner sc) {
        //设置用户名
        String userName;
        while (true) {
            System.out.println("请输入用户名：");
            userName = sc.next();
            // System.out.println(judgeName(userName));
            if (judgeName(userName)) {//合法性判断
                if (containsUserName(lst, userName) == -1) {//唯一性判断
                    System.out.println("用户名设置成功！\n");
                    break;
                } else {
                    System.out.println("用户名已存在，请重新输入\n");
                }
            } else {
                System.out.println("用户名输入不规范，请重新输入\n");
            }
        }
        //设置密码
        String password = changePassword(sc);
        //验证身份证
        String id;
        while (true) {
            System.out.println("请输入身份证号：");
            id = sc.next();
            //合法性判断
            if (judgeId(id)) {
                System.out.println("身份证号验证成功！\n");
                break;
            } else {
                System.out.println("身份证号格式不正确，请重试\n");
            }
        }
        //验证手机号
        String phone;
        while (true) {
            System.out.println("请输入手机号码：");
            phone = sc.next();
            if (judgePhoneNum(phone)) {
                System.out.println("手机号验证成功！\n");
                break;
            } else {
                System.out.println("手机号不合法，请重试\n");
            }
        }
        //将信息保存到对象u中
        User u = new User(userName, password, id, phone);
        //将对象保存到集合中
        lst.add(u);
        printList(lst);
        System.out.println("账号注册成功!!!");
    }

    //忘记密码
    private static void forgetPassword(ArrayList<User> lst, Scanner sc) {
        /*  1，键盘录入用户名，判断当前用户名是否存在，如不存在，直接结束方法，并提示：未注册
	        2，键盘录入身份证号码和手机号码
	        3，判断当前用户的手机号码和身份证号码是否匹配
	                若信息一致，则提示输入密码，进行修改。
			        若不一致，则提示：账号信息不匹配，修改失败。*/
        System.out.println("请输入用户名：");
        String userName = sc.next();
        int index = containsUserName(lst, userName);
        if (index == -1) {
            System.out.println("未注册");
            return;
        }
        //验证身份证和手机号
        System.out.println("请输入身份证号：");
        String id = sc.next();
        System.out.println("请输入手机号码：");
        String phone = sc.next();
        if ((lst.get(index).getUserId().equals(id)) && (lst.get(index).getPhoneNum().equals(phone))) {//信息一致
            lst.get(index).setPassword(changePassword(sc));
        } else {
            System.out.println("账号信息不匹配，修改失败");
        }
    }

    //判断用户名是否符合规范
    private static boolean judgeName(String name) {
        /*用户名长度必须在3~15位之间
        只能是字母加数字的组合，但是不能是纯数字*/
        int length = name.length();
        if (length < 3 || length > 15) {
            return false;
        }
        //只能是数字和字母的组合
        for (int i = 0; i < name.length(); i++) {
            char chs = name.charAt(i);
            if ((chs < 'a' || chs > 'z') && (chs < 'A' || chs > 'Z') && (chs < '0' || chs > '9')) {
                return false;
            }
        }
        //满足以上条件之后，若chs的ascii码大于'9',则表示name不是纯字符串,返回true
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) > '9') {
                return true;
            }
        }
        return false;
    }

    //判断userName的唯一性,返回索引
    public static int containsUserName(ArrayList<User> lst, String name) {
        for (int i = 0; i < lst.size(); i++) {
            if ((lst.get(i).getUserNmae()).equals(name)) {
                return i;
            }
        }
        return -1;
    }

    //判断号码是否符合规范
    private static boolean judgePhoneNum(String phone) {
        //（1）位数判断，（2）首位不能为0
        if (phone.length() != 11) {
            return false;
        } else if (phone.charAt(0) == '0') {
            return false;
        }
        //（3）都是数字
        for (int i = 0; i < phone.length(); i++) {
            char ch = phone.charAt(i);
            if (ch < 48 || ch > 57) {
                return false;
            }
        }
        return true;
    }

    //判断身份证号是否符合规范
    public static boolean judgeId(String id) {
        //长度的判断
        if (id.length() != 18) {
            return false;
        }
        //前17位的判断
        for (int i = 0; i < id.length() - 1; i++) {
            char chs = id.charAt(i);
            if (id.charAt(0) == 0) {
                return false;
            } else if (chs < '0' || chs > '9') {
                return false;
            }
        }
        //最后一位的判断
        char endCh = id.charAt(id.length() - 1);
        if ((endCh >= '0' && endCh <= '9') || (endCh == 'x') || (endCh == 'X')) {
            return true;
        }
        return false;
    }

    //判断用户名和密码是否正确
    private static boolean judgeInfo(ArrayList<User> lst, User u) {
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getUserNmae().equals(u.getUserNmae()) && lst.get(i).getPassword().equals(u.getPassword())) {
                return true;
            }
        }
        return false;
    }

    //遍历集合元素
    public static void printList(ArrayList<User> lst) {
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i).getUserNmae() + ","
                    + lst.get(i).getPassword() + ","
                    + lst.get(i).getUserId() + ","
                    + lst.get(i).getPhoneNum()
            );
        }
    }

    //生成验证码
    private static String captcha() {
        //随机生成5位验证码，4字母+1数字
        ArrayList<Character> charLst = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            charLst.add((char) ('a' + i));
            charLst.add((char) ('A' + i));
        }
        //随机生成5位字母验证码
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        //1、先获取5个随机字母
        for (int i = 0; i < 5; i++) {
            sb.append(charLst.get(r.nextInt(52)));
        }
        //2、再随机获取一个数字，随机地替换一个字母
        char[] arr = sb.toString().toCharArray();
        char rNum = (char) (r.nextInt(10) + '0');
        arr[r.nextInt(5)] = rNum;
        String capthcha = new String(arr);
        return capthcha;
    }

    //设置密码
    private static String changePassword(Scanner sc) {
        loop2:
        while (true) {
            System.out.println("请输入密码：");
            String pw1 = sc.next();
            System.out.println("请确认密码：");
            String pw2 = sc.next();
            if (pw1.equals(pw2)) {
                System.out.println("密码设置成功");
                return pw1;
            } else {
                System.out.println("密码前后不一致，请重试");
            }
        }
    }
}




