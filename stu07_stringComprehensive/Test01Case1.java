package com.itheima.stu07_stringComprehensive;
//罗马数字转换
/*
从键盘录入一个字符串，要求是0-9的数字,长度小于等于9
将该字符串转换为罗马数字
 */
import java.util.Scanner;
public class Test01Case1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num;

        while (true) {
            System.out.println("请输入一个整数字符串：");
            num=sc.next();
            //判断输入是否合法
            boolean flag=checkStr(num);
            if(flag){
                StringBuilder sb=new StringBuilder();
                for (int i = 0; i < num.length(); i++) {
                    char chs=num.charAt(i);
                    int number=chs-48;
                    sb.append(getLuomaNum(number)).append(" ");
                }
                String luoMa=sb.toString();
                System.out.println(luoMa);
                break;
            }else{
                System.out.println("输入的字符串不符合规则，请重新输入");
                continue;
            }
        }

    }
    public static String getLuomaNum(int num){
        String[] luoMaArr={"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return luoMaArr[num];
    }//返回一个数字的罗马数字
    public static boolean checkStr(String str){
        //长度小于等于9
        if(str.length()>9){
            return false;
        }
        //范围在0-9之间
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (c <'0' || c > '9') {
                return false;
            }
        }
        //遍历完整个字符串，则符合要求
        return true;
    }
}
