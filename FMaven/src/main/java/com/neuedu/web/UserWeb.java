package com.neuedu.web;

import com.neuedu.pojo.User;
import com.neuedu.service.IUserService;
import com.neuedu.service.IUserServiceImp;
import com.neuedu.utils.ResultData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LiMingHang
 * @date2019.03.05 13:30.
 */
@WebServlet("/list.do")
public class UserWeb  extends HttpServlet {
    private IUserService userService = new IUserServiceImp();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println(req.getParameter("pageNum"));
       // int pageNum = Integer.parseInt(req.getParameter("pageNum"));
        int pageNum = 1;
       // System.out.println(pageNum);
        int pageSize = 5;
        //List<User> lists = null;
//        String keyword = req.getParameter("keyword");
//
//        if (keyword==null){
//            //获取用户信息
//          lists = userService.getUsers();
//        }else{
//            lists = userService.getUsers(keyword);
//        }

        ResultData result =userService.getUsers(pageNum,pageSize);
        result.setUrl("list.do");
        List<User> users= (List<User>) result.getLists();


       // List<User> lists = userService.getUsers();
        //获取cookie
        Cookie[] cookies = req.getCookies();
        //将cookie存储到map集合中
        Map<String,Cookie> maps =GetCookiesServlet.getCookie(cookies);
        //判断map是否为空，是否存在用户
        if (maps!=null){
            //判断是否存在 正在登录的用户
            if (maps.containsKey("user_uname")&&maps.containsKey("pwd")){
                //在map中查找uname 对应的cookie
                Cookie user_uname=maps.get("user_uname");//获取map集合中，key为uname的value， value存储的值为 ‘key为uname，value为uname的cookie’
                Cookie pwd= maps.get("pwd");//获取map集合中，key为pwd的value， value存储的值为 ‘key为pwd，value为pwd的cookie’

                //获取cookie中的值
                String getuname = user_uname.getValue();
                String getpwd = pwd.getValue();

                if (getuname.equals("xiaohei")&&getpwd.equals("666")){

                    //获取session，
                    HttpSession session = req.getSession();
                    //获取session对象
                    User user = (User) session.getAttribute(user_uname.getName());

                    if (user!=null){
                        req.setAttribute("lists",result);
                        //req.setAttribute("keyword",keyword);
                        req.getRequestDispatcher("WEB-INF/list.jsp").forward(req,resp);
                    }else {
                        HttpSession session1 = req.getSession();
                        User u = userService.getUserByUname(getuname,getpwd);
                        session1.setAttribute("user_uname",u);
                        req.setAttribute("lists",result);
                        req.getRequestDispatcher("WEB-INF/list.jsp").forward(req,resp);
                    }
                }else {
                    //否则，仍然进行login
                    resp.sendRedirect("login.do");
                }
            }else {
                resp.sendRedirect("login.do");
            }
        }else {
            resp.sendRedirect("login.do");
        }



    }
}
