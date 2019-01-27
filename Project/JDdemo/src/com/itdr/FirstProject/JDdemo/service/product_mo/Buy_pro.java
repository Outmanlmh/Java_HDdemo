package com.itdr.FirstProject.JDdemo.service.product_mo;

import com.itdr.FirstProject.JDdemo.datebase.CommonData;
import com.itdr.FirstProject.JDdemo.domain.Product;
import com.itdr.FirstProject.JDdemo.domain.ShopCar;
import com.itdr.FirstProject.JDdemo.domain.User;

import java.util.Scanner;

/**
 * @author LiMingHang
 * @date2019.01.19 9:42.
 */
//难点：获取商品的价格，并计算出总价
public class Buy_pro {
    //购物车数组
  public  static ShopCar[]shopCar;
  public  static User[]users;
  public static Product[] product;
    public  static  void  buy_pro(){
        // 提供购物车的数组
        shopCar = CommonData.getShopCar();
        //提供用户的数组
        users = CommonData.getUser();
        //提供商品的数组
        product = CommonData.getProduct();
        User u = new User();
        u.setName("xiaoming");
        users[0] = u;

        Product p = new Product();
        for (int i = 0; i < shopCar.length; i++) {
            for(int j =1101;j<=1102;j++ ){
                //键盘录入
                Scanner sc= new Scanner(System.in);
                System.out.println("请输入要购买的商品id");
                int pid=sc.nextInt();
                System.out.println("请输入要购买的数量");
                int pnum=sc.nextInt();
                int price = 0;
                ShopCar s= new ShopCar(j,users[0].getName(),pid,pnum,200);
                System.out.println(users[0].getName()+"购买了"+pnum+"个"+pid+"共花费了"+s.getSum());
                return;
            }
        }

    }
}
