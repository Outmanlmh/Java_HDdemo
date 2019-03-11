package com.neuedu.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LiMingHang
 * @date2019.03.10 11:00.
 */
@WebServlet("/add.do")
public class addservlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //转发，服务器跳转
       req.getRequestDispatcher("WEB-INF/add.jsp").forward(req,resp);
    }
}
