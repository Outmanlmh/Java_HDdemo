package com.itdr.data;


import com.itdr.domain.Product;

import java.util.ArrayList;

/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */
public class ProductDataImp implements ProductData {

    //
    private Product[] p = new CommonDataImp().getProductDataSZ();

    @Override
    public ArrayList<Product> selectAll() {
        ArrayList<Product> li = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            li.add(p[i]);
        }
        return li;
    }

    @Override
    public Product selectOne(int pid) {
        for (Product product : p) {
            //使用增强for会出现空的问题
            if (product != null) {
                if (pid == product.getId()) {
                    return product;
                }
            }
        }
        return null;
    }

    @Override
    public Product searchOne(String str) {
        Product pro = new Product();
        for (Product product : p) {
            if (p != null) {
                pro = product;
                return pro;
            }
        }
        return pro;
    }

    @Override
    public ArrayList<Product> selectMore(String str) {
        ArrayList<Product> li = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            if (p[i] != null) {
                if (p[i].getPname().contains(str)) {
                    li.add(p[i]);
                }
            }
        }
        return li;
    }
}
