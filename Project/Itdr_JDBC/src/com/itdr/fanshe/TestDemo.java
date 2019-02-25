package com.itdr.fanshe;

import org.junit.Test;

/**
 * @author LiMingHang
 * @date2019.02.23 16:25.
 */
public class TestDemo {
    @Test
    public void test1() throws Exception {
    //使用反射创建一个对象,并获取对象的私有方法  或 属性
        Class aClass  = Class.forName("com.itdr.fanshe.TestDemo");
        Users  users= (Users) aClass.newInstance();



    }
}
