package com.neuedu.web;


import com.neuedu.pojo.User;
import com.neuedu.service.IUserService;
import com.neuedu.service.IUserServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LiMingHang
 * @date2019.03.05 23:17.
 */
@WebServlet("/doAdd.do")
public class DoAddServlet extends HttpServlet {
    private IUserService service = new IUserServiceImp();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取参数
        String uname = req.getParameter("uname");
        String password = req.getParameter("password");
        String tele = req.getParameter("tele");
        int sex =Integer.parseInt(req.getParameter("sex")) ;
        //System.out.println(req.getParameter("sex"));
        //创建对象，设置参数
        User user = new User();
        user.setUname(uname);
        user.setPassword(password);
        user.setTele(tele);
        user.setSex(sex);
        //重定向，浏览器；访问list.do 显示新数据
        service.insert(user);
        resp.sendRedirect("list.do");

    }
}
