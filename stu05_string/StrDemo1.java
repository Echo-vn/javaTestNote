package com.itheima.stu05_string;

import java.util.Scanner;

//需求：已知正确的用户名和密码，请用程序实现模拟用户登录。
//总共三次机会，登录之后，给出相应提示
public class StrDemo1 {
    public static void main(String[] args){
        //1、已知用户名
        String name="heima";
        String pw="abc";
        //2、用户登录
        int count=0;
        while(count<3){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入用户名：");
            String inName= sc.next();
            System.out.println("请输入密码：");
            String inPw=sc.next();
            //3、对输入的字符串和已知字符串比较
            boolean resultName=inName.equalsIgnoreCase(name);
            boolean resultPw=inPw.equals(pw);
            //System.out.println("结果"+resultName+" "+resultPw);
            if(resultName && resultPw){
                System.out.println("登录成功！");
                break;
            }else{
                count++;
                System.out.println("用户名或密码错误");
                if(count<3){
                    System.out.println("你还有"+(3-count)+"次机会");
                    continue;
                }else{
                    System.out.println("账号已锁");
                    break;
                }

        }

        }
    }

}
