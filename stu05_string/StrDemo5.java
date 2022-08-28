package com.itheima.stu05_string;
//题目：支票金额转换（eg：2135=零佰零拾零万贰仟壹佰叁拾伍元）
/*
需求分析：总体可用逆推法
        1、 转换数字：2135-->贰壹叁伍
                0~9 对应 零~玖（查表法：将 "零~玖" 存入数组，再跟据索引与（0~9）一一对应）
        2、前面补零：零零零贰壹叁伍
        3、添加单位：零佰零拾零万贰仟壹佰叁拾伍元

 */
import java.util.Scanner;
public class StrDemo5 {
    public static void main(String[] args) {
        //输入金额
        Scanner sc=new Scanner(System.in);
        int amount;
        //金额判断环节
        while (true) {
            System.out.println("请输入金额：");
            amount=sc.nextInt();
            if(amount>0&&amount<=9999999){
                break;
            }else{
                System.out.println("金额无效");
            }
        }

        //得到输入金额的每一位
        int tempNum=amount;
        String capitalStr="";
        while(tempNum>0){
            int ge=tempNum%10;
            char chs= getCapitalNum(ge);
            capitalStr=chs+capitalStr;//这样拼就不会出现字符串倒过来的情况了
            tempNum/=10;
        }
        //补“零”
        int count=7-capitalStr.length();
        for (int i = 0; i < count; i++) {
            capitalStr="零"+capitalStr;
        }
        System.out.println(capitalStr);
        //插入单位
        String[] arr={"佰","拾","萬","仟","佰","拾","元"};
        String resultStr="";
        for (int i = 0; i < capitalStr.length(); i++) {
            char chs=capitalStr.charAt(i);
            resultStr=resultStr+chs+arr[i];
        }
        System.out.println(resultStr);

    }
    public static char getCapitalNum(int num){//num=(0~9)
        char[] chs={'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
        return chs[num];
    }//返回大写字符(1----壹)
}
