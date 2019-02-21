package com.itdr.service.qiantai;

import com.itdr.common.Pub;
import com.itdr.data.CarData;
import com.itdr.data.CarDataImp;
import com.itdr.domain.Car;
import com.itdr.domain.Product;

import java.util.ArrayList;

/**
 * @author LiMingHang
 * @date2019.02.20 8:17.
 */
public class CarServiceImp implements CarService {

private CarData cd = new CarDataImp();

//商品业务层
    private ProductService ps = new ProductServiceImp();


    /* 这里不用判断数据是否存在，因为数据可以重复，
           如果用户已经添加该商品， 不是覆盖原有商品，而是把他的数量 + 1；这个过程不是在购物车页面执行
           分析之后，如果商品信息存在，就在存在的信息上改数量即可
           如果不存在，才真正的像数据库中增加一条新的商品数据
           */
    //把一个商品加入购物车
    @Override
    public Pub addProduct(String uname, int pid,int pnum) {
        //所有用到参数的地方，为了稳妥起见，都要做非空判断；
        Pub p = null;
        if (uname == null || pid<0 || uname.equals("")||uname.equals("null")){
        p = Pub.fail("参数不能为空");
        return  p;
        }
        //这里要先去看有没有这条数据，有就不需要创建对象
        //先获取到购物车数据库去比对
        //遍历购物车数据库，已经存在该商品，在原有的数量上增加pnum
       ArrayList<Car>  li = cd.selectALLByUname(uname);
        for (Car car : li) {
            if (car.getPid() ==pid){
                car.setPnum(car.getPnum()+pnum);
                p = Pub.success("添加成功");
                return p;
            }
        }
        //不存在该商品数据，就创建一条新的购物数据进去。
        Car car = new Car();

        car.setUname(uname); //设置用户名

        car.setPnum(pnum); //设置购物数量
        car.setPid(pid);//设置商品id
        /*问题
        * 1.购物车类缺少一个成员变量，就是该条购物数据的总价
        * 2.拿到商品数据，就要根据一个商品的id去商品数据库中找到这个商品
        * */
        Product pro = ps.showOne(pid);

        car.setPrice(pro.getPrice()); //设置单价
        car.setNprice(car.getPnum()*car.getPrice());//设置总价，必须在设置单价，设置数量之后
        boolean flag=cd.addOne(car);
        return null;
    }
}
