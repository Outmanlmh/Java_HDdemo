package com.itdr.FirstProject.Java_IO;

import java.io.Serializable;

/**
 * @author LiMingHang
 * @date2019.01.14 19:08.
 */
public class Student  implements Serializable {
    private static final long serialVersionUID = 5701053246641527513L;
    private  String name;

    private  int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Student(){

    }
    public void show() {
        System.out.println("Demo_student{" +
                "name='" + name + '\'' +

                ", age=" + age );

    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
