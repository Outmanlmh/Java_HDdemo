package com.itdr.FirstProject.JDdemo.service.user_mo.Login;


import com.itdr.FirstProject.JDdemo.datebase.CommonData;
import com.itdr.FirstProject.JDdemo.domain.User;


import java.util.Scanner;

public class Login {
    public static User[] user;

    static {
        //提供用户的数组
        user = CommonData.getUser();
        User u = new User();
    }

    //用户登录
    public static void login() {
        while (true) {
            //键盘录入功能
            Scanner sc = new Scanner(System.in);
            //获取用户名和密码
            System.out.println("请输入账户");
            String uname = sc.next();
            System.out.println("请输入密码");
            String upwd = sc.next();
            //到数据库中看是否有这个对象
            CommonData.login(uname,upwd);
            return;
        }

    }

}
