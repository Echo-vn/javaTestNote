package com.itheima.stu01_basicNotes;
/*键盘输入两个整数，如果其中一个数字为6，结果输出为true；
  如果它们的和为6的倍数，结果为true
  其余情况输出为false
 */
import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        boolean result = num1 == 6 || num2==6 || (num1 + num2) % 6 == 0;
        System.out.println(result);
    }

}
