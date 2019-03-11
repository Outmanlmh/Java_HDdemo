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
 * @date2019.03.06 8:38.
 */
@WebServlet("/update.do")
public class UpdateServlet extends HttpServlet {
    //查id对应的对象
    private IUserService service = new IUserServiceImp();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        User user = service.getUserById(id);
            if (user!=null){
                //向对象容器中设置数据值；
                req.setAttribute("user",user);
                req.getRequestDispatcher("WEB-INF/update.jsp").forward(req,resp);
            }

    }
}
