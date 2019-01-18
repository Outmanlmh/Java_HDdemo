package com.itdr.FirstProject.Test.Demo_extend;

/**
 * @author LiMingHang
 * @date2019.01.17 8:46.
 */
public class Demo_extend {
    public static void main(String[] args) {
        //创建对象
        Animal a = new Dog();
        a.num = 100;
        System.out.println("1"+a.num);
        //a.num2 = 200;
        System.out.println(a.num2);
        System.out.println("--------------");
        a.show();
        a.method();
    }
}
