package com.itdr;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author LiMingHang
 * @date2019.02.21 11:33.
 */
public class LoginServlet extends HttpServlet {
    /*
     * 1.继承httpServlet
     * 2.处理什么样的请求（方式：1.配置xml  2. 加注解 ）
     *
     * */

    /*   protected  void doPost(){
           System.out.println("get请求");
       }
       protected void doGet(HttpServletRequest request, HttpServletResponse response){
           System.out.println("前台的数据请求！");
           String s = request.getParameter("name");
           System.out.println("获取到的参数是"+s);

           ServletConfig config = getServletConfig();
           ServletContext sc = config.getServletContext();
       }*/

    @Override
    public void init(ServletConfig config) throws ServletException {
        config.getServletName();//获取配置文件中设置的servlet-name
        config.getInitParameter("par");//获取init-param
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
         * request----请求对象-----从浏览器带过来的信息
         * response---- 响应对象-----从服务器响应到浏览器的信息-----流
         * 后台*/
        //通过PrintWriter 将字符串响应到页面上
        // String str = "Hello world!";
        // String str2 = "中国好！";
        //resp.setContentType("text/html;charset = utf-8");
        //PrintWriter writer = resp.getWriter();
        //在页面添加一个div
        //writer.print("<div style='width:100px;height:100px;border:solid 1px black'>666<div>");
//        writer.println(str2);

//        req.getScheme();//获取协议
//        req.getContextPath();//获取路径
//        req.getServerName();//服务器名
//        req.getServerPort();//端口号 若端口号为80，则页面地址栏中不需要写端口号
//        req.getRequestURL();
//        req.getRequestURI();
        //req.getScheme()+"://"+req.getContextPath()+"://"+req.getServerName()+"://"+ req.getServerPort();路径
       // resp.getCharacterEncoding();//获取编码集
        /*
        * 重定向 重新找到页面进行显示
        * 重定向以后，地址栏的地址会发生改变
        * 相当于发送两次请求----------会有两个request和respons
        * 相当于浏览器的行为
        * 重定向，可以重定向到外网
        * respons进行的响应
        * 重定向是重定向地址*/
//        resp.sendRedirect("test.jsp");
//        String str = "neuedu world";
        /*
        * 转发--获取转发器  把request 和response对象转交给jsp
        * 发送一次请求
        * request行为
        * 服务器行为
        * 地址栏上的地址不会发生变化
        * 转发 转发的是文件，只能在项目内
        * */
//        req.setAttribute("key",str);
//        req.getRequestDispatcher("test.jsp").forward(req,resp);
       // req.getRequestDispatcher("WEB-INF/web.xml").forward(req,resp);//通过转发，访问到WEB-INF下的文件
        resp.sendRedirect("http://www.baidu.com");

    }
}
