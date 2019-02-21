package com.itdr.test;

import com.itdr.controller.qiantai.UserController;
import com.itdr.domain.User;
import com.itdr.utils.JDBCUtil02;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author LiMingHang
 * @date2019.02.18 19:30.
 */
public class TestJUnit {

    @Test
    public void test1(){
        Connection con = JDBCUtil02.getconn();
        System.out.println(con);
    }
    @Test
    public  void test2(){

        UserController us = new UserController();
            String uss="tom";
            User u =us.show(uss);
        if (u!=null){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }


    }
}
