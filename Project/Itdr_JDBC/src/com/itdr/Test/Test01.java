package com.itdr.Test;

import java.sql.*;

/**
 * @author LiMingHang
 * @date2019.02.18 9:36.
 */
public class Test01 {
    public static void main(String[] args)  {

         String url="jdbc:mysql://localhost:3306/dbrlg";
         String user = "root";
         String password = "root";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //建立连接
            connection= DriverManager.getConnection(url, user, password);

            //建立对象
          statement = connection.createStatement();
            //执行sql语句
            String sql = "select * from user";
            //处理结果
             resultSet = statement.executeQuery(sql);
            //释放资源（关闭连接）

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }




    }
}
