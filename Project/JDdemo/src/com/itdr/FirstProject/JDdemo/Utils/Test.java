package com.itdr.FirstProject.JDdemo.Utils;

import com.itdr.FirstProject.JDdemo.domain.Product;
import com.itdr.FirstProject.JDdemo.service.user_mo.Regist.Register;
import com.itdr.FirstProject.JDdemo.controller.PBUtils;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //需要进行初始化的一些东西
        //1.存储用户数据的数组
        String[][] account = new String[3][2];
        //键盘录入
        Scanner sc = new Scanner(System.in);

        //初始化货架
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
        //程序的主入口
        while (true) {
            PBUtils.welcome();
            //选择功能
            int xz = sc.nextInt();
            //登录的过程
            if (xz == 1) {
                System.out.println("请输入已注册账户：");
                String uname = sc.next();
                System.out.println("请输入密码：");
                String upassword = sc.next();

                String name = "lmh";
                String pwd = "666666";
                if (uname.equals("lmh")){
                    if (upassword.equals("666666")){
                        System.out.println("随便挑，随便选！！！！");
                        break;
                    }else{
                        System.out.println("好好想想哪错了！！！！");
                    }
                }
            }
            //注册的过程
            if (xz == 2) {
                //接收账户和密码
                System.out.println("请输入注册账户：");
                String uname = sc.next();
                System.out.println("请输入注册密码：");
                String upassword = sc.next();

                int xz2 = 1;
                while (xz2 == 1) {
                    boolean flag = Register.regustery(uname, upassword, account);
                    //如果注册失败，就让用户选择重新注册还是退出程序
                    if (!flag) {
                        System.out.println("请选择功能：");
                        System.out.println("1.继续注册");
                        System.out.println("2.退出程序");
                        //接收用户在这里的选择
                        xz2 = sc.nextInt();
                        if (xz2 == 2) {
                            return;
                        }else {
                            break;
                        }
                    }break;
                }

            } if(xz==3){
                for(int i=0;i<pro.length;i++){
                    System.out.println("商品ID："+pro[i].id);
                    System.out.println("商品名称："+pro[i].name);
                    System.out.println("商品价格："+pro[i].price);
                    System.out.println("商品详情："+pro[i].infor);
                }
            }

        }

    }
}
