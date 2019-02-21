package com.itdr.data;

import com.itdr.domain.Car;

import java.util.ArrayList;

/**
 * @author LiMingHang
 * @date2019.02.20 8:30.
 */
public class CarDataImp implements CarData {
    //导入数据库
    private  CommonData cd= new CommonDataImp();

    //获取所有购物车信息
    @Override
    public ArrayList<Car> selectALL() {
        return null;
    }

    //获取获取该用户的所有购物车信息
    @Override
    public ArrayList<Car> selectALLByUname(String uname) {
        //创建一个集合，接受符合要求的数据
        ArrayList<Car> li =new ArrayList<>();
        //通过公共的数据库模型类，获取到购物车数据库，并对它遍历
        for (Car car : cd.getCarDataJH()) {
            //非空判断，保证从购物车数据库中拿出的数据不会出现空指针异常
            if (car != null){
                //当拿出的数据跟我传参过来的用户名相同时，说明是该用户的购物信息
                if (car.getUname().contains(uname)){
                    //将符合要求的购物信息放到一开始准备的集合里。
                    li.add(car);
                }
            }
        }
        return li;
    }

    @Override
    public boolean addOne(Car car) {
        cd.getCarDataJH();
        return false;
    }
}
