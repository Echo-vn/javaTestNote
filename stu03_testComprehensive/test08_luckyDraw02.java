package com.itheima.stu03_testComprehensive;

import java.util.Random;

/*
还是上次的抽奖题目，这次不用每抽一次就遍历新数组，直接将奖池里的奖项打乱再输出就好
 */
public class test08_luckyDraw02 {
    public static void main(String[] args) {
        int[] prizeArr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        int temp;//用于交换两个元素的位置
        for (int i = 0; i < prizeArr.length; i++) {
            int index = r.nextInt(prizeArr.length);
            temp=prizeArr[i];
            prizeArr[i]=prizeArr[index];
            prizeArr[index]=temp;
        }
        for (int i = 0; i < prizeArr.length; i++) {
            System.out.println(prizeArr[i]);
        }
    }
}
