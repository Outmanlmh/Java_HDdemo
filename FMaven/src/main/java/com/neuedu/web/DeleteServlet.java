package com.neuedu.web;

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
 * @date2019.03.06 8:16.
 */
@WebServlet("/delete.do")
public class DeleteServlet extends HttpServlet {
    private IUserService service = new IUserServiceImp();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int id = Integer.parseInt(req.getParameter("id")) ;//将id转换成int型
        service.delete(id);         //调用service方法 删除选中行
        resp.sendRedirect("list.do"); //重定向到 list，显示删除后的数据
    }
}
