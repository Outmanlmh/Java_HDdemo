package com.neuedu.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LiMingHang
 * @date2019.03.06 23:05.
 */
@WebServlet("/user/getcookie.do")
public class GetCookiesServlet  extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     Cookie[] cookies =  req.getCookies();
        for (Cookie c:cookies
             ) {
            System.out.println(c.getName() + c.getValue());

        }
    }
    public static Map<String,Cookie>getCookie(Cookie[]cookies){
        Map<String,Cookie>maps = new HashMap<>();
        if (cookies!=null){
            for (Cookie c:cookies
                 ) {
                maps.put(c.getName(),c);
            }
        }
        return maps;
    }
}
