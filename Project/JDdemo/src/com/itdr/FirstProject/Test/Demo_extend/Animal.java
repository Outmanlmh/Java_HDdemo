package com.itdr.FirstProject.Test.Demo_extend;
/**
 * @author LiMingHang
 * @date2019.01.17 8:44.
 */
public abstract class Animal {
    public int num = 10;
    public final int num2 = 20;

    public Animal() {}

    public Animal(String name,int age){}

    public abstract void show();

    public void method() {
        System.out.println("method");
    }
}
