package com.itdr.FirstProject.JDdemo.service.user_mo.Regist;

public class Register {
    public String uname;
    public  String pwd;
    //把整个注册过程抽取成一个注册方法
    public static boolean regustery(String uname, String upassword, String[][] account) {
        //在这里声明一个变量，来判断网站的注册人数是否达到阀值
        boolean flag = false;

        //声明一个变量，用来确定用户是否注册成功
        boolean uflag = false;
        //通过循环遍历，拿到数组中的每一个用户的账号和密码，进行判断
        for (int m = 0; m < account.length; m++) {
            //拿出数组中的账户，进行比较
            if (uname.equals(account[m][0])) {
                System.out.println("注册账号已存在！");break;
            }else{
                //在没有重复账户的情况下，注册成功
                for (int n = 0; n < account.length; n++) {
                    if (account[n][0] == null) {
                        account[n][0] = uname;
                        account[n][1] = upassword;
                        System.out.println("账户注册成功！"+account[n][0]+account[n][1]);
                        uflag = true;
                        break;
                    } else if (n == account.length - 1 && account[n][0] != null) {
                        flag = true;
                    }
                }break;
            }
        }
        //达到阀值的时候，网站就不能再注册新用户了
        if (flag) {
            //如果注册的账户数量已经超过了网站的能够支持的数量，就不再注册了
            System.out.println("注册帐户已经超过网站负载量，无法注册新账户！");
        }
        return uflag;
    }
}