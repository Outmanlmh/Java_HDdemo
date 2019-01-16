package com.itdr.FirstProject.JDdemo.domain;

import java.util.Arrays;

/**
 * @author LiMingHang
 * @date2019.01.15 17:45.
 */
//订单数据库
public class Order {
    //序号
    private int id;
    //用户账号
    private String uname;
    //订单号
    private String oid;
    //购物详情
    private ShopCar[] shopCars;
    //购物总价
    private  double numprice;
    //日期
    private  String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public ShopCar[] getShopCars() {
        return shopCars;
    }

    public void setShopCars(ShopCar[] shopCars) {
        this.shopCars = shopCars;
    }

    public double getNumprice() {
        return numprice;
    }

    public void setNumprice(double numprice) {
        this.numprice = numprice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", oid='" + oid + '\'' +
                ", shopCars=" + Arrays.toString(shopCars) +
                ", numprice=" + numprice +
                ", date='" + date + '\'' +
                '}';
    }
}
