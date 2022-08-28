package com.itheima.stu07_stringComprehensive;
/*
给定两个字符串，str1和str2。
str1的旋转操作就是将str1最左边的字符移动到最右边。（eg：str1="abcde",旋转一次就是"bcdea"）
如果在若干次旋转后，sre1能变成sre2，那么返回true，如果匹配不成功，返回false。
 */
public class Test02Case1 {
    public static void main(String[] args) {
        String str1="abcde";
        String str2="cdeab";
        System.out.println(check(str1, str2));
    }

    private static boolean check(String str1, String str2) {
        boolean result;
        for (int i = 0; i < str1.length(); i++) {
            str1 = rotateStr(str1);
            result= str2.equals(str1);
            if(result){
                return true;
            }
        }
        return false;
    }

    //定义一个旋转字符串的方法
    public static String rotateStr(String str){
        char head=str.charAt(0);//截取第一个字符
        String tail=str.substring(1);//从第二个字符到最后一个字符
        return tail+head;

    }
}
