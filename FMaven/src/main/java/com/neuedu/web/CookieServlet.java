package com.neuedu.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LiMingHang
 * @date2019.03.06 20:44.
 */
@WebServlet("/cookie.do")
public class CookieServlet  extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /*
       * Cookie 默认cookie浏览器关闭  存在于内存中
       * 设置cookie存储时间， 持久存储，存在于硬盘中
       * 如果设置cookie时间 小于0 存在于内存中
       *                    等于0   不存cookie
       * */
        Cookie cookie = new Cookie("first","cookietest");
       // cookie.setValue();//修改cookie的内容
       // Cookie cookie1 = new Cookie("first","");//将value设置为null，相当于删除cookie
       // cookie.setMaxAge(0);//相当于删除cookie
        cookie.setMaxAge(60*60*24*7);//设置时间为一周
        resp.addCookie(cookie);
    }
}
