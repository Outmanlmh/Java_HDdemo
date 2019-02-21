package com.itdr;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author LiMingHang
 * @date2019.02.21 11:33.
 */
public class LoginServlet extends HttpServlet {

    protected  void doPost(){
        System.out.println("get请求");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response){

        System.out.println("前台的数据请求！");
        String s = request.getParameter("name");
        System.out.println("获取到的参数是"+s);

        ServletConfig config = getServletConfig();
        ServletContext sc = config.getServletContext();



    }

}
