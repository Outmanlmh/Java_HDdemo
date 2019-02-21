package com.itdr.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author LiMingHang
 * @date2019.02.18 15:21.
 */
public class JDBCUtil02 {
   private static String driverClass = null;
   private static String url = "jdbc:mysql://localhost:3306/dbrlg";
   private static String user = "root";
   private static String password = "root";

   //静态代码块，类加载的时候加载
    static {
       //创建一个属性配置对象
       Properties properties = new Properties();
       //通过获取到项目文件的输入字节流，完成文件加载
       InputStream resourceAsStream = JDBCUtil02.class.getClassLoader().getResourceAsStream("jdbc.properties");

       try {

            //加载文件到properties对象
            properties.load(resourceAsStream);
            //调用properties对象的方法，通过键获取到对应的值
            driverClass = properties.getProperty("driverClass");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            //驱动加载
           Class.forName(driverClass);
            //创建连接
           DriverManager.getConnection(url, user, password);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }

    public static Connection getconn() {
        Connection conn = null;

        try {
            Class.forName(driverClass);

          conn=  DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    public static void clossAll(Connection conn, PreparedStatement ps, ResultSet rs) {

        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
