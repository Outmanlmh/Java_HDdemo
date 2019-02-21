package com.itdr.data;




import com.itdr.domain.Car;
import com.itdr.domain.Order;
import com.itdr.domain.Product;
import com.itdr.domain.User;

import java.io.File;
import java.util.ArrayList;

/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */
public class CommonDataImp implements CommonData {

    //初始化用户数据库的方法
    @Override
    public User[] getUserDataSZ() {
        return new User[0];
    }

    @Override
    public ArrayList<User> getUserDataJH() {
        ArrayList<User> uli = new ArrayList<>();
        User cju = new User();
        cju.setUname("ceshi");
        cju.setUpassword("123");
        uli.add(cju);
        return uli;
    }

    @Override
    public File getUserDataF() {
        return null;
    }

    //初始化商品数据库
    @Override
    public Product[] getProductDataSZ() {
        Product[] p = new Product[5];

        Product pro = new Product();
        pro.setId(1001);
        pro.setPname("banana");
        pro.setPrice(10);
        pro.setXq("banana is delicious");
        p[0] = pro;
        Product pro1 = new Product();
        pro1.setId(1002);
        pro1.setPname("apple");
        pro1.setPrice(100);
        pro1.setXq("apple is delicious");
        p[1] = pro1;
        return p;
    }

    @Override
    public ArrayList<Product> getProductDataJH() {
        return null;
    }

    @Override
    public File getProductDataF() {
        return null;
    }


    //初始化购物车数据库
    @Override
    public Car[] getCarDataSZ() {
        return new Car[0];
    }

    @Override
    public ArrayList<Car> getCarDataJH() {
        ArrayList<Car> list = new ArrayList<>();
        return list;
    }

    @Override
    public File getCarDataF() {
        return null;
    }

    //初始化订单数据库
    @Override
    public Order[] getOrderDataSZ() {
        return new Order[0];
    }

    @Override
    public ArrayList<Order> getOrderDataJH() {
        return null;
    }

    @Override
    public File getOrderDataF() {
        return null;
    }

    //===========================================
    @Override
    public <T> T get(T t) {
        return null;
    }


    public static void main(String[] args) {

    }
}
