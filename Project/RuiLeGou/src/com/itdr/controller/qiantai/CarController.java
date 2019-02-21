package com.itdr.controller.qiantai;

import com.itdr.common.Pub;
import com.itdr.service.qiantai.CarService;
import com.itdr.service.qiantai.CarServiceImp;

/**
 * @author LiMingHang
 * @date2019.02.20 8:11.
 */
public class CarController {
    private CarService cs = new CarServiceImp();

    //购物车可能出现的请求

    //把一个商品加入购物车,参数：用户账号，商品id，商品数量

    public  Pub addProduct(String uname,int pid,int pnum){
        Pub p = cs.addProduct(uname,pid,pnum);
        return p;
    }

    //查看购物车


}
