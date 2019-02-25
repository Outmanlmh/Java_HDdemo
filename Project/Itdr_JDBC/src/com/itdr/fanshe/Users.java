package com.itdr.fanshe;

/**
 * @author LiMingHang
 * @date2019.02.23 16:22.
 */
public class Users {
    private String name;
    private int password;
    public String nicheng;
    public Users(){
        System.out.println("无参构造方法");
    }
    private Users(String name){
        System.out.println(name +"带参数构造方法!!!!");
    }

//==================================================

    public void showAll(){
        System.out.println("这个方法展示用户所有信息");
    }
    private void show(){
        System.out.println("这个方法展示用户私有信息");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
