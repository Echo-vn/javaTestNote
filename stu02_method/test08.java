package com.itheima.stu02_method;

/*
需求：定义一个方法copyOfRange(int arr[], int from, int to)
功能：将数组arr中从索引from（包含from）开始，到索引to（不包含to）结束的元素复制到新的数组中，
并将新数组返回
 */
public class test08 {
    public static void main(String[] args) {
        int[] arr={12,34,56,78,43,38,45,57,78,324,234,75};
        //System.out.println(copyOfRange(arr,4,9));   //又忘记了，直接sout数组时输出的是它的地址值
        int[] newArr=copyOfRange(arr,3,9);
        //快捷键创建一个for循环模板------>newArr.fori
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+"\t");
        }
    }

    public static int[] copyOfRange (int arr[],int from,int to){
        int[] newArr=new int[to-from];

        int index=0;//伪造索引的思想

        for(int i=from;i<to;i++){
            newArr[index]=arr[i];
            index++;
        }
        return newArr;//返回时直接写数组名
    }
}
