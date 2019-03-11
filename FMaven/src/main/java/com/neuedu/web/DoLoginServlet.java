package com.neuedu.web;

import com.neuedu.pojo.User;
import com.neuedu.service.IUserService;
import com.neuedu.service.IUserServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LiMingHang
 * @date2019.03.06 21:03.
 */
@WebServlet("/dologin.do")
public class DoLoginServlet extends HttpServlet {
    private IUserService service = new IUserServiceImp();
    /*
    * 如果用户处于登录状态，跳转list页面
    * 如果用户处于非登录状态，不能跳转页面，仍停留在login.jsp
    * */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取输入的用户名和密码
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        //在数据库中查找相应的用户
        User user = service.getUserByUname(uname, pwd);

        //创建cookie，将用户信息存入cookie中
        Cookie cookie = new Cookie("user_uname", user.getUname());// key为uname的cookie
        cookie.setMaxAge(60 * 60 * 24 * 7);
        Cookie cookie1 = new Cookie("pwd", user.getPassword());//key为pwd的cookie
        cookie1.setMaxAge(60 * 60 * 24 * 7);
        //将cookie添加到浏览器中
        resp.addCookie(cookie);
        resp.addCookie(cookie1);

        //向session中存储数据
        req.getSession().setAttribute("user_uname",user);
        //浏览器重定向
        resp.sendRedirect("list.do");

    }
}
