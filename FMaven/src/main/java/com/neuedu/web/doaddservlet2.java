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
 * @date2019.03.10 11:01.
 */
@WebServlet("/doadd.do")
public class doaddservlet2 extends HttpServlet {
    //创建service对象
    private IUserService service = new IUserServiceImp();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取post传来的参数
        String uname = req.getParameter("uname");
        String psd = req.getParameter("password");
        String tele = req.getParameter("tele");
        int sex = Integer.parseInt(req.getParameter("sex"));

        //创建user对象，设置参数
        User user = new User();
        user.setUname(uname);
        user.setPassword(psd);
        user.setTele(tele);
        user.setSex(sex);

        //调用service层的方法
        service.insert(user);
        resp.sendRedirect("list.do");

    }
}
