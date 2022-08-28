package com.itheima.stu03_testComprehensive;

import java.util.Scanner;

/*
题目：买飞机票
需求：
     1、机票价格按照淡季旺季，头等舱和经济舱收费，输入机票原价，月份，头等舱或经济舱。
     2、按照如下规则计算机票价格：旺季（5月-10月），头等舱9折，经济舱8.5折。
                                淡季（11月到来年4月），头等舱7折，经济舱6.5折
 */
/*
需求分析：
        1、输入机票原价-->月份+舱位-->实际价格
        2、其次由月份判断是淡季还是旺季，（旺季：5-10 淡季：11-4）
        3、再跟据客户所选舱位进行打折操作（旺季：9/8.5 淡季：7/6.5）
        4、最后输出实际价格
 */

/*
public class test01卖飞机票 {
    public static void main(String[] args) {
        System.out.println(newPrice());


    }//主方法

    public static int season() {
        int flag;    //flag初始化，false即代表淡季
        Scanner sc = new Scanner(System.in);
        //originalPrice = sc.nextInt(); //输入机票原价
        System.out.println("请输入月份：");
        int month = sc.nextInt();//输入月份
        //如果月份在1月到4月，或者在11月到12月，则代表淡季，flag=flase
        if (month >= 5 && month <= 10) {
            flag = 1;
            System.out.println("该月是旺季。");
            return flag;
        } else if ((month >= 1 && month < 5) || (month > 10 && month <= 12)) {
            System.out.println("该月是淡季。");
            flag = 2;
            return flag;
        } else {
            System.out.println("非法输入！没有这个月份。");
            flag = 0;
            return flag;
        }

    }//该方法判断淡旺季

    public static double newPrice() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入机票原价：");
        double originalPrice = sc.nextInt(); //输入机票原价
        int flag = season();
        if (flag == 0) {//flag==0,代表没有这个月份
            System.out.println("");
            return 0;
        }
        System.out.println("请输入机票属性（头等舱:1/经济舱:0）：");
        int seat = sc.nextInt();
        if (seat == 1 && flag == 1) {
            double newPrice = originalPrice * 0.9;
            return newPrice;
        } else if (seat == 1 && flag == 2) {
            double newPrice = originalPrice * 0.7;
            return newPrice;
        } else if (seat == 0 && flag == 1) {
            double newPrice = originalPrice * 0.85;
            return newPrice;
        } else if (seat == 0 && flag == 2) {
            double newPrice = originalPrice * 0.65;
            return newPrice;
        }
        return 0;
    }//该方法计算实际价格
}
 *///这段代码是我自己写的，完成了需求，但是代码臃肿（58段），并且易读性不比老师的代码,优化代码如下（30段）
public class test01_buyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原价");
        int ticket = sc.nextInt();
        System.out.println("请输入月份：");
        int month=sc.nextInt();
        System.out.println("请输入舱位(头等舱:1/经济舱:2):");
        int seat = sc.nextInt();
        if (month>=5 && month<=10){//旺季
            ticket = getTicket(ticket, seat, 0.9, 0.85);
        }else if((month>=1&&month<5)||(month>10&&month<=12)){
            ticket = getTicket(ticket, seat, 0.7, 0.65);
        }else{
            System.out.println("非法输入，没有该月份！");
        }
        System.out.println("实际票价为："+ticket);
    }
//选择重复使用的代码段，ctrl+alt+m -->idea会自动提取方法并创建
    private static int getTicket(int ticket, int seat, double v, double v2) {
        if (seat == 1) {
            ticket = (int) (ticket * v);//强转为int类型
        } else if (seat == 0) {
            ticket = (int) (ticket * v2);
        } else {
            System.out.println("没有该舱位！");
        }
        return ticket;
    }//该段代码用来计算实际票价
}
