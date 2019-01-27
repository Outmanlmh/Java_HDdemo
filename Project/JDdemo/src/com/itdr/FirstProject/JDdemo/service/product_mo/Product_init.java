package com.itdr.FirstProject.JDdemo.service.product_mo;

import com.itdr.FirstProject.JDdemo.datebase.CommonData;
import com.itdr.FirstProject.JDdemo.domain.Product;

/**
 * @author LiMingHang
 * @date2019.01.19 9:32.
 */
public class Product_init {
    public  static  Product[]  product;

    public  static  void product(){
        // 提供商品的数组
        product = CommonData.getProduct();
        //初始化商品
        Product p1 = new Product(1001, "苹果", 20, "好吃");
        Product p2 = new Product(1002, "香蕉", 21, "很好吃");
        Product p3 = new Product(1003, "大鸭梨", 22, "非常好吃");
        Product p4 = new Product(1004, "西瓜", 23, "真的非常好吃");
        Product p5 = new Product(1005, "菠萝", 23, "真的真的非常好吃");
        //商品显示
        System.out.println("小明水果店商品");
        for (int i = 0; i < product.length; i++) {
            product[0] = p1;
            product[1] = p2;
            product[2] = p3;
            product[3] = p4;
            product[4] = p5;
            System.out.println(product[i]);
        }
    }
}
