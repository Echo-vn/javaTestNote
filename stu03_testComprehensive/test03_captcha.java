package com.itheima.stu03_testComprehensive;
/*
需求：定义方法，实现随机产生一个5位数的验证码
验证码格式：
            1、长度为5
            2、前四位是大写字母或者小写字母
            3、最后一位是数字
 */
/*
开发思路： 1、验证码应该定义成一个字符串类型，由产生的五个随机数拼接而成
          2、随机产生一个大写或者小写字母，
              （1）可以将52个字母存放到一个数组中
              （2）用random随机抽取4次，拼接起来
          3、与2同理，随机抽取一个数字（0~9）
          4，再次与产生的四个随机字母进行拼接---->完成
 */

import java.util.Random;

public class test03_captcha {
    public static void main(String[] args) {
        System.out.println(getCaptcha());

    }
    public static String getCaptcha(){
        Random r=new Random();
        String result = "";
        char[] chs=new char[52];
        for(int i =0;i<52;i++){
            if(i<=25){  //索引0~25添加小写字母，'a'-->97
                chs[i]=(char)(97+i);
            }else{      //索引26-51添加大写字母，'A'-->65
                chs[i]=(char)(65+i-26);
            }
        }
        for (int j=0;j<4;j++) {
            int indexRandom = r.nextInt(53);
            result = result + chs[indexRandom]; //循环4次之后便获取到了4个随机大小写的字母
        }
        //接下来获取一个0~9的随机数，与result拼接
        int numRan=r.nextInt(10);
        result=result+numRan;
        return result;
    }


}
