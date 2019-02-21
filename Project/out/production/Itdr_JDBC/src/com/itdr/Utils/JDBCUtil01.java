package com.itdr.Utils;

import java.sql.*;

/**
 * @author LiMingHang
 * @date2019.02.18 13:52.
 */
public class JDBCUtil01 {

    public static void main(String[] args) {


        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {


            //建立对象
            statement = connection.createStatement();
            //执行sql语句
            String sql = "select * from user";
            //处理结果
            resultSet = statement.executeQuery(sql);
            //释放资源（关闭连接）

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
    }

    public static Connection getCon() {
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/dbrlg";
        String user = "root";
        String password = "root";
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //建立连接
            connection= DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeALL(Connection conn, PreparedStatement ps, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (ps != null) {
                    try {
                        ps.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } finally {
                        if (conn != null) {
                            try {
                                conn.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }

    public static void closeALL(Connection conn, PreparedStatement ps) {
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeALL(Connection conn, Statement st, ResultSet rs) {

    }
}