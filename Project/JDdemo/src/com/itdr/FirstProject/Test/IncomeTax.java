package com.itdr.FirstProject.Test;

import java.util.Scanner;

/**
 * @author LiMingHang
 * @date2019.02.12 15:32.
 */
public class IncomeTax extends Employee {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入员工的姓名：");
       String name = sc.next();
        System.out.println("请输入员工工资：");
       double salary = sc.nextInt();
        System.out.println("请输入员工加班补贴：");
       double subsidy = sc.nextInt();
        compute(name,salary,subsidy);
    }

    public  static  void compute(String name,double salary , double subsidy){

        double form = salary+subsidy;
        double tax = 0 ;
       if (form<=500){
           tax = form * 0.05;
       }else if (form<=2000){
           tax = form * 0.1;
       }else if (form <=5000){
           tax = form * 0.15;
       }else if (form<=20000){
           tax  = form * 0.2;
       }else {
           tax  = form * 0.3;
       }
        double later = form - tax;
        System.out.println("员工"+name+"的税前收入为"+form+"元，"+"税后收入为"+later+"元，"+"您缴纳的个人所得税为"+tax+"元");

    }
}
