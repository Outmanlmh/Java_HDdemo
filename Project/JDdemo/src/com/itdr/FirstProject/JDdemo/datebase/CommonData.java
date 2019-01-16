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

    //提供用户数据库
    public static User[] getUser(){
        User[] users=new User[10];
        return users;
    }
    //提供商品数据库
    public static Product[] getProduct(){
        Product[] products=new Product[10];
        return products;
    }
    //提供购物车数据库
    public static ShopCar[] getShopCar(){
        ShopCar[] shopCars=new ShopCar[10];
        return shopCars;
    }
    //提供订单数据库
    public static Order[] getOrder(){
        Order[] orders=new Order[10];
        return orders;
    }
}
