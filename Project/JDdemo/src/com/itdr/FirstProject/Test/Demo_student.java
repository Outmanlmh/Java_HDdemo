package com.itdr.FirstProject.Test;

/**
 * @author LiMingHang
 * @date2019.01.14 19:08.
 */
public class Demo_student {
    private  String name;
    private  String sex;
    private  int age;
    public  static int water=10;
    public  String getName(){
        return this.name;
    }
    public void setName(String cname){
        this.name = cname;
    }
    public Demo_student (){

    }


    public void show() {
        System.out.println("Demo_student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age );

    }

    public  Demo_student(String name){
        this.name = name;
    }
    public static void drink(){
        Demo_student demo_static = new Demo_student();
        System.out.println(demo_static.sex);
    }
}
