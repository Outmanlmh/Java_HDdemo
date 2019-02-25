package com.itdr.Test;

import java.sql.*;

/**
 * @author LiMingHang
 * @date2019.02.18 9:36.
 */
public class Test01 {
    public static void main(String[] args) {

/*
        String url = "jdbc:mysql://localhost:3306/dbrlg";
        String user = "root";
        String password = "root";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //建立连接
            connection = DriverManager.getConnection(url, user, password);

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
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
*/

        //创建变量
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String url = "jdbc:mysql://localhost:3306/rlgdb";
        String user = "root";
        String password = "root";
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.建立连接
            DriverManager.getConnection(url, user, password);
            statement = con.createStatement();
            //执行sql语句
            String sql = "select * from user";
            //返回结果集
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") +
                        resultSet.getString("uname") +
                        resultSet.getString("password"));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //进行非空判断

            try {
                if (resultSet != null) {
                    resultSet.close();
                }

                if (statement!=null){
                    statement.close();
                }
                if (con!=null){
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        //3.创建对象
        //4.执行sql语句
        //5.返回结果集


    }
}
