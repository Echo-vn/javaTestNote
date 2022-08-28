package com.itheima.stu03_testComprehensive;
/*
   需求：判断101~200之间有多少个素数，并将它们输出
 */
/*
    需求分析：素数-只能被1和它本身整除
 */
public class test02_primeNum {
    public static void main(String[] args) {
        int count=0;
        for (int num = 101; num <= 200; num++){
            boolean flag=true;
            for(int i=2;i<num;i++){
                if(num % i==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
                System.out.print(num+" ");
            }

        }
        System.out.println();
        System.out.println("一共有"+count+"个质数");
    }
}


