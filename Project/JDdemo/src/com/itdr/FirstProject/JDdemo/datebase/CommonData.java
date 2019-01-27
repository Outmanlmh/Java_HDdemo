package com.itdr.FirstProject.JDdemo.datebase;

import com.itdr.FirstProject.JDdemo.domain.Order;
import com.itdr.FirstProject.JDdemo.domain.Product;
import com.itdr.FirstProject.JDdemo.domain.User;
import com.itdr.FirstProject.JDdemo.domain.ShopCar;

/**
 * @author LiMingHang
 * @date2019.01.15 17:29.
 */
public class CommonData {
 public static    int index = 0;
 public static    User[] users=new User[2];
    //提供用户数据库
    public static User[] getUser(){

        return users;
    }
    //提供商品数据库
    public static Product[] getProduct(){
        Product[] products=new Product[5];
        return products;
    }
    //提供购物车数据库
    public static ShopCar[] getShopCar(){
        ShopCar[] shopCars=new ShopCar[2];
        return shopCars;
    }
    //提供订单数据库
    public static Order[] getOrder(){
        Order[] orders=new Order[10];
        return orders;
    }
    public static void regist(User user){
        users[index] = user;
        index++;
    }
    public static void  login(String uname, String upwd){
        for (int i = 0; i < users.length; i++) {
            System.out.println("登录"+users[i]);
            if (users[i] != null &&(uname.equals(users[i].getName())&&upwd.equals(users[i].getPwd())) ) {
                System.out.println("登录成功");
                return;
            } else {
                System.out.println("用户名或密码错误请重新输入！");
                break;
            }
        }

    }
}
