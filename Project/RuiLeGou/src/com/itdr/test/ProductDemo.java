package com.itdr.test;


import com.itdr.common.Pub;
import com.itdr.controller.qiantai.ProductController;
import com.itdr.domain.Product;

import java.util.*;


/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */
public class ProductDemo {
    private static ProductController pc = new ProductController();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     /*   //查询所有商品
        System.out.println(pc.showAll());
        System.out.println("===========================");

        //查询一个商品
        System.out.println("请输入要查看的商品编号");

        System.out.println(pc.showOne(sc.nextInt()));*/
        //模糊搜索商品
  /*      Set<Map.Entry<ArrayList<Product>,Integer>> s  = pc.selectMore(sc.next()).getMap().entrySet();
        for (Map.Entry<ArrayList<Product>,Integer> entry : s){
             for (Product o:entry.getKey()) {
                 System.out.println("数据："+o);
            }
            System.out.println("状态码："+entry.getValue());

        }
*/

       Pub p =pc.selectMore(sc.next());
        if (p.getTock()==Pub.SUCCESS_CODE){
            ArrayList<Product> li = (ArrayList<Product>) p.getT();
            for (Product product : li) {
                System.out.println("数据：" + product);
                System.out.println("状态码：" + p.getTock());
            }
        }
        if (p.getTock()==Pub.FAIL_CODE){
            String s = (String) p.getT();
            System.out.println("数据：" + s);
            System.out.println("状态码：" + p.getTock());
        }

     


    }
}
