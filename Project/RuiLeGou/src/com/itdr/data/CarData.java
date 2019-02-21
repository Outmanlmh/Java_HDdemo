package com.itdr.data;

import com.itdr.domain.Car;

import java.util.ArrayList;

public interface CarData {

    //获取所有的购物车信息
    ArrayList<Car> selectALL();

    //获取该用户的所有购物车信息
    ArrayList<Car> selectALLByUname(String uname);

    boolean addOne(Car car);
}
