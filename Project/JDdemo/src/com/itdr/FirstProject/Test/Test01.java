package com.itdr.FirstProject.Test;

/**
 * @author LiMingHang
 * @date2019.02.12 13:06.
 */
public class Test01 {


    public static void main(String[] args) {
        int count = 0;    //定义水仙花数的个数
        for (int i = 100; i <= 999; i++) { //水仙花数范围
            int b = i / 100;    //取得百位数
            //int s = (i-100*b)/10;    //取得十位数
            int s = i % 100 / 10;
            int g = i % 10;
            //int g = (i-s*10-b*100);    //取得个位数

            if (i == g * g * g + s * s * s + b * b * b) { //水仙花数判定
                System.out.print(i + " ");  //输出符合条件的数
                count++;
            }
        }
        System.out.println();    //换行
        System.out.println("水仙花数总共有" + count + "个");  //输出水仙花数的总数

    }
}
