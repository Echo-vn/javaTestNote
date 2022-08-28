package com.itheima.stu03_testComprehensive;
/*
   需求：有一个大V直播抽奖，奖品为金额为{2，588，888，1000，10000}的5个现金红包。
        请使用代码实现模拟抽奖，打印出每个奖项。奖品出现的顺序要随机，并且不能重复。
 */
/*
    需求分析：1、静态初始化一个数组prizeArr。
             2、随机产生一个0~4的数字当作索引
             3、抽奖环节。{
                注意：（1）定义一个空数组tempArr,长度为prizeArr.length
                     （2）抽到一个元素时，先判断是否存在于tempArr，若不存在，输出之，再将其放入tempArr中。
                          若存在，则跳过本次循环。
 */
import java.util.Random;
public class test08_luckyDraw01 {
    public static void main(String[] args) {
        int[] arr = {2,588, 888, 1000, 10000};
        int[] newArr = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < 5;) {//一共需要抽6次奖
            int randomIndex=r.nextInt(arr.length);
            int prize=arr[randomIndex];
            boolean flag= contains(newArr,prize);
            //循环永远到不了下面的if语句
            if(!flag){
                newArr[i]=prize;
                ++i;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
    public static boolean contains(int[]arr, int prize){
        for (int i = 0; i < arr.length; i++) {
            if( arr[i]==prize){
                return true;
            }
        }
        return false;
    }//判断随机获取到的元素知否在newArr数组中

}
