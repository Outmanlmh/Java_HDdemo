package com.itdr.FirstProject.Test;

import java.util.Scanner;

/**
 * @author LiMingHang
 * @date2019.01.11 15:09.
 */

//模拟食堂打饭的整个过程
public class PayRice {
    public static void main(String[] args) {
        while (true) {
            System.out.println("请选择需要的套餐");
            System.out.println("1.炸酱面+鲜榨橙汁");
            System.out.println("2.汉堡+薯条+小杯可乐");
            System.out.println("3.蛋炒饭+蛋花汤");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("你已选择1号套餐，是否确定购买 1.是 2.否");
                    int tab = sc.nextInt();
                    if (tab == 1) {
                        System.out.println("本次消费10元,欢迎下次光临");
                        return;
                    }
                    break;
                case 2:
                    System.out.println("你已选择2号套餐，是否确定购买 1.是 2.否");
                    int tab2 = sc.nextInt();
                    if (tab2 == 1) {
                        System.out.println("本次消费22元,欢迎下次光临");
                        return;
                    }
                    break;
                case 3:
                    System.out.println("你已选择3号套餐，是否确定购买 1.是 2.否");
                    int tab3 = sc.nextInt();
                    if (tab3 == 1) {
                        System.out.println("本次消费33元,欢迎下次光临");
                        return;
                    }
                    break;
                default:
                    System.out.println("您的选择有误，请重新选择");
            }
        }
    }
}
