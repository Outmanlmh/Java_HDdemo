package com.itdr.FirstProject.JDdemo.controller;

import com.itdr.FirstProject.JDdemo.datebase.CommonData;
import com.itdr.FirstProject.JDdemo.domain.Order;
import com.itdr.FirstProject.JDdemo.domain.ShopCar;
import com.itdr.FirstProject.JDdemo.domain.User;
import com.itdr.FirstProject.JDdemo.service.user_mo.Login.Login;
import com.itdr.FirstProject.JDdemo.service.order_mo.Pay.PayTest;
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
        u.setName("xiaoming");
        u.setPwd("123");
        user[0] = u;
        // 提供商品的数组
        product = CommonData.getProduct();
        // 提供购物车的数组
        shopCar = CommonData.getShopCar();
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
                //获取用户名和密码
                System.out.println("请输入账户");
                String uname = sc.next();
                System.out.println("请输入密码");
                String upwd = sc.next();
                //到数据库中看是否有这个对象
                for (int i = 0; i < user.length; i++) {
                    if (user[i] != null && uname.equals(user[i].getName())) {
                        System.out.println("登录成功");
                        xz = 3;
                        break;
                    }
                }
            }
            //注册的过程
            if (xz == 2) {
/*                System.out.println("请输入注册账户：");
                String uname = sc.next();
                System.out.println("请输入注册密码：");
                String upassword = sc.next();
                Regist.GetRegistInfor(uname,upassword);*/


            } //查看店铺商品
            if (xz == 3) {
                System.out.println("店铺商品界面");
              /*  //初始化货架
                Product[] pro = new Product[1];
                System.out.println("请录入商品信息！");
                for(int i= 0;i<pro.length;i++){
                    //获取新商品的过程
                    int id = sc.nextInt();
                    String name = sc.next();
                    int price = sc.nextInt();
                    String infor = sc.next();
                    Product p=  Product.getNew(id,name,price,infor);
                    pro[i]=p;
                }
                for(int i=0;i<pro.length;i++){
                    System.out.println("商品ID："+pro[i].id);
                    System.out.println("商品名称："+pro[i].name);
                    System.out.println("商品价格："+pro[i].price);
                    System.out.println("商品详情："+pro[i].infor);
                }*/
            }
            //购买商品的过程
            if (xz == 4) {
                PayTest.getpay(Regist.GetRegistInfor("lmh", "123").getUname(), Regist.GetRegistInfor("lmh", "123").getUpassword());
            }
            //管理员登陆

            //离开店铺
        }

    }
}
