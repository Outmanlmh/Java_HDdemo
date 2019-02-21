package com.itdr.service.qiantai;


import com.itdr.common.Pub;
import com.itdr.domain.Product;

import java.util.ArrayList;

/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */
public interface ProductService {
    //展示所有商品的信息
    ArrayList<Product> showAll();

    //展示一个商品的信息
    Product showOne(int i);

    Product searchOne(String str);

    Pub selectMore(String str);

    //搜索一个商品的信息
    
    

}
