package com.itdr.FirstProject.Test;

import java.time.Year;
import java.util.Scanner;

public class Test00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("素数：" + isprime());

        /*//1,1,2,3,5,8,13,21....
        //输入要查看第几个月的兔子
        System.out.println("请输入要查看的月");
        int num = sc.nextInt();
        System.out.println("第"+num+"月有"+ getnum(num)+"对兔子");*/

    }

    /*    //计算兔子的个数
        public static int getnum(int num) {
            int[] arr = new int[30];
            int i = 0;
            for (; i <num; i++) {
                arr[0] = arr[1] = 1;
                if (i >= 2) {
                    arr[i] = arr[i - 1] + arr[i - 2];
                }

            } return arr[num-1];
        }*/
    //=======================2=============================
    //判断是否为素数
    public static int isprime() {
        int count = 0;
        int num = 0;
        for (int i = 101; i <= 200; i++) { //被除数
            for (int j = 2; j < i; j++) {//除数
                if (i % j != 0) {
                    count++;
                }
            }
//            if (count==i-1){
//                System.out.println(i);
//            }
        }
        return num;
    }

}
