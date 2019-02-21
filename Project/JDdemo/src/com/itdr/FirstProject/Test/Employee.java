package com.itdr.FirstProject.Test;

/**
 * @author LiMingHang
 * @date2019.02.12 15:30.
 */
public class Employee {
    public String name;
    public int salary;
    public  int subsidy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(int subsidy) {
        this.subsidy = subsidy;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", subsidy=" + subsidy +
                '}';
    }
}
