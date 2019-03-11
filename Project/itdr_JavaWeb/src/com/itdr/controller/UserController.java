package com.itdr.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LiMingHang
 * @date2019.02.25 18:17.
 */
@WebServlet("/userController")
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //获取用户名和密码数据
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        login(uname,pwd);
    }

    private void login(String uname, String pwd) {
        System.out.println("获取控制层参数"+uname+"  "+ pwd);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req, resp);
    }


}
