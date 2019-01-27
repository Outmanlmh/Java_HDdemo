package com.itdr.FirstProject.JDdemo.service.user_mo.Regist;

import com.itdr.FirstProject.JDdemo.datebase.CommonData;
import com.itdr.FirstProject.JDdemo.domain.User;

import java.util.Scanner;

public class Regist {

    public static User[] user;

    public static void regist() {
        boolean flag = false;
        while (true) {
            //用户数组
            user = CommonData.getUser();
            User u = new User();
            //键盘录入功能
            Scanner sc = new Scanner(System.in);
            //获取用户名和密码
            System.out.println("请输入账户");
            String uname = sc.next();
            System.out.println("请输入密码");
            String upwd = sc.next();
            System.out.println("请确认密码");
            String rupwd = sc.next();
            if (rupwd.equals(upwd)) {
                for (int i = 0; i < user.length; i++) {
                    if (user[i] != null && uname.equals(user[i].getName())) {
                        System.out.println("用户名已存在！");
                        break;
                    } else if (i == user.length - 1 && user[i] != null) {
                        System.out.println("注册帐户已经超过网站负载量，无法注册新账户！");
                        return;
                    } else if(user[i]==null){
                        u.setName(uname);
                        u.setPwd(upwd);
                        CommonData.regist(u);
                        System.out.println("注册成功！");
                        return;
                    }
                }
            } else {
                System.out.println("两次密码不一致，请重新输入");
            }
        }
    }
}
