package com.neuedu.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;

/**
 * @author LiMingHang
 * @date2019.03.07 9:01.
 */
@MultipartConfig
@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/load.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取文件
        Part part = req.getPart("file");
        //判断打开的文件类型
        String filesuf =  part.getSubmittedFileName().substring(part.getSubmittedFileName().lastIndexOf("."));
       if (filesuf.equals(".zip")){
           //创建一个文件
           File file = new File("E:\\test\\" + part.getSubmittedFileName());
           //创建文件输入流,读出数据
           InputStream is = part.getInputStream();
           //创建文件输出流，写入数据
           OutputStream os = new FileOutputStream(file);
           //创建数组，存储数据
           byte[] b = new byte[1024];
           int result = is.read(b);
           //判断是否读完
           while (result != -1) {
               os.write(b);
               result = is.read(b);
           }
           os.close();
           is.close();

       }


    }
}
