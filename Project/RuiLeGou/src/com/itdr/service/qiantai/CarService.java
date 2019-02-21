package com.itdr.service.qiantai;

import com.itdr.common.Pub;

public interface CarService {

    //把一个商品加入购物车
    Pub addProduct(String uname, int pid,int pnum);
}
