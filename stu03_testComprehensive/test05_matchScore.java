package com.itheima.stu03_testComprehensive;
/*
    需求：一年级进行歌唱比赛，有6名评委进行打分（0~100）。
         选手最后的得分为：去掉一个最高分，去掉一个最低分，将剩余4个分数存入另一个数组newArr中
         跟据剩余4个分数求平均值即为最终得分
         请计算出选手的得分
 */
/*
    需求分析：1、依次输入6个评委打出的分{可以用到循环）,保存到数组中
             2、计算出最大值、最小值
             3、求出6个分数的总和，再减去max和min，（sum-max-min）
             4、average=(sun-max-min)/4
 */

import java.util.Scanner;

public class test05_matchScore {
    public static void main(String[] args) {
        int[] scoreArr=getScore();//数组scoreArr接收到getScore传出的地址值
        int min=getMin(scoreArr);//将getScore()传入getMin
        int max=getMax(scoreArr);
        int sum=getSum(scoreArr);
        int finalScore =(sum-min-max)/4;
        System.out.println("选手的最终得分为："+finalScore);

    }
    public static int[] getScore() {

        //System.out.println("正在调用getScore");
        Scanner sc=new Scanner(System.in);
        int[] scoreArr = new int[6];
        int count=1;
        while (count!=7) {
            System.out.println("请输入第" + count + "位评委的分数：");
            int score = sc.nextInt();
            //将输入的成绩保存到数组中
            if (score >= 0 && score <= 100) {//只有打的分数符合规范，才能被存入数组中
                scoreArr[count - 1] = score;
                count++;//将count放到if中的目的是为了 当输入一个不合规矩的数字时，不对scoreArr的索引进行++，便进行下一次循环
            }
        }
        //System.out.println("返回数组scoreArr");
        return scoreArr;
    }//该方法获取6个分数，以数组类型返回
    public static int getMax(int[] getScore) {
        //int[] scoreArr = getScore();//将获取到的分数保存到score中
        int max = getScore[0];
        for (int i = 1; i < getScore.length; i++) {
            if (getScore[i] > max) {
                max = getScore[i];
            }
        }
        System.out.println("最高分为："+max);
        return max;
    }//该方法计算数组中的最大值
    public static int getMin(int[] getScore) {
        int min = getScore[0];
        for (int i = 0; i < getScore.length; i++) {
            if (getScore[i] < min) {
                min = getScore[i];
            }
        }
        System.out.println("最低分为："+min);
        return min;
    }//该方法计算数组中的最小值
    public static int getSum(int[]scoreArr){
        int sum=0;
        for(int i=0 ;i<scoreArr.length;i++){
            sum=sum+scoreArr[i];
        }
        return sum;
    }//该方法求出6个分数的总和
}