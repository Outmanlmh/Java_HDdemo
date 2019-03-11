package com.itdr.FirstProject.Java_xiancheng;

import com.itdr.FirstProject.Java_IO.Test04;

/**
 * @author LiMingHang
 * @date2019.01.30 9:28.
 */
public class Test05 {
    public static void main(String[] args) {
        Test04 test04 = new Test04();
        test04.setName("第一个线程");
        test04.start();
    }
}
