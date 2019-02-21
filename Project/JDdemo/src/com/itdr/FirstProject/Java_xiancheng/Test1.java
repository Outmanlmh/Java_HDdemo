package com.itdr.FirstProject.Java_xiancheng;

/**
 * @author LiMingHang
 * @date2019.01.29 15:03.
 */
public class Test1 {


    public static void main(String[] args) {

        Test1Demo t1 = new Test1Demo();
        Test1Demo t2 = new Test1Demo();
        Test1Demo t3 = new Test1Demo();


        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
