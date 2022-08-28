package com.itheima.stu04_faceObject.test02_goods;
//创建三个商品对象，并将它们存入数组中
public class GoodsTest {
    public static void main(String[] args) {
        //1、创建一个数组
        GoodsRole[] goodsArr=new GoodsRole[3];
        //2、创建3个对象
        GoodsRole g1=new GoodsRole("a001","黄瓜",1.5,200);
        GoodsRole g2=new GoodsRole("b001","石榴",5,300);
        GoodsRole g3=new GoodsRole("c001","奥利奥",7,670);
        //3、将商品对象存入数组中
        goodsArr[0]=g1;
        goodsArr[1]=g2;
        goodsArr[2]=g3;
        //4、遍历数组，查看有哪些商品
        for (int i = 0; i < goodsArr.length; i++) {
            System.out.println(
                     "id："+goodsArr[i].getId()+"\t\t"
                    +"name："+goodsArr[i].getName()+"\t\t"
                    +"price："+goodsArr[i].getPrice()+"\t\t"
                    +"inventory："+goodsArr[i].getInventory());//输出数组元素（即创建的对象）的地址值
        }
    }

}
