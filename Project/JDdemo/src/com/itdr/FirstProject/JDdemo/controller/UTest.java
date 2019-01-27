package com.itdr.FirstProject.JDdemo.controller;

import com.itdr.FirstProject.JDdemo.datebase.CommonData;
import com.itdr.FirstProject.JDdemo.domain.Order;
import com.itdr.FirstProject.JDdemo.domain.ShopCar;
import com.itdr.FirstProject.JDdemo.domain.User;
import com.itdr.FirstProject.JDdemo.service.product_mo.Buy_pro;
import com.itdr.FirstProject.JDdemo.service.product_mo.Product_init;
import com.itdr.FirstProject.JDdemo.service.user_mo.Login.Login;
import com.itdr.FirstProject.JDdemo.domain.Product;
import com.itdr.FirstProject.JDdemo.service.user_mo.Regist.Regist;

import java.util.Scanner;

public class UTest {
    public static User[] user;
    public static Product[] product;
    public static ShopCar[] shopCar;
    public static Order[] order;

    static {
        //需要进行初始化的一些东西
        //提供用户的数组
        user = CommonData.getUser();
        User u = new User();

        //提供订单数据库
        order = CommonData.getOrder();
    }

    public static void main(String[] args) {
        //键盘录入功能实现
        Scanner sc = new Scanner(System.in);
        //程序的主入口
        while (true) {
            //欢迎界面
            PBUtils.welcome();

            //选择功能
            int xz = sc.nextInt();

            //登录的过程
            if (xz == 1) {
                Login.login();
            }
            //注册的过程
            if (xz == 2) {
                Regist.regist();
            } //查看店铺商品
            if (xz == 3) {
                //商品初始化
                Product_init.product();
            }
            //购买商品的过程
            if (xz == 4) {
                Buy_pro.buy_pro();
            }
            //管理员登陆

            //离开店铺
            if (xz == 0) {
                System.out.println("欢迎下次光临");
            }
        }

    }
}
