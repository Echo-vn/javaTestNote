package com.itheima.stu07_stringComprehensive;

//给定两个字符串形式的num1和num2，返回它们的乘积，结果也用字符串表示
public class Test05 {
    public static void main(String[] args) {
        String num1 = "12345678";
        String num2 = "123456789";
        char[] numArr1 = num1.toCharArray();
        char[] numArr2 = num2.toCharArray();
        long n1 = shiftToInt(numArr1);
        long n2 = shiftToInt(numArr2);
        System.out.println(n1 * n2);

    }

    //定义一个将字符类型的数字转变成整数类型的方法
    public static long shiftToInt(char[] chArr) {
        long num = 0;
        for (int i = 0; i <= chArr.length - 1; i++) {
            int temp = 1;//temp是为了获取10的N次方
            for (int j = 0; j < chArr.length - 1 - i; j++) {
                temp = temp * 10;
            }
            //System.out.println("temp:"+temp);
            num = num + (chArr[i] - 48) * temp;
            //System.out.println(num);
        }
        return num;
    }
}
