package com.itheima.stu03_testComprehensive;

import java.util.Random;
import java.util.Scanner;

/*
    题目：双色球系统
          投注号码由6个红色球号码和一个蓝色球号码组成，
          红色球号码从1~33之间选取，蓝色球号码由1~16之间选取
    奖项描述：一等奖：6+1、二等奖：6+0、三等奖：5+1、四等奖：{5+0、4+1}、
             五等奖：{4+0、3+1}、六等奖：{2+1、1+1、0+1}
 */
/*
    需求分析：1、生成中奖号码：中将号码在两个数组（redArr、blueArr）中随机选取，红6蓝1
             2、输入彩票号码：num
             3、将彩票号码与中奖号码进行比对：
                （1）定义两个统计变量，用于统计红/蓝色球的符合数量
                （2）遍历彩票号码，与中奖号码进行一一比对
                （3）跟据猜中的双色球数量输出中奖情况
 */
public class test09_bicolorSphere {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        //1、生成中奖号码
        int[] red = getRed();
        for (int i = 0; i < red.length; i++) {
            System.out.print(red[i] + " ");
        }
        System.out.println();
        int blue1 = r.nextInt(16) + 1;
        int[] blue = {blue1};
        System.out.println(blue[0]);
        //2、选取号码
        int[] myRed = myRed();
        System.out.println("请选取蓝色球号码：");
        int[] myBule = new int[1];
        while (true) {
            int myBlue1 = sc.nextInt();
            if (myBlue1 > 0 && myBlue1 < 17) {
                myBule[0] = myBlue1;
                break;
            } else {
                System.out.println("输入不合法，请输入1~16的数字！");
            }

        }
        //3、号码比对
        int redCount = compare(red, myRed);//获取红球猜中的数量
        int blueCount = compare(blue, myBule);
        System.out.println(redCount + " " + blueCount);
        getPrize(redCount, blueCount);

    }

    public static int[] getRed() {
        Random r = new Random();
        int[] red = new int[6];
        for (int i = 0; i < red.length; i++) {
            int redRandomNum = r.nextInt(33) + 1;//随机生成一个红色球号码
            red[i] = redRandomNum;
        }
        return red;
    }//生成一组红色中奖号码

    public static int[] myRed() {
        Scanner sc = new Scanner(System.in);
        //选取红色球号码
        int[] myRed = new int[6];
        for (int i = 0; i < myRed.length; ) {
            System.out.println("请输入第" + (i + 1) + "个红色球号码：");
            int red = sc.nextInt();
            if (red > 33 || red < 1) {
                System.out.println("输入不合法，请输入1~33的数字！");
            } else {
                myRed[i] = red;
                i++;
            }
        }
        return myRed;

    }//选取红色球号码

    public static int compare(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                count++;
            }
        }
        return count;
    }//此方法比较两个数组中对应元素是否相等

    public static void getPrize(int redCount, int blueCount) {
        if (redCount == 6 && blueCount == 1) {
            System.out.println("喜提一等奖！");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("喜提二等奖！");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("喜提三等奖！");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("喜提四等奖！");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("喜提五等奖！");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("喜提六等奖！");
        } else {
            System.out.println("很遗憾你与大奖擦肩而过！");
        }

    }//输出奖项
}
