package com.itdr.FirstProject.JDdemo.domain;

public class Product {
    public int id;
    public  String name;
    public int price;
    public  String infor;

    //创建对象的方法
    public static  Product getNew(int id, String name,int price,String infor){
        Product p = new Product();
        p.id=id;
        p.name=name;
        p.price= price;
        p.infor= infor;
        return p;
    }
}
